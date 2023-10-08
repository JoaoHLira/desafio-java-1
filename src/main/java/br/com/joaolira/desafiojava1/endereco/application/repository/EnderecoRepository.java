package br.com.joaolira.desafiojava1.endereco.application.repository;

import br.com.joaolira.desafiojava1.endereco.domain.Endereco;

import java.util.List;

public interface EnderecoRepository {
    Endereco salva(Endereco endereco);

    List<Endereco> buscaTodosEnderecos();

    Endereco buscaEnderecoPorId(Long idEndereco);
}
