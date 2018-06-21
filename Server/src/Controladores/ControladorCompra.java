/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import Modelos.ModeloCompra;
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
public class ControladorCompra extends Conexion {

    public ControladorCompra() {
        super();
    }

    public ArrayList<ModeloCompra> mostrarTodos() {
        try {
            ArrayList<ModeloCompra> listaCompras = new ArrayList<>();
            ResultSet resultCompras;
            PreparedStatement sql = con.prepareStatement(""
                    + "SELECT titulo_libro, id, fecha, fk_usuario_com, "
                    + "fk_libro, fk_usuario_ven "
                    + "FROM compra_venta, libros"
                    + "WHERE fk_libro = id_libro");

            resultCompras = sql.executeQuery();
            resultCompras.first();

            while (!resultCompras.isAfterLast()) {
                listaCompras.add(new ModeloCompra(
                        resultCompras.getInt("id"),
                        resultCompras.getDate("fecha"),
                        resultCompras.getString("fk_usuario_com"),
                        resultCompras.getInt("fk_libro"),
                        resultCompras.getString("fk_usuario_ven"),
                        resultCompras.getString("titulo_libro")
                ));
                resultCompras.next();
            }
            resultCompras.close();
            return listaCompras;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<ModeloCompra> mostrarComprasPorUsuario(String usuario){
           try {
            ArrayList<ModeloCompra> listaCompra = new ArrayList<>();
            ResultSet resultCompra;
            PreparedStatement sql = con.prepareStatement(""
                    + "SELECT titulo_libro, id, fecha, fk_usuario_com, "
                    + "fk_libro, fk_usuario_ven "
                    + "FROM libros, compra "
                    + "WHERE fk_usuario_com = ? AND fk_libro = id_libro");
            sql.setString(1, usuario);
            resultCompra = sql.executeQuery();
            resultCompra.first();

            while (!resultCompra.isAfterLast()) {
                listaCompra.add(new ModeloCompra(
                        resultCompra.getInt("id"),
                        resultCompra.getDate("fecha"),
                        resultCompra.getString("fk_usuario_com"),
                        resultCompra.getInt("fk_libro"),
                        resultCompra.getString("fk_usuario_ven"),
                        resultCompra.getString("titulo_libro")
                ));
                resultCompra.next();
            }
            resultCompra.close();
            return listaCompra;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public ArrayList<ModeloCompra> mostrarVentasPorUsuario(String usuario){
           try {
            ArrayList<ModeloCompra> listaCompra = new ArrayList<>();
            ResultSet resultCompra;
            PreparedStatement sql = con.prepareStatement(""
                    + "SELECT titulo_libro, id, fecha, fk_usuario_com, "
                    + "fk_libro, fk_usuario_ven "
                    + "FROM libros, compra "
                    + "WHERE fk_usuario_ven = ? AND fk_libro = id_libro");
            sql.setString(1, usuario);
            resultCompra = sql.executeQuery();
            resultCompra.first();

            while (!resultCompra.isAfterLast()) {
                listaCompra.add(new ModeloCompra(
                        resultCompra.getInt("id"),
                        resultCompra.getDate("fecha"),
                        resultCompra.getString("fk_usuario_com"),
                        resultCompra.getInt("fk_libro"),
                        resultCompra.getString("fk_usuario_ven"),
                        resultCompra.getString("titulo_libro")
                ));
                resultCompra.next();
            }
            resultCompra.close();
            return listaCompra;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
