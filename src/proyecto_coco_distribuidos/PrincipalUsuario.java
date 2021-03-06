/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_coco_distribuidos;

/**
 *
 * @author Danae
 */
public class PrincipalUsuario extends javax.swing.JPanel {

    /**
     * Creates new form PrincipalUsuario
     */
    public PrincipalUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SinUsuario = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label2 = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Saldo1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonNuevaVenta = new javax.swing.JButton();
        botonNuevaPublicacion = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        botonMisVentas = new javax.swing.JButton();
        botonMisPublicaciones = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        botonMisLibros = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();

        SinUsuario.setBackground(new java.awt.Color(204, 204, 255));
        SinUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Biblioteca de Alejandria");
        SinUsuario.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        label2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setName(""); // NOI18N
        label2.setText("Proyecto Escolar Distribuidos");
        SinUsuario.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 200, -1));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 348, 206, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioIngreso.png"))); // NOI18N
        SinUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 66, -1, -1));

        Usuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Usuario.setForeground(new java.awt.Color(153, 153, 153));
        Usuario.setText("Nombre de Usuario");
        SinUsuario.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 136, -1, -1));

        Saldo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Saldo1.setForeground(new java.awt.Color(153, 153, 153));
        Saldo1.setText("$Saldo");
        SinUsuario.add(Saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 158, -1, -1));

        botonSalir.setBackground(new java.awt.Color(204, 204, 255));
        botonSalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        SinUsuario.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 198, -1));

        botonNuevaVenta.setBackground(new java.awt.Color(204, 204, 255));
        botonNuevaVenta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        botonNuevaVenta.setText("Vender un libro");
        botonNuevaVenta.setBorder(null);
        botonNuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNuevaVentaMouseClicked(evt);
            }
        });
        SinUsuario.add(botonNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 186, 26));

        botonNuevaPublicacion.setBackground(new java.awt.Color(204, 204, 255));
        botonNuevaPublicacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonNuevaPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        botonNuevaPublicacion.setText("Hacer una publicacion");
        botonNuevaPublicacion.setBorder(null);
        botonNuevaPublicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNuevaPublicacionMouseClicked(evt);
            }
        });
        SinUsuario.add(botonNuevaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 196, 21));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, 196, -1));

        botonMisVentas.setBackground(new java.awt.Color(204, 204, 255));
        botonMisVentas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonMisVentas.setForeground(new java.awt.Color(255, 255, 255));
        botonMisVentas.setText("Mis ventas");
        botonMisVentas.setBorder(null);
        SinUsuario.add(botonMisVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 196, 22));

        botonMisPublicaciones.setBackground(new java.awt.Color(204, 204, 255));
        botonMisPublicaciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonMisPublicaciones.setForeground(new java.awt.Color(255, 255, 255));
        botonMisPublicaciones.setText("Mis publicaciones");
        botonMisPublicaciones.setBorder(null);
        SinUsuario.add(botonMisPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 196, 21));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 206, 10));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 206, 10));

        botonMisLibros.setBackground(new java.awt.Color(204, 204, 255));
        botonMisLibros.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonMisLibros.setForeground(new java.awt.Color(255, 255, 255));
        botonMisLibros.setText("Mis libros");
        botonMisLibros.setBorder(null);
        botonMisLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMisLibrosActionPerformed(evt);
            }
        });
        SinUsuario.add(botonMisLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 30));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        SinUsuario.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 206, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SinUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SinUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevaVentaMouseClicked
        // TODO add your handling code here:
        PublicacionLibro libro=new PublicacionLibro();
        libro.setVisible(true);
    }//GEN-LAST:event_botonNuevaVentaMouseClicked

    private void botonNuevaPublicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevaPublicacionMouseClicked
        // TODO add your handling code here:
        PublicacionForo foro= new PublicacionForo();
        foro.setVisible(true);
    }//GEN-LAST:event_botonNuevaPublicacionMouseClicked

    private void botonMisLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMisLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMisLibrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Saldo1;
    private javax.swing.JPanel SinUsuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton botonMisLibros;
    private javax.swing.JButton botonMisPublicaciones;
    private javax.swing.JButton botonMisVentas;
    private javax.swing.JButton botonNuevaPublicacion;
    private javax.swing.JButton botonNuevaVenta;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private java.awt.Label label2;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}
