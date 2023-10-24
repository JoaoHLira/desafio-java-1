package br.com.joaolira.desafiojava1.cliente.domain;

import br.com.joaolira.desafiojava1.cliente.application.api.request.ClienteAlteracaoRequest;
import br.com.joaolira.desafiojava1.cliente.application.api.request.ClienteRequest;
import br.com.joaolira.desafiojava1.endereco.domain.StatusEndereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Log4j2
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition ="uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @Email
    private String email;
    private LocalDate dataNascimento;

    public Cliente (ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.dataNascimento = clienteRequest.getDataNascimento();
    }

    public void altera(ClienteAlteracaoRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.dataNascimento = clienteRequest.getDataNascimento();
    }
}
