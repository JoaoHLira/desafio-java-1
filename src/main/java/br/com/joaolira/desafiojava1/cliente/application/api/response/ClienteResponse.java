package br.com.joaolira.desafiojava1.cliente.application.api.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
