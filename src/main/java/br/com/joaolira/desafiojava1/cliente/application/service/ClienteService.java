package br.com.joaolira.desafiojava1.cliente.application.service;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteListResponse;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteRequest;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteResponse;

import java.util.List;


public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> getTodosClientes();
}
