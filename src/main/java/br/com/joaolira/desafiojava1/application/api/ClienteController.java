package br.com.joaolira.desafiojava1.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class ClienteController implements ClienteAPI {
    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRquest) {
        log.info("[inicia] ClienteController - postCliente");
        log.info("[finaliza] ClienteController - postCliente");
        return null;
    }
}
