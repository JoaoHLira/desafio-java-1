package br.com.joaolira.desafiojava1.cliente.application.api;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.dataNascimento = cliente.getDataNascimento();

    }
}
