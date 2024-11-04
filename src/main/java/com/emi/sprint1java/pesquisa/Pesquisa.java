package com.emi.sprint1java.pesquisa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Pesquisa{
    @Id
    UUID id;
    // Forma de comprometimento IP, domínio, hash
    String indicador;

    // Tipo  de ameaça malware, phishing
    private String tipo;

    //Url do site suspeito
    private String url;
}
