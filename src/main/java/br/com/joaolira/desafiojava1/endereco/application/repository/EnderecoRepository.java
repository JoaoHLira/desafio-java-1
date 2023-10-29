package br.com.joaolira.desafiojava1.endereco.application.repository;

import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoPrincipalRequest;
import br.com.joaolira.desafiojava1.endereco.domain.Endereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRepository {
    Endereco salva(Endereco endereco);

    List<Endereco> buscaTodosEnderecos(UUID idCliente);

    Endereco buscaEnderecoPorId(Long idEndereco);

    Endereco buscaEnderecoPrincipal(UUID idCliente);
}
