package com.emi.sprint1java.cliente.dto;

import java.time.LocalDateTime;

import com.emi.sprint1java.cliente.Cliente;

public record ClienteResponse(    
     Long id_usuario,
     String ds_email,
     String nm_usuario,
     String nm_empresa,
     String nm_departamento,
     LocalDateTime dt_procura
    ) {
    public static ClienteResponse from (Cliente cliente) {
        return new ClienteResponse(
            cliente.getId_usuario(),
            cliente.getDs_email(),
            cliente.getNm_usuario(),
            cliente.getNm_empresa(),
            cliente.getNm_departamento(),
            cliente.getDt_procura()
        );
    }
}
