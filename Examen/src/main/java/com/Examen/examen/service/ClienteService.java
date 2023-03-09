/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.examen.service;

import com.Examen.examen.entity.Cliente;
import com.Examen.examen.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author ricar_t6uqtj3
 */
@ Service
public class ClienteService implements IClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
   
    @Override
    public List<Cliente> listCostumer() {
       return (List<Cliente>)clienteRepository.findAll();  }
    
}
