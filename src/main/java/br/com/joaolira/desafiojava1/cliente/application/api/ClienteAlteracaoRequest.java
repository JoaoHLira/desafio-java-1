package br.com.joaolira.desafiojava1.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.time.LocalDate;

@Value
public class ClienteAlteracaoRequest {

    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;
}
