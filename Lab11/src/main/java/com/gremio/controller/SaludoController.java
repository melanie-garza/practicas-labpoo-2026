package com.gremio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.gremio.model.Aventurero;

@Controller
public class SaludoController {

    // Endpoint 1: El Hola Mundo básico
    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("mensaje", "¡Hola Mundo desde Spring Boot!");
        model.addAttribute("gremio", "Gran Gremio de Aventureros");
        model.addAttribute("nivel", 1);
        
        return "saludo"; // buscará el archivo saludo.html
    }

    // Endpoint 2: Mostrar el objeto Aventurero
    @GetMapping("/aventurero")
    public String aventurero(Model model) {
        Aventurero aventurero = new Aventurero("Sylva", "Druida", 10);
        model.addAttribute("aventurero", aventurero);
        
        return "aventurero"; // buscará el archivo aventurero.html
    }
}