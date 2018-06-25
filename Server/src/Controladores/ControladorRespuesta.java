/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Conexion.Conexion;
import Modelos.ModeloPregunta;
import Modelos.ModeloRespuesta;
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
public class ControladorRespuesta extends Conexion {

    public ControladorRespuesta() {
        super();
    }

    public boolean insertRespuesta(String titulo, String texto, String usuario, int pregunta) {
        try {
            PreparedStatement sql = con.prepareStatement("INSERT INTO respuesta(titulo_respuesta, texto, fk_usuario, fk_pregunta) VALUES(?, ?, ?, ?)");
            sql.setString(1, titulo);
            sql.setString(2, texto);
            sql.setString(3, usuario);
            sql.setInt(4, pregunta);
            if (sql.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRespuesta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<ModeloRespuesta> allRespuestasPorPregunta(int pregunta) {
        try {
            ArrayList<ModeloRespuesta> listaRespuestas = new ArrayList<>();
            ResultSet resultRespuesta;
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM respuesta WHERE fk_pregunta = ?"
            );
            
            sql.setInt(1, pregunta);
            resultRespuesta = sql.executeQuery();
            resultRespuesta.first();

            while (!resultRespuesta.isAfterLast()) {
                listaRespuestas.add(new ModeloRespuesta(
                        resultRespuesta.getInt("id_respuesta"),
                        resultRespuesta.getString("titulo_respuesta"),
                        resultRespuesta.getString("texto"),
                        resultRespuesta.getString("fk_usuario"),
                        resultRespuesta.getInt("fk_pregunta")
                ));
                resultRespuesta.next();
            }
            resultRespuesta.close();
            return listaRespuestas;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    

}
