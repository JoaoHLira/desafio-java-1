package br.com.joaolira.desafiojava1.endereco.application.api.response;

import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class DetalhaEnderecoResponse {

    private Long idEndereco;
    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
    private LocalDateTime dataHoraCadastro;

    public DetalhaEnderecoResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.dataHoraCadastro = LocalDateTime.now();
    }
}
