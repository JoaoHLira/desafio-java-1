package br.com.joaolira.desafiojava1.cliente.application.api.response;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import br.com.joaolira.desafiojava1.endereco.domain.StatusEndereco;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;
    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
    private StatusEndereco status;


    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
        this.dataNascimento = cliente.getDataNascimento();
        this.logradouro = cliente.getLogradouro();
        this.cep = cliente.getCep();
        this.numero = cliente.getNumero();
        this.cidade = cliente.getCidade();
        this.status = cliente.getStatus();

    }
}
