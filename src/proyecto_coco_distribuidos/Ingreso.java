/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_coco_distribuidos;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Danae
 */
public class Ingreso extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
      
        initComponents();
        this.setLocationRelativeTo(null);
        cargaricono();
        JFrame mainFrame = new JFrame("No Resizable!!");
        mainFrame.setResizable(false);
        
    }
    
    public void cargaricono(){
   Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png"));
   setIconImage(icon);
   setVisible(true);
   this.setLocationRelativeTo(null);
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Contrasena = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setName(""); // NOI18N
        label2.setText("Proyecto Escolar Distribuidos");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngreso.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, 260));

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Biblioteca de Alejandria");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(153, 153, 153));
        label3.setName(""); // NOI18N
        label3.setText(" Usuario:");

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(153, 153, 153));
        label4.setText("Contraseña:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioIngreso.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        Contrasena.setBackground(new java.awt.Color(239, 239, 239));
        Contrasena.setForeground(new java.awt.Color(153, 153, 153));
        Contrasena.setBorder(null);

        Usuario.setBackground(new java.awt.Color(239, 239, 239));
        Usuario.setForeground(new java.awt.Color(153, 153, 153));
        Usuario.setBorder(null);

        botonIngresar.setForeground(new java.awt.Color(153, 153, 153));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        botonRegistro.setBackground(new java.awt.Color(239, 239, 239));
        botonRegistro.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(153, 153, 153));
        botonRegistro.setText("Crear una cuenta");
        botonRegistro.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(Usuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistro)
                            .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegistro)
                .addContainerGap())
        );

        Contrasena.getAccessibleContext().setAccessibleName("Contrasena");
        Usuario.getAccessibleContext().setAccessibleName("Usuario");
        Usuario.getAccessibleContext().setAccessibleDescription("");
        botonRegistro.getAccessibleContext().setAccessibleName("Registro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}
