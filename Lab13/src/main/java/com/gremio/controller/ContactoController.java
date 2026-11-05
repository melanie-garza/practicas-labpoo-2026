package com.gremio.controller;

import com.gremio.model.Contacto;
import com.gremio.service.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactoController {
    private final ContactoService service;

    public ContactoController(ContactoService service) {
        this.service = service;
    }

    @GetMapping("/contactos")
    public String listar(Model model) {
        model.addAttribute("contactos", service.listarTodos());
        return "contactos";
    }

    @GetMapping("/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "formulario"; // Apunta al nuevo HTML unificado
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Contacto contacto) {
        service.guardar(contacto);
        return "redirect:/contactos";
    }

    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("contacto", service.buscarPorId(id));
        return "formulario";
    }

    @PostMapping("/actualizar")
    public String actualizar(@ModelAttribute Contacto contacto) {
        service.guardar(contacto);
        return "redirect:/contactos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/contactos";
    }
}