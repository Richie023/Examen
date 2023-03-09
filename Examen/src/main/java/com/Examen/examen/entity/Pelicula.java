/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author ricar_t6uqtj3
 */
@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idpelicula;

    private String nompelicula;
    private String costoE;
    private String fecha;
    private String sala;
    private String cantidadm;
    private String nombsala;

    @ManyToOne
    @JoinColumn(name = "numero_sala")
         private Cliente cliente;

    /**
     * @return the idpelicula
     */
    public long getIdpelicula() {
        return idpelicula;
    }

    /**
     * @param idpelicula the idpelicula to set
     */
    public void setIdpelicula(long idpelicula) {
        this.idpelicula = idpelicula;
    }

    /**
     * @return the nompelicula
     */
    public String getNompelicula() {
        return nompelicula;
    }

    /**
     * @param nompelicula the nompelicula to set
     */
    public void setNompelicula(String nompelicula) {
        this.nompelicula = nompelicula;
    }

    /**
     * @return the costoE
     */
    public String getCostoE() {
        return costoE;
    }

    /**
     * @param costoE the costoE to set
     */
    public void setCostoE(String costoE) {
        this.costoE = costoE;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * @return the cantidadm
     */
    public String getCantidadm() {
        return cantidadm;
    }

    /**
     * @param cantidadm the cantidadm to set
     */
    public void setCantidadm(String cantidadm) {
        this.cantidadm = cantidadm;
    }

    /**
     * @return the nombsala
     */
    public String getNombsala() {
        return nombsala;
    }

    /**
     * @param nombsala the nombsala to set
     */
    public void setNombsala(String nombsala) {
        this.nombsala = nombsala;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

}
