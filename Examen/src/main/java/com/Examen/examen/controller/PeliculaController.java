/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.examen.controller;

import com.Examen.examen.entity.Cliente;
import com.Examen.examen.entity.Pelicula;
import com.Examen.examen.service.IClienteService;
import com.Examen.examen.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ricar_t6uqtj3
 */

@Controller
public class PeliculaController {
    @Autowired
    private IClienteService clienteService;
    @Autowired
    private IPeliculaService peliculaService;
    
     @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Pelicula");
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
}


    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Cliente> listaClientes = clienteService.listCostumer();
        model.addAttribute("clientes", new Cliente());
        model.addAttribute("clientes", listaClientes);
        return "crear";

}

 @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculaService.delete(idPelicula);
        return  "redirect:/pelicula";
    }
  @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
    peliculaService.savePPelicula(pelicula);
    return "redirect:/persona";  
    
}

  @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
    Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
    List<Cliente> listaClientes= clienteService.listCostumer();
    model.addAttribute("peliculas", pelicula);
    model.addAttribute("clientes", listaClientes);
    return  "crear";









}}
