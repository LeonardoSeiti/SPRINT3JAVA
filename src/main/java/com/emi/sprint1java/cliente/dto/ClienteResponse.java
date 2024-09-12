package com.emi.sprint1java.cliente.dto;


import com.emi.sprint1java.cliente.Cliente;

public record ClienteResponse(    
     Long id,
     String email,
     String usuario,
     String empresa,
     String departamento
    ) {
    public static ClienteResponse from (Cliente cliente) {
        return new ClienteResponse(
            cliente.getId(),
            cliente.getEmail(),
            cliente.getUsuario(),
            cliente.getEmpresa(),
            cliente.getDepartamento()
        );
    }
}