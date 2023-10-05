package br.com.joaolira.desafiojava1.cliente.application.repository;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    List<Cliente> buscaTodosClientes();

    Cliente buscaClienteAtravesId(UUID idCliente);
}
