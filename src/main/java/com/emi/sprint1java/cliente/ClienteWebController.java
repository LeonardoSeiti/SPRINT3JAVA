package com.emi.sprint1java.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteWebController {

    @Autowired
    private ClienteWebService clienteWebService;

    @GetMapping("/cliente")
    public String getAllClientes(Model model) {
        model.addAttribute("clientes", clienteWebService.getAllClientes());
        return "cliente";
    }
}