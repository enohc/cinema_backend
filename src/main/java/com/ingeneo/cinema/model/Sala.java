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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author enohc
 */
@Entity
@Table(name = "sala", catalog = "cinema", schema = "")
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSala", nullable = false)
    private Integer idSala;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @OneToMany(mappedBy = "idSala")
    private Collection<Cartelera> carteleraCollection;
    @OneToMany(mappedBy = "idSala")
    private Collection<Silla> sillaCollection;
    @JoinColumn(name = "idFormato", referencedColumnName = "idFormato")
    @ManyToOne
    private Formato idFormato;
    @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
    @ManyToOne
    private Sucural idSucursal;

    public Sala() {
    }

    public Sala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
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

    public Collection<Silla> getSillaCollection() {
        return sillaCollection;
    }

    public void setSillaCollection(Collection<Silla> sillaCollection) {
        this.sillaCollection = sillaCollection;
    }

    public Formato getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Formato idFormato) {
        this.idFormato = idFormato;
    }

    public Sucural getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Sucural idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSala != null ? idSala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idSala == null && other.idSala != null) || (this.idSala != null && !this.idSala.equals(other.idSala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ingeneo.cinema.model.Sala[ idSala=" + idSala + " ]";
    }
    
}
