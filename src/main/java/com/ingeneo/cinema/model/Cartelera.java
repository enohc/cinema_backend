/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author enohc
 */

@Entity
@Table
public class Cartelera implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCartelera", nullable = false)
    private Integer idCartelera;
    @Column(name = "fechaBaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "fechaEstreno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEstreno;
    @Column(name = "Activa")
    private boolean activa;
    @JoinColumn(name = "idFormato", referencedColumnName = "idFormato")
    @ManyToOne
    private Formato idFormato;
    @JoinColumn(name = "idSala", referencedColumnName = "idSala")
    @ManyToOne
    private Sala idSala;
    @JoinColumn(name = "idPelicula", referencedColumnName = "idPelicual")
    @ManyToOne
    private Pelicula idPelicula;
    @OneToMany(mappedBy = "idCartelera")
    private Collection<Funcion> funcionCollection;

    public Cartelera() {
    }

    public Cartelera(Integer idCartelera) {
        this.idCartelera = idCartelera;
    }

    public Integer getIdCartelera() {
        return idCartelera;
    }

    public void setIdCartelera(Integer idCartelera) {
        this.idCartelera = idCartelera;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Formato getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Formato idFormato) {
        this.idFormato = idFormato;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public Pelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Pelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Collection<Funcion> getFuncionCollection() {
        return funcionCollection;
    }

    public void setFuncionCollection(Collection<Funcion> funcionCollection) {
        this.funcionCollection = funcionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCartelera != null ? idCartelera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartelera)) {
            return false;
        }
        Cartelera other = (Cartelera) object;
        if ((this.idCartelera == null && other.idCartelera != null) || (this.idCartelera != null && !this.idCartelera.equals(other.idCartelera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ingeneo.cinema.model.Cartelera[ idCartelera=" + idCartelera + " ]";
    }
    
}
