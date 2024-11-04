package com.emi.sprint1java.pesquisa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PesquisaRepository extends JpaRepository<Pesquisa, UUID> {
}