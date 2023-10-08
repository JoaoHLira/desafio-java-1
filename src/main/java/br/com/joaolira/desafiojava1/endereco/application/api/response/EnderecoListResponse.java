package br.com.joaolira.desafiojava1.endereco.application.api.response;

import lombok.Value;

@Value
public class EnderecoListResponse {

    private Long idEndereco;
    private Integer cep;
    private Integer numero;
    private String cidade;
}
