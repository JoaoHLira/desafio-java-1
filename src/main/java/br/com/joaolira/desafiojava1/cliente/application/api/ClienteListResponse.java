package br.com.joaolira.desafiojava1.cliente.application.api;

import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
public class ClienteListResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;

    public static List<ClienteListResponse> converte(List<ClienteListResponse> clientes) {
        return null;
    }
}
