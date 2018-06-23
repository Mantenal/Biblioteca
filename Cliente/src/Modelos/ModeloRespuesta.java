/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class ModeloRespuesta implements Serializable {
    private int id;
    private String titulo;
    private String texto;
    private String fkUsuario;
    private int fkPregunta;
    public ModeloRespuesta(){}

    public ModeloRespuesta(int id, String titulo, String texto, String fkUsuario, int fkPregunta) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.fkUsuario = fkUsuario;
        this.fkPregunta = fkPregunta;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(String fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public int getFkPregunta() {
        return fkPregunta;
    }

    public void setFkPregunta(int fkPregunta) {
        this.fkPregunta = fkPregunta;
    }
    
    
    
    
}
