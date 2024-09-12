package com.emi.sprint1java.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<Cliente> findByCliente(String nm_usuario) {
       return repository.findByClienteContainingIgnoreCase(nm_usuario);
    }
 
    public Cliente save(Cliente cliente) {
        cliente.setDs_senha(passwordEncoder.encode(cliente.getDs_senha()));
        return repository.save(cliente);
    }

    public ClienteProfileResponse getClientProfile(String ds_email){
        return repository.findByEmail(ds_email)
        .map(ClienteProfileResponse::new)
        .orElseThrow(() -> new UsernameNotFoundException("Nome de usuário não encontrado")); 
    }

}