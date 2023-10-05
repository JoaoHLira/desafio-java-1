package br.com.joaolira.desafiojava1.cliente.application.api;

import br.com.joaolira.desafiojava1.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - ClienteListResponse");
        List<ClienteListResponse> clientes = clienteService.getTodosClientes();
        log.info("[finaliza] ClienteController - ClienteListResponse");
        return clientes;
    }
}
