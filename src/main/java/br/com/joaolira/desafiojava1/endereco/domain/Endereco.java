package br.com.joaolira.desafiojava1.endereco.domain;

import br.com.joaolira.desafiojava1.cliente.domain.Cliente;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idEndereco", unique = true, nullable = false, updatable = false)
    private Long idEndereco;
    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraUltimaAlteracao;
    private StatusEndereco statusEndereco = StatusEndereco.SECUNDARIO;


    public Endereco(Cliente cliente, EnderecoRequest enderecoRequest) {
        this.logradouro = enderecoRequest.getLogradouro();
        this.cep = enderecoRequest.getCep();
        this.numero = enderecoRequest.getNumero();
        this.cidade = enderecoRequest.getCidade();
        this.dataHoraCadastro = LocalDateTime.now();
        this.statusEndereco = getStatusEndereco();
    }

    public void altera(EnderecoAlteracaoRequest enderecoRequest) {
        this.logradouro = enderecoRequest.getLogradouro();
        this.cep = enderecoRequest.getCep();
        this.numero = enderecoRequest.getNumero();
        this.cidade = enderecoRequest.getCidade();
        this.dataHoraUltimaAlteracao = LocalDateTime.now();
        this.statusEndereco = getStatusEndereco();
    }

    public void mudaStatusEndereco() {
        this.statusEndereco = StatusEndereco.PRINCIPAL;
    }
}
