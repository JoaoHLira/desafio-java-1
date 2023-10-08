package br.com.joaolira.desafiojava1.endereco.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco {

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
