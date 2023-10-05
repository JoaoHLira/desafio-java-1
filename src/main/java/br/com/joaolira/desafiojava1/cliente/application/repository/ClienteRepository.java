package br.com.joaolira.desafiojava1.cliente.application.repository;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteListResponse;
import br.com.joaolira.desafiojava1.cliente.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    List<ClienteListResponse> buscaTodosClientes();
}
