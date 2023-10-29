package br.com.joaolira.desafiojava1.cliente.infra;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
