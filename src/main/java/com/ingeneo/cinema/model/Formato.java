/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author enohc
 */

@Entity
@Table
public class Formato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFormato", nullable = false)
    private Integer idFormato;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @OneToMany(mappedBy = "idFormato")
    private Collection<Cartelera> carteleraCollection;
    @OneToMany(mappedBy = "idFormato")
    private Collection<Sala> salaCollection;

    public Formato() {
    }

    public Formato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    public Integer getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cartelera> getCarteleraCollection() {
        return carteleraCollection;
    }

    public void setCarteleraCollection(Collection<Cartelera> carteleraCollection) {
        this.carteleraCollection = carteleraCollection;
    }

    public Collection<Sala> getSalaCollection() {
        return salaCollection;
    }

    public void setSalaCollection(Collection<Sala> salaCollection) {
        this.salaCollection = salaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormato != null ? idFormato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formato)) {
            return false;
        }
        Formato other = (Formato) object;
        if ((this.idFormato == null && other.idFormato != null) || (this.idFormato != null && !this.idFormato.equals(other.idFormato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ingeneo.cinema.model.Formato[ idFormato=" + idFormato + " ]";
    }
    
}
