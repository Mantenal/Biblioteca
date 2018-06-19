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
public class ModeloPregunta {
    private int id;
    private String tituloPregunta;
    private String texto;
    private String fkUsuario;
    
    public ModeloPregunta(){}

    public ModeloPregunta(int id, String tituloPregunta, String texto, String fkUsuario) {
        this.id = id;
        this.tituloPregunta = tituloPregunta;
        this.texto = texto;
        this.fkUsuario = fkUsuario;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloPregunta() {
        return tituloPregunta;
    }

    public void setTituloPregunta(String tituloPregunta) {
        this.tituloPregunta = tituloPregunta;
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
    
    
}
