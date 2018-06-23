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
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

/**
 *
 * @author Carlos
 */
public class ControladorCompra extends Conexion {

    public ControladorCompra() {
        super();
    }

    public boolean insertCompra(Date fecha, String usuarioCompra, int idLibro, String usuarioVenta) {
        try {
            PreparedStatement sql = con.prepareStatement(
                    "INSERT INTO compra_venta VALUES (?, ?, ?, ?, ?, ?)");
            sql.setDate(1, fecha);
            sql.setString(2, usuarioCompra);
            sql.setInt(3, idLibro);
            sql.setString(4, usuarioVenta);
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

    public ArrayList<ModeloCompra> mostrarTodos() {
        try {
            ArrayList<ModeloCompra> listaCompras = new ArrayList<>();
            ResultSet resultCompras;
            PreparedStatement sql = con.prepareStatement("SELECT titulo_libro, id, fecha, fk_usuario_com, fk_libro, fk_usuario_ven FROM compra_venta, libros");

            resultCompras = sql.executeQuery();
            resultCompras.first();
            listaCompras.add(new ModeloCompra(
                        resultCompras.getInt("id"),
                        resultCompras.getDate("fecha"),
                        resultCompras.getString("fk_usuario_com"),
                        resultCompras.getInt("fk_libro"),
                        resultCompras.getString("fk_usuario_ven"),
                        resultCompras.getString("titulo_libro"),
                        resultCompras.getString("descripcion"),
                        resultCompras.getString("autor"),
                        resultCompras.getDouble("precio")
                ));
            resultCompras.close();
            return listaCompras;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<ModeloCompra> mostrarComprasPorUsuario(String usuario) {
        try {
            ArrayList<ModeloCompra> listaCompra = new ArrayList<>();
            ResultSet resultCompra;
            PreparedStatement sql = con.prepareStatement("SELECT titulo_libro, descripcion, autor, precio, id, fecha, fk_usuario_com, fk_libro, fk_usuario_ven FROM libros, compra_venta WHERE fk_usuario_com = ? AND fk_libro = id_libro");
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
                        resultCompra.getString("titulo_libro"),
                        resultCompra.getString("descripcion"),
                        resultCompra.getString("autor"),
                        resultCompra.getDouble("precio")
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

    public ArrayList<ModeloCompra> mostrarVentasPorUsuario(String usuario) {
        try {
            ArrayList<ModeloCompra> listaCompra = new ArrayList<>();
            ResultSet resultCompra;
            PreparedStatement sql = con.prepareStatement("SELECT titulo_libro, descripcion, autor, precio, id, fecha, fk_usuario_com, fk_libro, fk_usuario_ven FROM libros, compra_venta WHERE fk_usuario_ven = ? AND fk_libro = id_libro");
            sql.setString(1, usuario);
            resultCompra = sql.executeQuery();
            resultCompra.first();

                listaCompra.add(new ModeloCompra(
                        resultCompra.getInt("id"),
                        resultCompra.getDate("fecha"),
                        resultCompra.getString("fk_usuario_com"),
                        resultCompra.getInt("fk_libro"),
                        resultCompra.getString("fk_usuario_ven"),
                        resultCompra.getString("titulo_libro"),
                        resultCompra.getString("descripcion"),
                        resultCompra.getString("autor"),
                        resultCompra.getDouble("precio")
                ));
                resultCompra.next();
            resultCompra.close();
            return listaCompra;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
