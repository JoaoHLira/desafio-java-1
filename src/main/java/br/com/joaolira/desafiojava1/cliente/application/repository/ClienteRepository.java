package br.com.joaolira.desafiojava1.cliente.application.repository;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
