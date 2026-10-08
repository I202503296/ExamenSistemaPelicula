package com.cibertec.T2exa.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cibertec.T2exa.model.Pelicula;
import com.cibertec.T2exa.model.service.GeneroService;
import com.cibertec.T2exa.model.service.PeliculaService;
import com.cibertec.T2exa.repository.GeneroRepositoy;
import com.cibertec.T2exa.repository.PeliculaRepository;



@Controller
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private GeneroService generoService;

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("peliculas", peliculaService.listar());
        return "listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("generos", generoService.listar());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pelicula pelicula) {
        peliculaService.guardar(pelicula);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("pelicula",
                peliculaService.buscarPorId(id));
        model.addAttribute("generos", generoService.listar());
        return "formulario";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        peliculaService.eliminar(id);
        return "redirect:/";
    }
}



