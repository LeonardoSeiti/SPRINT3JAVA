package com.emi.sprint1java.pesquisa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesquisaService {

    @Autowired
    private PesquisaRepository pesquisaRepository;

    public Pesquisa save(Pesquisa pesquisa) {
        return pesquisaRepository.save(pesquisa);
    }
    public List<Pesquisa> getAll() {
        return pesquisaRepository.findAll();
    }
}