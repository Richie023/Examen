/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.examen.service;

import com.Examen.examen.entity.Pelicula;
import java.util.List;

/**
 *
 * @author ricar_t6uqtj3
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById(long id);
    public  void savePPelicula(Pelicula pelicula);
    public void delete (long id);
    
}
