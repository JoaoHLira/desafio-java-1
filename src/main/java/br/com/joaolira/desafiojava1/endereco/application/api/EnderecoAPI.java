package br.com.joaolira.desafiojava1.endereco.application.api;

import br.com.joaolira.desafiojava1.cliente.application.api.ClienteAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.DetalhaEnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoListResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/endereco/{idCliente}")
public interface EnderecoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse postEndereco(@PathVariable UUID idCliente,
                                  @Valid @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoListResponse> getEnderecosPorIdCliente(@PathVariable UUID idCliente);
    @GetMapping("/{idEndereco}")
    @ResponseStatus(code = HttpStatus.OK)
    DetalhaEnderecoResponse detalhaEndereco(@PathVariable Long idEndereco);

    @PatchMapping("/altera/{idEndereco}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void PatchAlteraEndereco(@PathVariable UUID idEndereco,
                             @Valid @RequestBody EnderecoAlteracaoRequest enderecoAlteracaoRequest);
}
