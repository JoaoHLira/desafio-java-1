package br.com.joaolira.desafiojava1.cliente.infra;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteListResponse;
import br.com.joaolira.desafiojava1.cliente.application.repository.ClienteRepository;
import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return null;
    }
}
