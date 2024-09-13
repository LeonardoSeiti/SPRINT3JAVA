package com.emi.sprint1java.auth;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.emi.sprint1java.cliente.ClienteRepository;

@Service
public class AuthService {
    private final ClienteRepository clienteRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public AuthService(ClienteRepository clienteRepository, PasswordEncoder passwordEncoder, TokenService tokenService){
        this.clienteRepository = clienteRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
    }
    public Token login(Credentials credentials){
        var cliente = clienteRepository.findByEmail(credentials.email()).orElseThrow(() -> new RuntimeException("Acesso negado"));
        if(!passwordEncoder.matches(credentials.senha(), cliente.getSenha())) throw new RuntimeException("Acesso negado");
        return tokenService.create(credentials);
    }
}
