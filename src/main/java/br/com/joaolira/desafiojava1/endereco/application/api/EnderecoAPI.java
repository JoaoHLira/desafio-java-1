package br.com.joaolira.desafiojava1.endereco.application.api;

import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoAlteracaoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoPrincipalRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.request.EnderecoRequest;
import br.com.joaolira.desafiojava1.endereco.application.api.response.DetalhaEnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoListResponse;
import br.com.joaolira.desafiojava1.endereco.application.api.response.EnderecoResponse;
import br.com.joaolira.desafiojava1.endereco.domain.Endereco;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/endereco/")
public interface EnderecoAPI {

    @PostMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse postEndereco(@PathVariable UUID idCliente,
                                  @Valid @RequestBody EnderecoRequest enderecoRequest);
    @GetMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoListResponse> getEnderecosPorIdCliente(@PathVariable UUID idCliente);

    @GetMapping("/{idCliente}/{idEndereco}")
    @ResponseStatus(code = HttpStatus.OK)
    DetalhaEnderecoResponse detalhaEndereco(@PathVariable Long idEndereco);
    @PatchMapping("/{idCliente}/altera/{idEndereco}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void PatchAlteraEndereco(@PathVariable Long idEndereco,
                             @Valid @RequestBody EnderecoAlteracaoRequest enderecoAlteracaoRequest);
    @PostMapping("/{idCliente}/status/{idEndereco}")
    @ResponseStatus(code = HttpStatus.OK)
    void mudaStatusParaPricipal(@PathVariable Long idEndereco);

    @GetMapping("/{idCliente}/principal")
    @ResponseStatus(code = HttpStatus.OK)
    DetalhaEnderecoResponse getEnderecoPrincipal(@PathVariable UUID idCliente);
}
