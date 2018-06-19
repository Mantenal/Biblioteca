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

    private static Connection con;

    public ControladorCompra() {
        super();
        this.con = super.getCon();
    }

    public static ArrayList<ModeloCompra> mostrarTodos() {
        try {
            ArrayList<ModeloCompra> listaCompras = new ArrayList<>();
            ResultSet resultCompras;
            PreparedStatement sql = con.prepareStatement("SELECT *FROM compra_venta");

            resultCompras = sql.executeQuery();
            resultCompras.first();

            while (!resultCompras.isAfterLast()) {
                listaCompras.add(new ModeloCompra(
                        resultCompras.getInt("id"),
                        resultCompras.getDate("fecha"),
                        resultCompras.getString("fk_usuario_com"),
                        resultCompras.getInt("fk_libro"),
                        resultCompras.getString("fk_usuario_ven")
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
    /*
    public static ArrayList<ModeloCompra> mostrarUno(int id){
           try {
            ArrayList<ModeloCompra> listaCompra = new ArrayList<>();
            ResultSet resultLibros;
            PreparedStatement sql = con.prepareStatement(""
                    + "SELECT *"
                    + "FROM libros "
                    + "WHERE id_libro = ?");
            sql.setInt(1, id);
            resultLibros = sql.executeQuery();
            resultLibros.first();

            while (!resultLibros.isAfterLast()) {
                listaCompra.add(new ModeloLibros(
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
            return listaCompra;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }*/

}
