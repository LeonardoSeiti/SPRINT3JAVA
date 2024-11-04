package com.emi.sprint1java.pesquisa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PesquisaWebController {

    @Autowired
    private PesquisaService pesquisaService;

    @GetMapping("/pesquisa")
    public String showCreateForm(Model model) {
        model.addAttribute("pesquisa", new Pesquisa());
        return "pesquisa";
    }

    @PostMapping("/pesquisa")
    public String savePesquisa(@ModelAttribute Pesquisa pesquisa) {
        pesquisaService.save(pesquisa);
        return "redirect:/resultados";
    }
    @GetMapping("/resultados")
    public String getAllPesquisas(Model model) {
        List<Pesquisa> resultados = pesquisaService.getAll();
        model.addAttribute("resultados", resultados);
        return "resultados";
    }
}