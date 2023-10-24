package br.com.joaolira.desafiojava1.endereco.application.service;

import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.DetalhaEnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoListResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;

import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idCliente, EnderecoRequest enderecoRequest);

    List<EnderecoListResponse> getEnderecosPorIdCliente(UUID idCliente);

    DetalhaEnderecoResponse buscaEnderecoPorId(Long idEndereco);

    void patchAlteraEndereco(Long idEndereco, EnderecoAlteracaoRequest enderecoAlteracaoRequest);

    void mudaStatusEndereco(Long idEndereco);
}
