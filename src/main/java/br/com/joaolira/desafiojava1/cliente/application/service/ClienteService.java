package br.com.joaolira.desafiojava1.cliente.application.service;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteDetalhadoResponse;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteListResponse;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteRequest;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;


public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> getTodosClientes();

    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
