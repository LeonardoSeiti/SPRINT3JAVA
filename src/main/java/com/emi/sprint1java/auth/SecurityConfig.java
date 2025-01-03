package com.emi.sprint1java.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain config(HttpSecurity http, AuthorizationFilter authorizationFilter) throws Exception {

        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.POST, "/login", "/api/login", "/api/cliente/**","/cliente").permitAll()
                .requestMatchers(HttpMethod.GET, "/api/cliente", "/api/cliente/perfil").permitAll()
                .requestMatchers("/docs/**", "/swagger-ui/**", "/v3/api-docs/**", "/actuator/**","/health/**").permitAll()
                .anyRequest().authenticated()
        );
        http.oauth2Login(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        http.addFilterBefore(authorizationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
