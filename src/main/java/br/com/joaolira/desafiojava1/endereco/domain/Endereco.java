package br.com.joaolira.desafiojava1.endereco.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String logradouro;
    @NotBlank
    private Integer cep;
    @NotBlank
    private Integer numero;
    @NotBlank
    private String cidade;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraUltimaAlteracao;
}
