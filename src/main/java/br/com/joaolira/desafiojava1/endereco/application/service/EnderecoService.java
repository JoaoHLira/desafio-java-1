package br.com.joaolira.desafiojava1.endereco.application.service;

import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;

import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idCliente, EnderecoRequest enderecoRequest);
}
