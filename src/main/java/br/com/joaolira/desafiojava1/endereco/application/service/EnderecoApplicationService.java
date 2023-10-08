package br.com.joaolira.desafiojava1.endereco.application.service;

import br.com.joaolira.desafiojava1.cliente.application.repository.ClienteRepository;
import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import br.com.joaolira.desafiojava1.endereco.application.api.EnderecoAPI;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoListResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.application.repository.EnderecoRepository;
import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {
    private final EnderecoRepository enderecoRepository;
    private final ClienteRepository clienteRepository;
    @Override
    public EnderecoResponse criaEndereco(UUID idCliente, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        Endereco endereco = enderecoRepository.salva(new Endereco(cliente, enderecoRequest));
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return EnderecoResponse.builder()
                .idEndereco(endereco.getIdEndereco())
                .build();
    }

    @Override
    public List<EnderecoListResponse> getEnderecosPorIdCliente(UUID idCliente) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecosPorIdCliente");
        Cliente clientePorId = clienteRepository.buscaClienteAtravesId(idCliente);
        List<Endereco> enderecos = enderecoRepository.buscaTodosEnderecos();
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecosPorIdCliente");
        return EnderecoListResponse.converte(enderecos);
    }
}
