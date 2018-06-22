/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import Controladores.ControladorCompra;
import Controladores.ControladorLibros;
import Controladores.ControladorPregunta;
import Controladores.ControladorRespuesta;
import Controladores.ControladorUsuario;
import Modelos.ModeloCompra;
import Modelos.ModeloLibros;
import Modelos.ModeloPregunta;
import Modelos.ModeloRespuesta;
import Modelos.ModeloUsuario;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Impl extends java.rmi.server.UnicastRemoteObject implements Informacion{
    
  
    ControladorUsuario user=new ControladorUsuario();
    ControladorRespuesta res=new ControladorRespuesta();
    ControladorPregunta pre=new ControladorPregunta();
    ControladorLibros lib=new ControladorLibros();
    ControladorCompra com=new ControladorCompra();
    
    public Impl() 
	throws java.rmi.RemoteException { 
	super(); 
	} 
    
    /**
     * 
     * @param usuario
     * @param pass
     * @param correo
     * @param saldo
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public boolean insertUsuario(String usuario, String pass, String correo, double saldo)
            throws java.rmi.RemoteException{
        return (user.insertUsuario(usuario, pass, correo, saldo));
    }
    
    /**
     * 
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
   public boolean checkUsuarioExistente(String usuario)
           throws java.rmi.RemoteException{
        return(user.checkUsuarioExistente(usuario));
    }
   
   /**
    * 
    * @param usuario
    * @param password
    * @return
    * @throws java.rmi.RemoteException 
    */
    @Override
    public boolean logInUsuario(String usuario, String password)
           throws java.rmi.RemoteException{
        return(user.logInUsuario(usuario, password));
    }
    
    /**
     * 
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ModeloUsuario getDatosUsuario(String usuario)
            throws java.rmi.RemoteException{
        return(user.getDatosUsuario(usuario));
    }
     
    /**
     * 
     * @param titulo
     * @param texto
     * @param usuario
     * @param pregunta
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public boolean insertRespuesta(String titulo, String texto, String usuario, int pregunta)
            throws java.rmi.RemoteException{
        return(res.insertRespuesta(titulo, texto, usuario, pregunta));  
    }
     
    /**
     * 
     * @param pregunta
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloRespuesta> allRespuestasPorPregunta(int pregunta)
            throws java.rmi.RemoteException{
        return(res.allRespuestasPorPregunta(pregunta));
    }
    
    /**
     * 
     * @param titulo
     * @param texto
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public boolean insertPregunta(String titulo, String texto, String usuario)
            throws java.rmi.RemoteException{
        return(pre.insertPregunta(titulo, texto, usuario));
    }
    
    /**
     * 
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloPregunta> allPreguntas()
            throws java.rmi.RemoteException{
        return(pre.allPreguntas());
    }
    
    /**
     * 
     * @param busqueda
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloPregunta> buscarPregunta(String busqueda)
            throws java.rmi.RemoteException{
        return(pre.buscarPregunta(busqueda));
    }
    
    /**
     * 
     * @param tituloLibro
     * @param autor
     * @param descripcion
     * @param estado
     * @param precio
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public boolean insertLibro(String tituloLibro, String autor, String descripcion, int estado, double precio, String usuario)
            throws java.rmi.RemoteException{
        return(lib.insertLibro(tituloLibro, autor, descripcion, estado, precio, usuario));
    }

    /**
     *
     * @param usuario
     * @return
     * @throws RemoteException
     */
    @Override
    public ArrayList<ModeloLibros> mostrarTodosPorUsuario(String usuario)
              throws java.rmi.RemoteException{
        return(lib.mostrarTodosPorUsuario(usuario));
    }
    
    /**
     * 
     * @param id
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloLibros> mostrarUnoPorUsuario(int id, String usuario)
            throws java.rmi.RemoteException{
        return(lib.mostrarUnoPorUsuario(id, usuario));
    }
    
    /**
     * 
     * @param usuario
     * @param estado
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloLibros> mostrarLibrosPorEstado(String usuario, int estado)
            throws java.rmi.RemoteException{
        return(lib.mostrarLibrosPorEstado(usuario, estado));
    }
    
    /**
     * 
     * @param fecha
     * @param usuarioCompra
     * @param idLibro
     * @param usuarioVenta
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public boolean insertCompra(Date fecha, String usuarioCompra, int idLibro, String usuarioVenta) 
            throws java.rmi.RemoteException{
        return(com.insertCompra(fecha, usuarioCompra, idLibro, usuarioVenta));
    }
    
    /**
     * 
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloCompra> mostrarTodos() 
            throws java.rmi.RemoteException{
        return(com.mostrarTodos());   
    }
    
    /**
     * 
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloCompra> mostrarComprasPorUsuario(String usuario)
            throws java.rmi.RemoteException{
        return(com.mostrarComprasPorUsuario(usuario));
    }
    
    /**
     * 
     * @param usuario
     * @return
     * @throws java.rmi.RemoteException 
     */
    @Override
    public ArrayList<ModeloCompra> mostrarVentasPorUsuario(String usuario)
            throws java.rmi.RemoteException{
        return(com.mostrarVentasPorUsuario(usuario));
    }
       
}
