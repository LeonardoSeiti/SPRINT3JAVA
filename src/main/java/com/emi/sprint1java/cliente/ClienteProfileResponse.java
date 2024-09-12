package com.emi.sprint1java.cliente;

public record ClienteProfileResponse(
    String nm_usuario,
    String nm_empresa,
    String nm_departamento
) {
    public ClienteProfileResponse(Cliente cliente) {
        this(cliente.getUsuario(), cliente.getEmpresa(), cliente.getDepartamento());
    }
}
