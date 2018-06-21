/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristofer
 */
public class ControladorUsuario extends Conexion{
    
    public ControladorUsuario(){
        super();
    }
    
    public boolean insertUsuario(String usuario, String pass, String correo, double saldo) {
        try {
            PreparedStatement sql = con.prepareStatement(
                    "INSERT INTO usuarios "
                    + "VALUES (?, ?, ?, ?)");
            sql.setString(1, usuario);
            sql.setString(2, pass);
            sql.setString(3, correo);
            sql.setDouble(4, saldo);
            if (sql.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
