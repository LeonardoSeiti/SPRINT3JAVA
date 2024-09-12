package com.emi.sprint1java.cliente.dto;

import com.emi.sprint1java.cliente.Cliente;

public record ClienteRequest(
    String email,
    String senha,
    String usuario,
    String empresa,
    String departamento

) {
   public Cliente toModel() {
        return Cliente.builder()
                .email(email)
                .senha(senha)
                .usuario(usuario)
                .empresa(empresa)
                .departamento(departamento)
                .build();
    } 
}
