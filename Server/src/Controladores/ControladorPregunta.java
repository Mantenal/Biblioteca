/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import Modelos.ModeloPregunta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristofer
 */
public class ControladorPregunta extends Conexion {
    public ControladorPregunta(){
        super();
    }
    
    public boolean insertPregunta(String titulo, String texto, String usuario){
        try {
            PreparedStatement sql = con.prepareStatement(" INSERT INTO pregunta(titulo_pregunta, texto, fk_usuario) VALUES (?, ?, ?)");
            sql.setString(1, titulo);
            sql.setString(2, texto);
            sql.setString(3, usuario);
            if (sql.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorPregunta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<ModeloPregunta> allPreguntas(){
            try {
            ArrayList<ModeloPregunta> listaPreguntas = new ArrayList<>();
            ResultSet resultPreguntas;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM pregunta"
            );

            resultPreguntas = sql.executeQuery();
            resultPreguntas.first();

            while (!resultPreguntas.isAfterLast()) {
                listaPreguntas.add(new ModeloPregunta(
                        resultPreguntas.getInt("id_pregunta"),
                        resultPreguntas.getString("titulo_pregunta"),
                        resultPreguntas.getString("texto"),
                        resultPreguntas.getString("fk_usuario")
                ));
                resultPreguntas.next();
            }
            resultPreguntas.close();
            return listaPreguntas;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPregunta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public ArrayList<ModeloPregunta> allPreguntasExceptPropias(String usuario){
            try {
            ArrayList<ModeloPregunta> listaPreguntas = new ArrayList<>();
            ResultSet resultPreguntas;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM pregunta WHERE fk_usuario != ?"
            );
            sql.setString(1, usuario);
            resultPreguntas = sql.executeQuery();
            resultPreguntas.first();

            while (!resultPreguntas.isAfterLast()) {
                listaPreguntas.add(new ModeloPregunta(
                        resultPreguntas.getInt("id_pregunta"),
                        resultPreguntas.getString("titulo_pregunta"),
                        resultPreguntas.getString("texto"),
                        resultPreguntas.getString("fk_usuario")
                ));
                resultPreguntas.next();
            }
            resultPreguntas.close();
            return listaPreguntas;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    public ArrayList<ModeloPregunta> allPreguntasPropias(String usuario){
            try {
            ArrayList<ModeloPregunta> listaPreguntas = new ArrayList<>();
            ResultSet resultPreguntas;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM pregunta WHERE fk_usuario = ?"
            );
            sql.setString(1, usuario);
            resultPreguntas = sql.executeQuery();
            resultPreguntas.first();

            while (!resultPreguntas.isAfterLast()) {
                listaPreguntas.add(new ModeloPregunta(
                        resultPreguntas.getInt("id_pregunta"),
                        resultPreguntas.getString("titulo_pregunta"),
                        resultPreguntas.getString("texto"),
                        resultPreguntas.getString("fk_usuario")
                ));
                resultPreguntas.next();
            }
            resultPreguntas.close();
            return listaPreguntas;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    public ArrayList<ModeloPregunta> buscarPregunta(String busqueda){
            try {
            ArrayList<ModeloPregunta> listaPreguntas = new ArrayList<>();
            ResultSet resultPreguntas;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM pregunta WHERE titulo_pregunta LIKE ?"
            );

            sql.setString(1, ("%"+busqueda+"%"));
            resultPreguntas = sql.executeQuery();
            resultPreguntas.first();

            while (!resultPreguntas.isAfterLast()) {
                listaPreguntas.add(new ModeloPregunta(
                        resultPreguntas.getInt("id_pregunta"),
                        resultPreguntas.getString("titulo_pregunta"),
                        resultPreguntas.getString("texto"),
                        resultPreguntas.getString("fk_usuario")
                ));
                resultPreguntas.next();
            }
            resultPreguntas.close();
            return listaPreguntas;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
