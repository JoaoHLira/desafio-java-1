package br.com.joaolira.desafiojava1.cliente.application.service;

import br.com.joaolira.desafiojava1.cliente.application.api.*;

import java.util.List;
import java.util.UUID;


public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> getTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

    void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
