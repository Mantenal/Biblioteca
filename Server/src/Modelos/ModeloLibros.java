/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Carlos
 */
public class ModeloLibros {
    
    private int idLibro;
    private String tituloLibro;
    private String autor;
    private String descripcion;
    private int estado;
    private double precio;
    
    public ModeloLibros(){
    }

    public ModeloLibros(int idLibro, String tituloLibro, String autor, String descripcion, int estado, double precio) {
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
    }
   

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
