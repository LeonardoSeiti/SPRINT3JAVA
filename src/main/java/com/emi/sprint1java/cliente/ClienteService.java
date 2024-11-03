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

    public List<Cliente> findByCliente(String usuario) {
       return repository.findByUsuarioContainingIgnoreCase(usuario);
    }
 
    public Cliente save(Cliente cliente) {
        cliente.setSenha(passwordEncoder.encode(cliente.getSenha()));
        return repository.save(cliente);
    }

    public ClienteProfileResponse getClientProfile(String email){
        return repository.findByEmail(email)
        .map(ClienteProfileResponse::new)
        .orElseThrow(() -> new UsernameNotFoundException("Nome de usuário não encontrado")); 
    }
}