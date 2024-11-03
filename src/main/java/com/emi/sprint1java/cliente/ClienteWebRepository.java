package com.emi.sprint1java.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteWebRepository extends JpaRepository<Cliente, Long> {
}