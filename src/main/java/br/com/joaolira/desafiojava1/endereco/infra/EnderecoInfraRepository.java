package br.com.joaolira.desafiojava1.endereco.infra;

import br.com.joaolira.desafiojava1.endereco.application.repository.EnderecoRepository;
import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepository implements EnderecoRepository {
    private final EnderecoSpringDataJPARepository enderecoSpringDataJPARepository;

    @Override
    public Endereco salva(Endereco endereco) {
        log.info("[inicia] EnderecoInfraRepository - salva");
        Endereco enderecoCriado = enderecoSpringDataJPARepository.save(endereco);
        log.info("[finaliza] EnderecoInfraRepository - salva");
        return enderecoCriado;
    }

    @Override
    public List<Endereco> buscaTodosEnderecos() {
        log.info("[inicia] EnderecoInfraRepository - buscaTodosEnderecos");
        List<Endereco> todosEnderecos = enderecoSpringDataJPARepository.findAll();
        log.info("[finaliza] EnderecoInfraRepository - buscaTodosEnderecos");
        return todosEnderecos;
    }
}
