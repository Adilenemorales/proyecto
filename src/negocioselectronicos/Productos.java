/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocioselectronicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Adilene
 */
public class Productos extends javax.swing.JFrame {
   String idProduto,nombre,modelo,marca,cantidad,precio;    

    DefaultTableModel model,dato;
    
    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
        limpiar();
        desbloquear();
        cargar("");
    }
    
    void cargar (String valor){
    String [] titulos = {"idProducto","nombre","modelo","marca","cantidad","precio"};
    String [] registros = new String [6];
    String sql = "SELECT * FROM productos WHERE CONCAT(nombre) like '%"+valor+"%'";
    
    model = new DefaultTableModel(null, titulos);
            
    conectar cc = new conectar();
    Connection cn =cc.conexion();
        
    try {
        Statement  st =cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
    
        while (rs.next()){
                registros[0]=rs.getString("idProducto");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("modelo");
                registros[3]=rs.getString("marca");
                registros[4]=rs.getString("cantidad");
                registros[5]=rs.getString("precio");
                
                model.addRow(registros);
            
                tdatos.setModel(model);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    
    }

    void limpiar(){
    txtid.setText("");
    txtnombre.setText("");
    txtmodelo.setText("");
    txtmarca.setText("");
    txtcantidad.setText("");
    txtprecio.setText("");
    
    }
    void bloquear(){
    txtid.setEnabled(false);
    txtnombre.setEnabled(false);
    txtmodelo.setEnabled(false);
    txtmarca.setEnabled(false);
    txtcantidad.setEnabled(false);
    txtprecio.setEnabled(false);
    btnuevo.setEnabled(false);
    btguardar.setEnabled(false);
    btcancelar.setEnabled(false); 
    btsalir.setEnabled(false); 
    }
    void desbloquear(){
    txtid.setEnabled(false);
    txtnombre.setEnabled(true);
    txtmodelo.setEnabled(true);
    txtmarca.setEnabled(true);
    txtcantidad.setEnabled(true);
    txtprecio.setEnabled(true);
    btnuevo.setEnabled(true);
    btguardar.setEnabled(true);
    btcancelar.setEnabled(true); 
    btsalir.setEnabled(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btMostrartodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("idProducto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 148, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 46, -1));

        jLabel3.setText("Modelo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel4.setText("Marca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 34, -1));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 148, -1));

        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 148, -1));

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 148, -1));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 148, -1));

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 148, -1));

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 330, 30));

        jLabel8.setText("Buscar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        btMostrartodo.setText("Mostrar todo");
        btMostrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrartodoActionPerformed(evt);
            }
        });
        getContentPane().add(btMostrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        tdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 480, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        txtid.transferFocus();
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        txtmodelo.transferFocus();
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        txtmarca.transferFocus();
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
       txtcantidad.transferFocus();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        txtprecio.transferFocus();
    }//GEN-LAST:event_txtprecioActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        limpiar();    // mandamos a llamarel void
        desbloquear();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed

        conectar c = new conectar();
        Connection cn = c.conexion();

        String sql = "";
        nombre = txtnombre.getText();
        modelo = txtmodelo.getText();
        marca = txtmarca.getText();
        cantidad = txtcantidad.getText();
        precio = txtprecio.getText();

        sql= "INSERT INTO productos(nombre, modelo, marca, cantidad, precio) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2,modelo);
            pst.setString(3,marca);
            pst.setString(4,cantidad);
            pst.setString(5,precio);
            int n = pst.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");

            cargar("");
            // bloquear();

        } catch (SQLException ex) {
            // LogRecord Le;
            JOptionPane.showMessageDialog(null, "No es pocible guardar");
    }//GEN-LAST:event_btguardarActionPerformed
    }
    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        bloquear() ; // mandamos a llamarel void
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        conectar c = new conectar();
        Connection cn = c.conexion();

        try{
            int fila = tdatos.getSelectedRow();
            String sql = "delete from productos where idProducto =" + tdatos.getValueAt(fila, 0);
            Statement  st =cn.createStatement();

            //PreparedStatement pst = cn.prepareStatement(sql);
            int n = st.executeUpdate(sql);

            if(n>0){
                cargar("");
                //desbloquear();
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS");

                limpiar();

            }

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        conectar c = new conectar();
        Connection cn = c.conexion();

        try{
            String sql = "UPDATE productos SET nombre=?, modelo=?, marca=?, cantidad=?, precio=?" +
            "WHERE idProducto=?";
            int fila = tdatos.getSelectedRow();
            String dato =(String) tdatos.getValueAt(fila, 0);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtmodelo.getText());
            pst.setString(3, txtmarca.getText());
            pst.setString(4, txtcantidad.getText());
            pst.setString(5, txtprecio.getText());

            pst.setString(6, dato);

            int n = pst.executeUpdate();
            if(n>0){

                cargar("");
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btModificarActionPerformed

    private void txtbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbuscarMouseClicked
        cargar(txtbuscar.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarMouseClicked

    private void btMostrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrartodoActionPerformed
        cargar("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btMostrartodoActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
         int filasele = tdatos.getSelectedRow();
        txtnombre.setText(tdatos.getValueAt(filasele, 1 ).toString());
        txtmodelo.setText(tdatos.getValueAt(filasele, 2 ).toString());
        txtmarca.setText(tdatos.getValueAt(filasele, 3 ).toString());
        txtcantidad.setText(tdatos.getValueAt(filasele, 4 ).toString());
        txtprecio.setText(tdatos.getValueAt(filasele, 5 ).toString());
        filas =filasele;
        desbloquear();
    }//GEN-LAST:event_tdatosMouseClicked

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btMostrartodo;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
int filas;

private void cargar(){

}

}

