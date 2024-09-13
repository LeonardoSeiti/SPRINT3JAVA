package com.emi.sprint1java.auth;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.emi.sprint1java.cliente.Cliente;
import com.emi.sprint1java.cliente.ClienteRepository;

@Service
public class TokenService {

    private final ClienteRepository clienteRepository;
    private Algorithm algorithm;

    public TokenService(ClienteRepository clienteRepository, @Value("${jwt.secret}") String secret) {
        this.clienteRepository = clienteRepository;
        this.algorithm = Algorithm.HMAC256(secret);
    }

    public Token create(Credentials credentials){
        var expireAt = LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.ofHours(-3));
        var token = JWT.create()
        .withSubject(credentials.email())
        .withExpiresAt(expireAt)
        .sign(algorithm);
        return new Token(token, credentials.email());
    }
    public Cliente getClienteFromToken(String token){
        var email = JWT.require(algorithm)
        .build()
        .verify(token)
        .getSubject();

        return clienteRepository.findByEmail(email).orElseThrow(
            () -> new UsernameNotFoundException("Cliente não encontrado")
        );
    }
}
