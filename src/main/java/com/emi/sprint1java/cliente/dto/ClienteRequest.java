package com.emi.sprint1java.cliente.dto;

import java.time.LocalDateTime;

import com.emi.sprint1java.cliente.Cliente;

public record ClienteRequest(
    String ds_email,
    String ds_senha,
    String nm_usuario,
    String nm_empresa,
    String nm_departamento

) {
   public Cliente toModel() {
        return Cliente.builder()
                .ds_email(ds_email)
                .ds_senha(ds_senha)
                .nm_usuario(nm_usuario)
                .nm_empresa(nm_empresa)
                .nm_departamento(nm_departamento)
                .dt_procura(LocalDateTime.now())
                .build();
    } 
}
