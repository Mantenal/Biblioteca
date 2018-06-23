/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import Modelos.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristofer
 */
public class ControladorUsuario extends Conexion {

    public ControladorUsuario() {
        super();
    }

    public boolean insertUsuario(String usuario, String pass, String correo, double saldo) {
        try {
            PreparedStatement sql = con.prepareStatement(
                    "INSERT INTO usuarios VALUES (?, ?, ?, ?)");
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

    public boolean checkUsuarioExistente(String usuario) {
        try {
            ResultSet resultUsuarios;
            PreparedStatement sql = con.prepareStatement("SELECT usuario, password FROM usuarios WHERE usuario = ?");
            System.out.println("");
            sql.setString(1, usuario);

            resultUsuarios = sql.executeQuery();
            if (resultUsuarios.first()) {
                resultUsuarios.close();
                return true;
            } else {
                resultUsuarios.close();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean logInUsuario(String usuario, String password) {
        try {
            ResultSet resultUsuarios;
            PreparedStatement sql = con.prepareStatement("SELECT usuario, password FROM usuarios WHERE usuario = ? AND password = ?");

            sql.setString(1, usuario);
            sql.setString(2, password);

            resultUsuarios = sql.executeQuery();
            if (resultUsuarios.first()) {
                resultUsuarios.close();
                return true;
            } else {
                resultUsuarios.close();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public double getSaldo(String usuario) {
        try {
            PreparedStatement sql;
            double saldo;
            sql = con.prepareStatement("SELECT saldo FROM usuarios WHERE usuario = ?");
            sql.setString(1, usuario);
            ResultSet resultSaldo = sql.executeQuery();
            resultSaldo.first();
            saldo = resultSaldo.getDouble("saldo");
            resultSaldo.close();
            return saldo;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }

    }

    public ModeloUsuario getDatosUsuario(String usuario) {
        try {
            ModeloUsuario listaUsuario = new ModeloUsuario();
            ResultSet resultUsuario;
            PreparedStatement sql = con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            sql.setString(1, usuario);
            resultUsuario = sql.executeQuery();
            resultUsuario.first();
            listaUsuario.setUsername(resultUsuario.getString("usuario"));
            listaUsuario.setSaldo(resultUsuario.getDouble("saldo"));
            return listaUsuario;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
