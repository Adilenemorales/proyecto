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
 * @author Precision
 */
public class Clientes1 extends javax.swing.JFrame {
String idCliente,nombre,apePat,apeMat,direccion,sexo;    

DefaultTableModel model,dato;
    /**
     * Creates new form Clientes
     */
    public Clientes1() {
        initComponents();
        limpiar();
        desbloquear();
        cargar("");
    }
    void cargar (String valor){
    String [] titulos = {"idCliente","nombre","apePat","apeMat","direccion","sexo"};
    String [] registros = new String [6];
    String sql = "SELECT * FROM clientes WHERE CONCAT(nombre) like '%"+valor+"%'";
    
    model = new DefaultTableModel(null, titulos);
            
    conectar cc = new conectar();
    Connection cn =cc.conexion();
        
    try {
        Statement  st =cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
    
        while (rs.next()){
                registros[0]=rs.getString("idCliente");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("apePat");
                registros[3]=rs.getString("apeMat");
                registros[4]=rs.getString("direccion");
                registros[5]=rs.getString("sexo");
                
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
    txtapepat.setText("");
    txtapemat.setText("");
    txtdireccion.setText("");
    cbsexo.setSelectedItem(0);
    
    }
    void bloquear(){
    txtid.setEnabled(false);
    txtnombre.setEnabled(false);
    txtapepat.setEnabled(false);
    txtapemat.setEnabled(false);
    txtdireccion.setEnabled(false);
    cbsexo.setEnabled(false);
    btnuevo.setEnabled(false);
    btguardar.setEnabled(false);
    btcancelar.setEnabled(false); 
    btsalir.setEnabled(false); 
    }
    void desbloquear(){
    txtid.setEnabled(false);
    txtnombre.setEnabled(true);
    txtapepat.setEnabled(true);
    txtapemat.setEnabled(true);
    txtdireccion.setEnabled(true);
    cbsexo.setEnabled(true);
    btnuevo.setEnabled(true);
    btguardar.setEnabled(true);
    btcancelar.setEnabled(true); 
    btsalir.setEnabled(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapepat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtapemat = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbsexo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        btEliminar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btMostrartodo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, -1));

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 150, -1));

        txtapepat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapepatActionPerformed(evt);
            }
        });
        getContentPane().add(txtapepat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, -1));

        jLabel1.setText("IdCliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel3.setText("ApellidoPat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtapemat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapematActionPerformed(evt);
            }
        });
        getContentPane().add(txtapemat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, -1));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, -1));

        jLabel4.setText("ApellidoMat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 20));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
        cbsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsexoActionPerformed(evt);
            }
        });
        getContentPane().add(cbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, -1));

        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

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
        jScrollPane2.setViewportView(tdatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 440, 90));

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 340, 30));

        jLabel8.setText("Buscar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btMostrartodo.setText("Mostrar todo");
        btMostrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrartodoActionPerformed(evt);
            }
        });
        getContentPane().add(btMostrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo4.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 490, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
    limpiar();    // mandamos a llamarel void
    desbloquear();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
    txtid.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void cbsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexoActionPerformed
    cbsexo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbsexoActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
    bloquear() ; // mandamos a llamarel void
    }//GEN-LAST:event_btcancelarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
    txtnombre.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapepatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapepatActionPerformed
    txtapepat.transferFocus();    // TODO add your handling code here:
    }//GEN-LAST:event_txtapepatActionPerformed

    private void txtapematActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapematActionPerformed
    txtapemat.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtapematActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
    txtdireccion.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        
        conectar c = new conectar();
        Connection cn = c.conexion();

        String sql = "";
            nombre = txtnombre.getText();
            apePat = txtapepat.getText();
            apeMat = txtapemat.getText();
            direccion = txtdireccion.getText();
            sexo = cbsexo.getSelectedItem().toString();
          
            sql= "INSERT INTO clientes(nombre, apePat, apeMat, direccion, sexo) VALUES (?, ?, ?, ?, ?)";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2,apePat);
            pst.setString(3,apeMat);
            pst.setString(4,direccion);
            pst.setString(5,sexo);
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
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
       conectar c = new conectar();
     Connection cn = c.conexion();

        try{
        int fila = tdatos.getSelectedRow();
        String sql = "delete from clientes where idCliente =" + tdatos.getValueAt(fila, 0);
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

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
       int filasele = tdatos.getSelectedRow();
     txtnombre.setText(tdatos.getValueAt(filasele, 1 ).toString());
     txtapepat.setText(tdatos.getValueAt(filasele, 2 ).toString());
     txtapemat.setText(tdatos.getValueAt(filasele, 3 ).toString());
     txtdireccion.setText(tdatos.getValueAt(filasele, 4 ).toString());
     cbsexo.setSelectedItem(tdatos.getValueAt(filasele, 5 ).toString());
     filas =filasele;
     desbloquear();

        // TODO add your handling code here:
    }//GEN-LAST:event_tdatosMouseClicked

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        conectar c = new conectar();
            Connection cn = c.conexion();
            
        try{
            String sql = "UPDATE clientes SET nombre=?, apePat=?, apeMat=?, direccion=?, sexo=?" +
                    "WHERE idCliente=?";
            int fila = tdatos.getSelectedRow();
            String dato =(String) tdatos.getValueAt(fila, 0);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtapepat.getText());
            pst.setString(3, txtapemat.getText());
            pst.setString(4, txtdireccion.getText());
            pst.setString(5, cbsexo.getSelectedItem().toString());
                     
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

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
       this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(Clientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes1().setVisible(true);
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
    private javax.swing.JComboBox cbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtapemat;
    private javax.swing.JTextField txtapepat;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
int filas;

private void cargar(){

}
}