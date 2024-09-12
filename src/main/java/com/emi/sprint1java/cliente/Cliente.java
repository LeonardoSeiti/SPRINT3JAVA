package com.emi.sprint1java.cliente;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "T_USUARIO")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String ds_email;
    private String ds_senha;
    @NotBlank
    private String nm_usuario;
    @NotBlank
    private String nm_empresa;
    private String nm_departamento;
    private LocalDateTime dt_procura;
}
