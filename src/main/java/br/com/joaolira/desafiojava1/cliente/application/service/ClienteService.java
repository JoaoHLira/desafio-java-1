package br.com.joaolira.desafiojava1.cliente.application.service;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteRequest;
import br.com.joaolira.desafiojava1.cliente.application.api.ClienteResponse;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRquest);
}
