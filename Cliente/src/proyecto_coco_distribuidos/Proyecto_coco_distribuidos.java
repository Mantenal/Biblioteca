/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_coco_distribuidos;

import Main.ConexionRMI;
import java.rmi.RemoteException;

/**
 *
 * @author Danae
 */
public class Proyecto_coco_distribuidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here

        Principal inicio = new Principal();
        inicio.setVisible(true);
        ConexionRMI client = new ConexionRMI();
    }

}
