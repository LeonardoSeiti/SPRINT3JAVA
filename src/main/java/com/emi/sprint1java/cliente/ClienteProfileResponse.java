package com.emi.sprint1java.cliente;

public record ClienteProfileResponse(
    String usuario,
    String empresa,
    String departamento
) {
    public ClienteProfileResponse(Cliente cliente) {
        this(cliente.getUsuario(), cliente.getEmpresa(), cliente.getDepartamento());
    }
}
