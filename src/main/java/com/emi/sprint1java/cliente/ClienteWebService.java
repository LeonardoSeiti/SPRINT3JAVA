package com.emi.sprint1java.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteWebService {

    @Autowired
    private ClienteWebRepository clienteWebRepository;

    public List<Cliente> getAllClientes() {
        return clienteWebRepository.findAll();
    }
}