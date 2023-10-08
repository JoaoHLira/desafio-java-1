package br.com.joaolira.desafiojava1.endereco.application.api;

import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoListResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {

    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse postEndereco(UUID idCliente, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - postEndereco");
        EnderecoResponse enderecoCriado = enderecoService.criaEndereco(idCliente, enderecoRequest);
        log.info("[finaliza] EnderecoController - postEndereco");
        return enderecoCriado;
    }

    @Override
    public List<EnderecoListResponse> getEnderecosPorIdCliente() {
        log.info("[inicia] EnderecoController - EnderecoListResponse");
        List<EnderecoListResponse> endereco = enderecoService.buscaEnderecosPorIdCliente();
        log.info("[finaliza] EnderecoController - EnderecoListResponse");
        return endereco;
    }
}
