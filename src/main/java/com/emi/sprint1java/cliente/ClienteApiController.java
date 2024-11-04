package com.emi.sprint1java.cliente;

import com.emi.sprint1java.cliente.dto.ClienteRequest;
import com.emi.sprint1java.cliente.dto.ClienteResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@Tag(name = "Cliente")
public class ClienteApiController {

    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> findByCliente(@RequestParam String usuario) {
        return service.findByCliente(usuario);
    }

    // GET
    @GetMapping("/perfil")
    @Operation(
            summary = "Biuscar clente",
            description = "Retorna pesquisa de cliente")
    @ApiResponse(responseCode = "200", description = "Resultado da pesquisa")
    @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
    public ClienteProfileResponse getClienteProfile(){
        var cliente = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return service.getClientProfile(cliente);
    }

    // POST
    @PostMapping
    @Operation(
            summary = "Salvar cadastro cliente",
            description = "Salva cadastro do cliente, com os campos obrigatórios")
    @ApiResponse(responseCode = "201", description = "Cadastro do cliente criado")
    @ApiResponse(responseCode = "400", description = "Erro ao salvar cliente")
    public ResponseEntity<ClienteResponse> create(@RequestBody ClienteRequest clienteRequest,UriComponentsBuilder uriBuilder) {
       var cliente = service.save(clienteRequest.toModel());

       var uri = uriBuilder
         .path("/clientes/{id}")
         .buildAndExpand(cliente.getId())
         .toUri();

         return ResponseEntity
         .created(uri)
         .body(ClienteResponse.from(cliente));
    }
}
