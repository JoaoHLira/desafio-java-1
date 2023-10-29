package br.com.joaolira.desafiojava1.endereco.application.api.request;

import lombok.Value;

@Value
public class EnderecoRequest {

    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
}
