/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_coco_distribuidos;

import java.awt.Label;

/**
 *
 * @author Danae
 */
public class Pregunta extends javax.swing.JPanel {

    /**
     * Creates new form Pregunta
     */
    public Pregunta() {
        initComponents();
    }

    public Label getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(Label descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }

    public Label getTituloPregunta() {
        return tituloPregunta;
    }

    public void setTituloPregunta(Label tituloPregunta) {
        this.tituloPregunta = tituloPregunta;
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
        tituloPregunta = new java.awt.Label();
        label6 = new java.awt.Label();
        descripcionPublicacion = new java.awt.Label();
        BotonResponder = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(216, 216, 216));

        tituloPregunta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tituloPregunta.setForeground(new java.awt.Color(255, 255, 255));
        tituloPregunta.setText("Yo soy el Titulo de la pregunta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label6.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        label6.setForeground(new java.awt.Color(153, 153, 153));
        label6.setText("Descripcion:");

        descripcionPublicacion.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        descripcionPublicacion.setForeground(new java.awt.Color(102, 102, 102));
        descripcionPublicacion.setText("yo soy la descripcion");

        BotonResponder.setForeground(new java.awt.Color(153, 153, 153));
        BotonResponder.setText("Responder");
        BotonResponder.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BotonResponder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonResponderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BotonResponder, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonResponder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonResponderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonResponderMouseClicked
        // TODO add your handling code here:
        PublicacionLibro libro =new PublicacionLibro();
        libro.setVisible(true);
    }//GEN-LAST:event_BotonResponderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResponder;
    private java.awt.Label descripcionPublicacion;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label6;
    private java.awt.Label tituloPregunta;
    // End of variables declaration//GEN-END:variables
}
