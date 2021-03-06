/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Carlos
 */
public class ModeloCompra implements Serializable {
    private int id;
    private Date fecha;
    private String fkUsuarioCom;
    private int fkLibro;
    private String fkUsuarioVen;
    private String tituloLibro;
    private String descripcionLibro;
    private String autorLibro;
    private double precio;

    
    
    public ModeloCompra(){}

    public ModeloCompra(int id, Date fecha, String fkUsuarioCom, int fkLibro, String fkUsuarioVen, String tituloLibro, String descripcionLibro, String autorLibro, double precio) {
        this.id = id;
        this.fecha = fecha;
        this.fkUsuarioCom = fkUsuarioCom;
        this.fkLibro = fkLibro;
        this.fkUsuarioVen = fkUsuarioVen;
        this.tituloLibro = tituloLibro;
        this.descripcionLibro = descripcionLibro;
        this.autorLibro = autorLibro;
        this.precio = precio;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFkUsuarioCom() {
        return fkUsuarioCom;
    }

    public void setFkUsuarioCom(String fkUsuarioCom) {
        this.fkUsuarioCom = fkUsuarioCom;
    }

    public int getFkLibro() {
        return fkLibro;
    }

    public void setFkLibro(int fkLibro) {
        this.fkLibro = fkLibro;
    }

    public String getFkUsuarioVen() {
        return fkUsuarioVen;
    }

    public void setFkUsuarioVen(String fkUsuarioVen) {
        this.fkUsuarioVen = fkUsuarioVen;
    }
    
    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }   

    public String getDescripcionLibro() {
        return descripcionLibro;
    }

    public void setDescripcionLibro(String descripcionLibro) {
        this.descripcionLibro = descripcionLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
