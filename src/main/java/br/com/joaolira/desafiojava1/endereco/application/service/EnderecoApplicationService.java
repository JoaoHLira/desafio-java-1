package br.com.joaolira.desafiojava1.endereco.application.service;

import br.com.joaolira.desafiojava1.cliente.application.repository.ClienteRepository;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.DetalhaEnderecoResponse;
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
        Endereco endereco = enderecoRepository.salva(new Endereco(idCliente, enderecoRequest));
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return EnderecoResponse.builder()
                .idEndereco(endereco.getIdEndereco())
                .build();
    }

    @Override
    public List<EnderecoListResponse> getEnderecosPorIdCliente(UUID idCliente) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecosPorIdCliente");
        List<Endereco> enderecos = enderecoRepository.buscaTodosEnderecos(idCliente);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecosPorIdCliente");
        return EnderecoListResponse.converte(enderecos);
    }

    @Override
    public DetalhaEnderecoResponse buscaEnderecoPorId(Long idEndereco) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoPorId");
        Endereco endereco = enderecoRepository.buscaEnderecoPorId(idEndereco);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoPorId");
        return new DetalhaEnderecoResponse(endereco);
    }

    @Override
    public void patchAlteraEndereco(Long idEndereco, EnderecoAlteracaoRequest enderecoAlteracaoRequest) {
        log.info("[inicia] EnderecoApplicationService - patchAlteraEndereco");
        Endereco endereco = enderecoRepository.buscaEnderecoPorId(idEndereco);
        endereco.altera(enderecoAlteracaoRequest);
        enderecoRepository.salva(endereco);
        log.info("[finaliza] EnderecoApplicationService - patchAlteraEndereco");
    }

    @Override
    public void mudaStatusEndereco(Long idEndereco) {
        log.info("[inicia] EnderecoApplicationService - mudaStatusEndereco");
        Endereco endereco = enderecoRepository.buscaEnderecoPorId(idEndereco);
        endereco.mudaStatusEndereco();
        enderecoRepository.salva(endereco);
        log.info("[finaliza] EnderecoApplicationService - mudaStatusEndereco");
    }

    @Override
    public DetalhaEnderecoResponse getEnderecoPrincipal(UUID idCliente) {
        log.info("[inicia] EnderecoApplicationService - getEnderecoPrincipal");
        Endereco endereco = enderecoRepository.buscaEnderecoPrincipal(idCliente);
        log.info("[finaliza] EnderecoApplicationService - getEnderecoPrincipal");
        return new DetalhaEnderecoResponse(endereco);
    }
}
