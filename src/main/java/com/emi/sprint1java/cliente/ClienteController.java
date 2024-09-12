package com.emi.sprint1java.cliente;

import com.emi.sprint1java.cliente.dto.ClienteRequest;
import com.emi.sprint1java.cliente.dto.ClienteResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;



import java.util.List;

@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> findByCliente(@RequestParam String nm_usuario) {
        return service.findByCliente(nm_usuario);
    }

    // GET
    @GetMapping("/{id}")
    @Operation(
            summary = "Buscar cliente por ID",
            description = "Retorna pesquisa de cliente por ID")
    // @ApiResponse(responseCode = "200", description = "Cadastro do cliente encontrado")
    // @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
    public ClienteProfileResponse getClienteProfile(){
        var user = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        return service.getClientProfile(user);
    }

    // POST
    @PostMapping
    @Operation(
            summary = "Salvar cadastro cliente",
            description = "Salva cadastro do cliente")
    // @ApiResponse(responseCode = "201", description = "Cadastro do cliente salvo")
    // @ApiResponse(responseCode = "400", description = "Erro ao salvar cliente")
    public ResponseEntity<ClienteResponse> create(@RequestBody ClienteRequest clienteRequest,UriComponentsBuilder uriBuilder) {
       var user = service.save(clienteRequest.toModel());

       var uri = uriBuilder
         .path("/clientes/{id}")
         .buildAndExpand(user.getId_usuario())
         .toUri();

         return ResponseEntity
         .created(uri)
         .body(ClienteResponse.from(user));
    }

//     // DELETE
//     @DeleteMapping("/{id}")
//     @Operation(
//             summary = "Deletar cadastro do cliente",
//             description = "Deleta o cadastro do cliente")
//     @ApiResponse(responseCode = "200", description = "Cadastro do cliente deletado")
//     @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public 
//     }

//     // PUT
//     @PutMapping("/{id}")
//     @Operation(
//             summary = "Atualizar cadastro do cliente",
//             description = "Atualiza cadastro do cliente")
//     @ApiResponse(responseCode = "200", description = "Cadastro do cliente atualizado")
//     @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
//     public 
//     }


    
}
