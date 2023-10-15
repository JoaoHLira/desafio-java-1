package br.com.joaolira.desafiojava1.cliente.application.api.response;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.dataNascimento = cliente.getDataNascimento();
    }

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream().map(ClienteListResponse::new).collect(Collectors.toList());
    }
}
