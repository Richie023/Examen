/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.examen.repository;

import com.Examen.examen.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ricar_t6uqtj3
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
    
}
