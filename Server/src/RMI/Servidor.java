/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.Naming;

			public class Servidor {

			   public Servidor() {
			     try {
			       Informacion c = new Impl();
			       Naming.rebind("rmi://localhost:1099/ServidorAl", c);
			     } catch (Exception e) {
			       System.out.println("Trouble: " + e);
			     }
			   }
	
			   public static void main(String args[]) {
			     new Servidor();
			   }
			}
			