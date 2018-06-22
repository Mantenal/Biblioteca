/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import Modelos.ModeloCompra;
import Modelos.ModeloLibros;
import Modelos.ModeloPregunta;
import Modelos.ModeloRespuesta;
import Modelos.ModeloUsuario;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface Informacion extends java.rmi.Remote{
    
    public boolean insertUsuario(String usuario, String pass, String correo, double saldo) 
            throws java.rmi.RemoteException;
    
    public boolean checkUsuarioExistente(String usuario)
           throws java.rmi.RemoteException;
    
    public boolean logInUsuario(String usuario, String password)
           throws java.rmi.RemoteException;
    
    public ModeloUsuario getDatosUsuario(String usuario)
            throws java.rmi.RemoteException;
    
    public boolean insertRespuesta(String titulo, String texto, String usuario, int pregunta)
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloRespuesta> allRespuestasPorPregunta(int pregunta)
            throws java.rmi.RemoteException;
    
    public boolean insertPregunta(String titulo, String texto, String usuario)
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloPregunta> allPreguntas()
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloPregunta> buscarPregunta(String busqueda)
            throws java.rmi.RemoteException;
    
    public boolean insertLibro(String tituloLibro, String autor, String descripcion, int estado, double precio, String usuario)
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloLibros> mostrarTodosPorUsuario(String usuario)
              throws java.rmi.RemoteException;
    
    public ArrayList<ModeloLibros> mostrarUnoPorUsuario(int id, String usuario)
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloLibros> mostrarLibrosPorEstado(String usuario, int estado)
            throws java.rmi.RemoteException;
    
    public boolean insertCompra(Date fecha, String usuarioCompra, int idLibro, String usuarioVenta) 
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloCompra> mostrarTodos() 
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloCompra> mostrarComprasPorUsuario(String usuario)
            throws java.rmi.RemoteException;
    
    public ArrayList<ModeloCompra> mostrarVentasPorUsuario(String usuario)
            throws java.rmi.RemoteException;
    
   
}
