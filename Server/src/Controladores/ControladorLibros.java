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


    public ControladorLibros() {
        super();
    }
    
    
    public boolean insertLibro(String tituloLibro, String autor, String descripcion, int estado, double precio, String usuario) {
        try {
            PreparedStatement sql = con.prepareStatement( "INSERT INTO libros (titulo_libro, autor, descripcion, estado, precio, fk_usuario) VALUES (?, ?, ?, ?, ?, ?)");
            sql.setString(1, tituloLibro);
            sql.setString(2, autor);
            sql.setString(3, descripcion);
            sql.setInt(4, estado);
            sql.setDouble(5, precio);
            sql.setString(6, usuario);
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

    public ArrayList<ModeloLibros> mostrarTodosPorUsuario(String usuario) {
        try {
            ArrayList<ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM libros WHERE fk_usuario = ?"
            );

            sql.setString(1, usuario);
            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio"),
                        resultLibros.getString("fk_usuario")
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

    public ArrayList<ModeloLibros> mostrarUnoPorUsuario(int id, String usuario) {
        try {
            ArrayList<Modelos.ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement("SELECT * FROM libros WHERE id_libro = ? AND fk_usuario = ?");

            sql.setInt(1, id);
            sql.setString(2, usuario);

            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio"),
                        resultLibros.getString("fk_usuario")
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
    
    
    public ArrayList<ModeloLibros> mostrarLibrosPorEstado(String usuario) {
        try {
            ArrayList<Modelos.ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement("SELECT * FROM libros WHERE fk_usuario != ?");

            sql.setString(1, usuario);

            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio"),
                        resultLibros.getString("fk_usuario")
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
    
    
    
    public ArrayList<ModeloLibros> buscarLibro(String busqueda){
            try {
            ArrayList<ModeloLibros> listaLibros = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM libros WHERE titulo_libro LIKE ?"
            );

            sql.setString(1, ("%"+busqueda+"%"));
            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaLibros.add(new ModeloLibros(
                        resultLibros.getInt("id_libro"),
                        resultLibros.getString("titulo_libro"),
                        resultLibros.getString("autor"),
                        resultLibros.getString("descripcion"),
                        resultLibros.getInt("estado"),
                        resultLibros.getDouble("precio"),
                        resultLibros.getString("fk_usuario")
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
