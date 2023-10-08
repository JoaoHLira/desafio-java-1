package br.com.joaolira.desafiojava1.endereco.application.api.response;

import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import lombok.Value;

@Value
public class DetalhaEnderecoResponse {

    private Long idEndereco;
    private Integer cep;
    private Integer numero;
    private String cidade;

    public DetalhaEnderecoResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
    }
}
