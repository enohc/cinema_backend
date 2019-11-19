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

/**
 *
 * @author enohc
 */
@Entity
@Table(name = "pelicula", catalog = "cinema", schema = "")
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPelicual", nullable = false)
    private Integer idPelicual;
    @Column(name = "nombreOriginal", length = 500)
    private String nombreOriginal;
    @Column(name = "nombreTraducido", length = 500)
    private String nombreTraducido;
    @Column(name = "portada", length = 300)
    private String portada;
    @Column(name = "sinopsis", length = 2000)
    private String sinopsis;
    @Column(name = "duracion")
    private Integer duracion;
    @Column(name = "CAMPO0", length = 1000)
    private String campo0;
    @Column(name = "CAMPO1", length = 45)
    private String campo1;
    @Column(name = "CAMPO2", length = 45)
    private String campo2;
    @Column(name = "CAMPO3", length = 45)
    private String campo3;
    @Column(name = "CAMPO5", length = 45)
    private String campo5;
    @Column(name = "CAMPO6", length = 45)
    private String campo6;
    @Column(name = "CAMPO7", length = 45)
    private String campo7;
    @Column(name = "CAMPO8", length = 45)
    private String campo8;
    @Column(name = "CAMPO9", length = 45)
    private String campo9;
    @OneToMany(mappedBy = "idPelicula")
    private Collection<Cartelera> carteleraCollection;

    public Pelicula() {
    }

    public Pelicula(Integer idPelicual) {
        this.idPelicual = idPelicual;
    }

    public Integer getIdPelicual() {
        return idPelicual;
    }

    public void setIdPelicual(Integer idPelicual) {
        this.idPelicual = idPelicual;
    }

    public String getNombreOriginal() {
        return nombreOriginal;
    }

    public void setNombreOriginal(String nombreOriginal) {
        this.nombreOriginal = nombreOriginal;
    }

    public String getNombreTraducido() {
        return nombreTraducido;
    }

    public void setNombreTraducido(String nombreTraducido) {
        this.nombreTraducido = nombreTraducido;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCampo0() {
        return campo0;
    }

    public void setCampo0(String campo0) {
        this.campo0 = campo0;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5 = campo5;
    }

    public String getCampo6() {
        return campo6;
    }

    public void setCampo6(String campo6) {
        this.campo6 = campo6;
    }

    public String getCampo7() {
        return campo7;
    }

    public void setCampo7(String campo7) {
        this.campo7 = campo7;
    }

    public String getCampo8() {
        return campo8;
    }

    public void setCampo8(String campo8) {
        this.campo8 = campo8;
    }

    public String getCampo9() {
        return campo9;
    }

    public void setCampo9(String campo9) {
        this.campo9 = campo9;
    }

    public Collection<Cartelera> getCarteleraCollection() {
        return carteleraCollection;
    }

    public void setCarteleraCollection(Collection<Cartelera> carteleraCollection) {
        this.carteleraCollection = carteleraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelicual != null ? idPelicual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idPelicual == null && other.idPelicual != null) || (this.idPelicual != null && !this.idPelicual.equals(other.idPelicual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ingeneo.cinema.model.Pelicula[ idPelicual=" + idPelicual + " ]";
    }
    
}
