package br.com.joaolira.desafiojava1.cliente.application.api.request;

import br.com.joaolira.desafiojava1.endereco.domain.StatusEndereco;
import lombok.Value;
import java.time.LocalDate;

@Value
public class ClienteRequest {

    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;
    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
    private StatusEndereco status;
}
