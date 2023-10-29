package br.com.joaolira.desafiojava1.endereco.infra;

import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EnderecoSpringDataJPARepository extends JpaRepository<Endereco, Long> {
}
