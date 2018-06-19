/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import Modelos.ModeloLibros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ControladorLibros extends Conexion {

    private static Connection con;

    public ControladorLibros() {
        super();
        this.con = super.getCon();
    }

    public static ArrayList<Modelos.ModeloLibros> mostrarTodos() {
        try {
            ArrayList<Modelos.ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement("SELECT *FROM libros");

            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio")
                ));
                resultLibros.next();
            }
            resultLibros.close();
            return listaLibros;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ArrayList<ModeloLibros> mostrarUno(int id){
           try {
            ArrayList<Modelos.ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement(""
                    + "SELECT *"
                    + "FROM libros "
                    + "WHERE id_libro = ?");
            sql.setInt(1, id);
            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio")
                ));
                resultLibros.next();
            }
            resultLibros.close();
            return listaLibros;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
