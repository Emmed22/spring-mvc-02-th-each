package com.estudos.springmvc.spring_mvc_02_th_each.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {
    @GetMapping("/livros")
    public String mostrarLista(Model model) {
        List<String> livros = new ArrayList<>();

        livros.add("Dom Casmurro");
        livros.add("O Idiota");
        livros.add("Persuasão");
        livros.add("Orgulho e Preconceito");
        livros.add("Guerra e Paz");
        model.addAttribute("livros", livros);
        return "livros";
    }

}
