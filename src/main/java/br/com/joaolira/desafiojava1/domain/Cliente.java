package br.com.joaolira.desafiojava1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {

    @Id
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @Email
    @NotBlank
    private String email;
    @NotNull
    private Integer dataNascimento;
    @NotBlank
    private Endereco endereco;

    public Cliente(UUID idCliente, String nomeCompleto, String email, @NotNull Integer dataNascimento,
                   Endereco endereco) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
