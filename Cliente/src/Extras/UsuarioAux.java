/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

/**
 *
 * @author Carlos
 */
public class UsuarioAux {
    public static String username = " ";
    public static double saldo;

    public UsuarioAux() {
        
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UsuarioAux.username = username;
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        UsuarioAux.saldo = saldo;
    }
    
}
