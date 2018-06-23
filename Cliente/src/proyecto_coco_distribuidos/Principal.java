/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_coco_distribuidos;

import Extras.UsuarioAux;
import Main.ConexionRMI;
import Modelos.ModeloCompra;
import Modelos.ModeloPregunta;
import Modelos.ModeloUsuario;
import RMI.Informacion;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Danae
 */
public class Principal extends javax.swing.JFrame {

    public static int opcion = 0;
    private Informacion vinculo;
    private ModeloUsuario usuarios;
    private JLabel nombre;
    private JLabel saldo;

    /**
     * Creates new form Principal
     */
    public Principal() throws RemoteException {
        initComponents();
        vinculo = new ConexionRMI().getC();
        if ((UsuarioAux.getUsername()).equals(" ")) {
            sinUsuario();
        } else {
            conUsuario();
        }
        cargaricono();
        publicaciones();
        this.setLocationRelativeTo(null);
    }

    public void agregarPublicacion(JComponent c) {
        MuestraPublicaciones.add(c);
        MuestraPublicaciones.setPreferredSize(new Dimension(
                (int) MuestraPublicaciones.getPreferredSize().getWidth(),
                (int) MuestraPublicaciones.getPreferredSize().getHeight() + c.getHeight()));
    }

    public void publicaciones() {
        MuestraPublicaciones.setPreferredSize(new Dimension(
                (int) MuestraPublicaciones.getPreferredSize().getWidth(),
                0));
        /*int i = 0;
        MuestraPublicaciones.removeAll();
        MuestraPublicaciones.repaint();
        MuestraPublicaciones.revalidate();
        try {
            ArrayList<ModeloCompra> compras = vinculo.mostrarComprasPorUsuario(UsuarioAux.getUsername());
            if(compras != null){
            for (ModeloCompra c : compras) {

                Libro libro = new Libro();
                Label titulo = libro.getTitulo();
                Label autor = libro.getPublicacionAutor();
                Label precio = libro.getPublicacionPrecio();
                Label descripcion = libro.getPublicacionDescripcion();
                titulo.setText(c.getTituloLibro());
                autor.setText(c.getAutorLibro());
                precio.setText(String.valueOf(c.getPrecio()));
                descripcion.setText(c.getDescripcionLibro());
                libro.setBounds(0, i, 547, 200);
                agregarPublicacion((JComponent) libro);
                i += 200;
            }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }

    public void mostrarCompras() throws RemoteException{
        int i = 0;
        MuestraPublicaciones.removeAll();
        MuestraPublicaciones.repaint();
        MuestraPublicaciones.revalidate();
        try {
            ArrayList<ModeloCompra> compras = vinculo.mostrarComprasPorUsuario(UsuarioAux.getUsername());
            if(compras != null){
            for (ModeloCompra c : compras) {
                Libro libro = new Libro();
                Label titulo = libro.getTitulo();
                Label autor = libro.getPublicacionAutor();
                Label precio = libro.getPublicacionPrecio();
                Label descripcion = libro.getPublicacionDescripcion();
                titulo.setText(c.getTituloLibro());
                autor.setText(c.getAutorLibro());
                precio.setText(String.valueOf(c.getPrecio()));
                descripcion.setText(c.getDescripcionLibro());
                libro.setBounds(0, i, 547, 200);
                agregarPublicacion((JComponent) libro);
                i += 200;
            }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrarPreguntas() throws RemoteException{
        int i = 0;
        MuestraPublicaciones.removeAll();
        MuestraPublicaciones.repaint();
        MuestraPublicaciones.revalidate();
        try {
            ArrayList<ModeloPregunta> preguntas = vinculo.allPreguntasExceptPropias(UsuarioAux.getUsername());
            if(preguntas != null){
            for (ModeloPregunta c : preguntas) {
                Pregunta pregunta = new Pregunta();
                Label titulo = pregunta.getTituloPregunta();
                Label descripcion = pregunta.getDescripcionPublicacion();
                titulo.setText(c.getTituloPregunta());
                descripcion.setText(c.getTexto());
                pregunta.setBounds(0, i, 547, 200);
                agregarPublicacion((JComponent) pregunta);
                i += 200;
            }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void conUsuario() throws RemoteException {

        PrincipalUsuario t = new PrincipalUsuario(this);
        usuarios = vinculo.getDatosUsuario(UsuarioAux.getUsername());
        saldo = t.getSaldo();
        nombre = t.getUsuario();
        saldo.setText("$" + String.valueOf(usuarios.getSaldo()));
        nombre.setText(String.valueOf(usuarios.getUsername()));
        t.setBounds(0, 0, 1000, 1000);
        PanelMenu.add((JComponent) t);
        this.revalidate();
        this.repaint();
        this.pack();
    }

    public void sinUsuario() {
        JComponent f = new PrincipalSinUsuario(this);
        f.setBounds(0, 0, 1000, 1000);
        PanelMenu.add(f);
        this.revalidate();
        this.repaint();
        this.pack();

    }

    public void cargaricono() {
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

        jTextField1 = new javax.swing.JTextField();
        PanelMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Buscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MuestraPublicaciones = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Principal");
        setResizable(false);

        PanelMenu.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Buscar.setForeground(new java.awt.Color(153, 153, 153));
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        botonBuscar.setForeground(new java.awt.Color(153, 153, 153));
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout MuestraPublicacionesLayout = new javax.swing.GroupLayout(MuestraPublicaciones);
        MuestraPublicaciones.setLayout(MuestraPublicacionesLayout);
        MuestraPublicacionesLayout.setHorizontalGroup(
            MuestraPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        MuestraPublicacionesLayout.setVerticalGroup(
            MuestraPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(MuestraPublicaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       
    }//GEN-LAST:event_BuscarActionPerformed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        // TODO add your handling code here:
        String busqueda = Buscar.getText();
        System.out.println("Aqui estoy");
        MuestraPublicaciones.removeAll();
            MuestraPublicaciones.repaint();
            MuestraPublicaciones.revalidate();
        try {
            int i = 0;
            ArrayList<ModeloPregunta> preguntasBuscar = vinculo.buscarPregunta(busqueda);
            if(preguntasBuscar != null){
            for (ModeloPregunta p : preguntasBuscar) {
                Pregunta miPregunta = new Pregunta();
                Label tituloPregunta = miPregunta.getTituloPregunta();
                Label descripcionPregunta = miPregunta.getDescripcionPublicacion();
                
                tituloPregunta.setText(p.getTituloPregunta());
                descripcionPregunta.setText(p.getTexto());
                miPregunta.setBounds(0, i, 547, 200);
                agregarPublicacion((JComponent) miPregunta);
                i += 200;
                
            }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JPanel MuestraPublicaciones;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
