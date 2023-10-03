package br.com.joaolira.desafiojava1.cliente.application.repository;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteRequest;
import br.com.joaolira.desafiojava1.cliente.domain.Cliente;

public interface ClienteRepository {
    public Cliente salva(ClienteRequest clienteRequest);
}
