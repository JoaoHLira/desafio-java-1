package br.com.joaolira.desafiojava1.endereco.infra;

import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import br.com.joaolira.desafiojava1.endereco.domain.StatusEndereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EnderecoSpringDataJPARepository extends JpaRepository<Endereco, Long> {
    Optional<Endereco> findByIdClienteAndStatusEndereco(UUID idCliente, StatusEndereco statusEndereco);

    List<Endereco> findEnderecosByIdCliente(UUID idCliente);
}
