package br.com.joaolira.desafiojava1.cliente.application.api;

import br.com.joaolira.desafiojava1.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @Override
    public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClienteAtravesId");
        log.info("[idCliente]", idCliente);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - getClienteAtravesId");
        return clienteDetalhado;
    }

    @Override
    public void PatchAlteraCliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest) {
        log.info("[inicia] ClienteController - patchAlteraCliente");
        log.info("[finaliza] ClienteController - patchAlteraCliente");

    }
}
