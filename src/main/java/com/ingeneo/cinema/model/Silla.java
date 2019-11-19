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
@Table(name = "silla", catalog = "cinema", schema = "")
public class Silla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSilla", nullable = false)
    private Integer idSilla;
    @Column(name = "Filas", length = 2)
    private String filas;
    @Column(name = "silla")
    private Integer silla;
    @JoinColumn(name = "idSala", referencedColumnName = "idSala")
    @ManyToOne
    private Sala idSala;
    @OneToMany(mappedBy = "idSilla")
    private Collection<Reserva> reservaCollection;

    public Silla() {
    }

    public Silla(Integer idSilla) {
        this.idSilla = idSilla;
    }

    public Integer getIdSilla() {
        return idSilla;
    }

    public void setIdSilla(Integer idSilla) {
        this.idSilla = idSilla;
    }

    public String getFilas() {
        return filas;
    }

    public void setFilas(String filas) {
        this.filas = filas;
    }

    public Integer getSilla() {
        return silla;
    }

    public void setSilla(Integer silla) {
        this.silla = silla;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSilla != null ? idSilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Silla)) {
            return false;
        }
        Silla other = (Silla) object;
        if ((this.idSilla == null && other.idSilla != null) || (this.idSilla != null && !this.idSilla.equals(other.idSilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ingeneo.cinema.model.Silla[ idSilla=" + idSilla + " ]";
    }
    
}
