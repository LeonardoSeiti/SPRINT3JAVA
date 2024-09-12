package com.emi.sprint1java.cliente;

public record ClienteProfileResponse(
    String nm_usuario,
    String nm_empresa,
    String nm_departamento
) {
    public ClienteProfileResponse(Cliente cliente) {
        this(cliente.getNm_usuario(), cliente.getNm_empresa(), cliente.getNm_departamento());
    }
}
