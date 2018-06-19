package encrypt;
 
/**
 * Clase que consume los métodos de la clase StringEncrypt
 * @author Julio Chinchilla
 */
public class Main {
 
 public static void main(String[] args) throws Exception {
 String key = "92AE31A79FEEB2A3"; //llave
 String iv = "0123456789ABCDEF"; // vector de inicialización
 String cleartext = "Culisimo";
 System.out.println("Texto encriptado: "+encrypt.StringEncrypt.encrypt(key, iv,cleartext));
 System.out.println("Texto desencriptado: "+encrypt.StringEncrypt.decrypt(key, iv,encrypt.StringEncrypt.encrypt(key, iv,cleartext)));
 }
 
}