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
public class ModeloUsuario implements Serializable {
    
    private String username;
    private String correo;
    private String password;
    private double saldo;
    
    public ModeloUsuario(){}

    public ModeloUsuario(String username, String correo, String password, double saldo) {
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.saldo = saldo;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
            
}
