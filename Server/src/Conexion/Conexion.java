/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    // conexiones
    protected static Connection con = null;
    
    // usuario y clave
    private String user = "root";
    private String password = "";

    public Conexion() {

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
                System.out.println("si jalo");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println( "Error en la conexión, verifique, su usuario "
                    + "y password o el nombre de la base a la que intenta "
                    + "conectarse");
            e.printStackTrace();
        }
    }
    
    public Connection getCon() {
        return con;
    }
}
