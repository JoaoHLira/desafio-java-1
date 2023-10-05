package br.com.joaolira.desafiojava1.cliente.application.service;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteListResponse;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteRequest;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteResponse;
import br.com.joaolira.desafiojava1.cliente.application.repository.ClienteRepository;
import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

    private final ClienteRepository clienteRepository;
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteApplicationService - getTodosClientes");
        List<ClienteListResponse> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finaliza] ClienteApplicationService - getTodosClientes");
        return ClienteListResponse.converte(clientes);
    }
}
