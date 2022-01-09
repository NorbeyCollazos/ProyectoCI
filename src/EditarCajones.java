
import Clases.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EditarCajones extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarCajones
     */
     DefaultTableModel model;
    public EditarCajones() {
        initComponents();
        cargar("");
    }
    
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
    String Codigo, NombreC, Numcajon, Puesto = null;
    
    
    
      void limpiar(){
    
        nombre.setText("");
        numcajon.setText("");
        puesto.setText("");
        txtcodigo.setText("");
        txtcodigo.requestFocus();
        
         }
    
    

   
       void cargar(String valor){
        String []  titulos ={"CODIGO","NOMBRE DE LA CARPETA", "N° CAJON", "PUESTO"};

        String[] registros = new String[4];
        
        String sql = "SELECT * FROM carpetasc where nomcc LIKE '%"+valor+"%'";
        
        model = new DefaultTableModel(null,titulos);
        
        
        
         Conectar cc = new Conectar();
            //Connection cn = cc.getConnection();
            Connection cn = cc.getConnection();
        
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("codcc");
                registros[1]=rs.getString("nomcc");
                registros[2]=rs.getString("numcajon");
                registros[3]=rs.getString("puestocc");
                model.addRow(registros);
            }
            
            t_datos.setModel(model);
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
        
        
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        aux = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        panel1 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JFormattedTextField();
        btnconsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        puesto = new javax.swing.JEditorPane();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        numcajon = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Carpetas Cajones");

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banerc.png"))); // NOI18N
        jcMousePanel2.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/libroedi.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        aux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                auxMouseReleased(evt);
            }
        });
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar carpetas de los Cajones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Modificar Carpetas de los Cajones");

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t_datos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        t_datos.setRowHeight(22);
        t_datos.setSelectionBackground(new java.awt.Color(0, 102, 51));
        t_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_datos);

        jcMousePanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoguardar.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        panel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Código");

        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btc1.png"))); // NOI18N
        btnconsultar.setBorder(null);
        btnconsultar.setBorderPainted(false);
        btnconsultar.setContentAreaFilled(false);
        btnconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnconsultar.setIconTextGap(-3);
        btnconsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btc3.png"))); // NOI18N
        btnconsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btc2.png"))); // NOI18N
        btnconsultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnconsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de Carpeta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Número del Cajón");

        puesto.setContentType("number"); // NOI18N
        jScrollPane3.setViewportView(puesto);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Puesto de Carpeta");

        numcajon.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete2.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setIconTextGap(2);
        eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete3.png"))); // NOI18N
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete1.png"))); // NOI18N
        eliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz2.png"))); // NOI18N
        modificar1.setText("Modificar");
        modificar1.setBorder(null);
        modificar1.setBorderPainted(false);
        modificar1.setContentAreaFilled(false);
        modificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificar1.setIconTextGap(2);
        modificar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz3.png"))); // NOI18N
        modificar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        modificar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modificar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numcajon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numcajon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        aux.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void auxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auxMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_auxMouseReleased

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        // TODO add your handling code here:
        cargar(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

    String Consultar = null; 
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:

        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        Consultar = "SELECT * FROM Carpetasc WHERE codcc = '" + txtcodigo.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(Consultar);
            if (rs.next()) {
                txtcodigo.setText(rs.getString("codcc"));
                nombre.setText(rs.getString("nomcc"));
                //etmodulo.setSelectedItem(rs.getString("modulo"));
                numcajon.setText(rs.getString("numcajon"));
                puesto.setText(rs.getString("puestocc"));
            }
        } catch (Exception e) {
            System.out.println("Error En Buscar :" + e.getMessage());
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    String Eliminar = null;
    int Resulta_E;
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
         Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        
        NombreC = nombre.getText().toUpperCase().trim();
        
            Eliminar = "DELETE FROM carpetasc WHERE codcc = ?";
            
            int opcion=JOptionPane.showConfirmDialog(null,"Realmente decea Eliminar la carpeta \n"+NombreC,"Confirmar",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_NO_OPTION){
            
        try {
            ps = cn.prepareStatement(Eliminar);
            ps.setString(1, txtcodigo.getText());
            Resulta_E = ps.executeUpdate();
            if (Resulta_E == 1) {
                //System.out.println("Eliminado Con Exito");
                JOptionPane.showMessageDialog(null,"Se ha Eliminado la Carpeta");
                 cargar("");
                limpiar();
            } else {
                System.out.println("No Se Pudo Eliminar");
            }
        } catch (Exception e) {
            System.out.println("Error De Eliminar : " + e.getMessage());
        }
                }
         
                
    }//GEN-LAST:event_eliminarActionPerformed

     String Modificar = null;
    int Resultado_U;
    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
        // TODO add your handling code here:
         Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        
          Modificar = "UPDATE Carpetasc SET nomcc = ?,numcajon = ?,puestocc = ? WHERE codcc = ?";
        Codigo = txtcodigo.getText();
        NombreC = nombre.getText().toUpperCase().trim();
        Numcajon = numcajon.getText().toUpperCase().trim();
        Puesto = puesto.getText().toUpperCase().trim();
        
        
        try {
            ps = cn.prepareStatement(Modificar);
            ps.setString(1, NombreC);
            ps.setString(2, Numcajon);
            ps.setString(3, Puesto);
            ps.setString(4, Codigo);
            
            Resultado_U = ps.executeUpdate();
            if (Resultado_U == 1) {
                //System.out.println("Modificado Con Exito");
                JOptionPane.showMessageDialog(null,"Se han cambiado los datos");
                cargar("");
                limpiar();
            } else {
                System.out.println("No Se Pudo Modificar");
            }
        } catch (Exception e) {
            System.out.println("Error En Modificar : " + e.getMessage());
        }
    }//GEN-LAST:event_modificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField aux;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private javax.swing.JButton modificar1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numcajon;
    private java.awt.Panel panel1;
    private javax.swing.JEditorPane puesto;
    private javax.swing.JTable t_datos;
    private javax.swing.JFormattedTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
