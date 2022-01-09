
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
public class EditarModulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarModulo
     */
    Conectar con;
    DefaultTableModel model;
    
    public EditarModulo() {
        initComponents();
        cargar("");

    }
    

    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
    String Codigo, NombreC, Modulo, NumM, Puesto = null;
    
    
    
         void limpiar(){
    
        etnombre.setText("");
        etmodulo.setText("");//para limpiar un combo box
        etnummodulo.setText("");
        etpuesto.setText("");
        txtcodigo.setText("");
        txtcodigo.requestFocus();
        
         }
    
    
    
    
      
     void cargar(String valor){
        String []  titulos ={"CÓDIGO","NOMBRE DE LA CARPETA","MODULO","No MODULO", "PUESTO"};

        String[] registros = new String[5];
        
        String sql = "SELECT * FROM carpetasm where nom LIKE '%"+valor+"%' order by modulo asc";
        
        model = new DefaultTableModel(null,titulos);
        
        
        
         Conectar cc = new Conectar();
            //Connection cn = cc.getConnection();
            Connection cn = cc.getConnection();
        
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("cod");
                registros[1]=rs.getString("nom");
                registros[2]=rs.getString("modulo");
                registros[3]=rs.getString("numM");
                registros[4]=rs.getString("puesto");
                model.addRow(registros);
            }
            
            t_datos.setModel(model);
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
        
        
        
    }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel7 = new javax.swing.JLabel();
        aux = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        etnombre = new javax.swing.JFormattedTextField();
        etnummodulo = new javax.swing.JFormattedTextField();
        etpuesto = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        etmodulo = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Carpetas del Módulo");

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoguardar.jpg"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        jcMousePanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banerc.png"))); // NOI18N
        jcMousePanel3.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconbuscar.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Buscar carpetas del Módulo");

        javax.swing.GroupLayout jcMousePanel3Layout = new javax.swing.GroupLayout(jcMousePanel3);
        jcMousePanel3.setLayout(jcMousePanel3Layout);
        jcMousePanel3Layout.setHorizontalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jcMousePanel3Layout.setVerticalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jcMousePanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        t_datos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        t_datos.setGridColor(new java.awt.Color(204, 153, 0));
        t_datos.setRowHeight(22);
        t_datos.setSelectionBackground(new java.awt.Color(0, 153, 102));
        t_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_datos);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
            .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jcMousePanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jcMousePanel1Layout.createSequentialGroup()
                    .addComponent(jcMousePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addGap(568, 568, 568)))
        );

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realizar Cambios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoedit.jpg"))); // NOI18N
        jcMousePanel2.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        etnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etnombreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                etnombreMouseReleased(evt);
            }
        });
        etnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etnombreActionPerformed(evt);
            }
        });

        etnummodulo.setName(""); // NOI18N
        etnummodulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etnummoduloActionPerformed(evt);
            }
        });

        etpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etpuestoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de la Carpeta");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Módulo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Número de Módulo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Puesto");

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ledit.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

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

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        etmodulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etmoduloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etnummodulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(etnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etpuesto))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etmodulo)
                .addGap(23, 23, 23))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etmodulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etnummodulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etnombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_etnombreMousePressed

    private void etnombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etnombreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_etnombreMouseReleased

    private void etnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etnombreActionPerformed
        // TODO add your handling code here:
        etnombre.transferFocus();
    }//GEN-LAST:event_etnombreActionPerformed

    private void etnummoduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etnummoduloActionPerformed
        // TODO add your handling code here:
        etnummodulo.transferFocus();
    }//GEN-LAST:event_etnummoduloActionPerformed

    private void etpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etpuestoActionPerformed
        // TODO add your handling code here:
        etpuesto.transferFocus();
    }//GEN-LAST:event_etpuestoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        aux.setText("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void auxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auxMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_auxMouseReleased

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        // TODO add your handling code here:
        cargar(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

    

     String Modificar = null;
    int Resultado_U;
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        
           
                    
                 
        
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        
          Modificar = "UPDATE CarpetasM SET nom = ?,modulo = ?,numM = ?,puesto = ? WHERE cod = ?";
        Codigo = txtcodigo.getText();
        NombreC = etnombre.getText().toUpperCase().trim();
        Modulo = etmodulo.getText().toString().trim();
        NumM = etnummodulo.getText().toUpperCase().trim();
        Puesto = etpuesto.getText().toUpperCase().trim();
        
          int opcion=JOptionPane.showConfirmDialog(null,"Realmente decea Hacer los Cambios a la carpeta \n"+NombreC,"Confirmar",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_NO_OPTION){
        
        try {
            ps = cn.prepareStatement(Modificar);
            ps.setString(1, NombreC);
            ps.setString(2, Modulo);
            ps.setString(3, NumM);
            ps.setString(4, Puesto);
            ps.setString(5, Codigo);
            
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
                }
        
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    
  String Consultar = null; 
  
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        
         Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
          Consultar = "SELECT * FROM CarpetasM WHERE cod = '" + txtcodigo.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(Consultar);
            if (rs.next()) {
                txtcodigo.setText(rs.getString("cod"));
                etnombre.setText(rs.getString("nom"));
                etmodulo.setText(rs.getString("modulo"));
                etnummodulo.setText(rs.getString("numM"));
                etpuesto.setText(rs.getString("puesto"));
            }
        } catch (Exception e) {
            System.out.println("Error En Buscar :" + e.getMessage());
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

      String Eliminar = null;
    int Resulta_E;
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
         Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        
        NombreC = etnombre.getText().toUpperCase().trim();
        
            Eliminar = "DELETE FROM carpetasM WHERE cod = ?";
            
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
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void etmoduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etmoduloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etmoduloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField aux;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JFormattedTextField etmodulo;
    private javax.swing.JFormattedTextField etnombre;
    private javax.swing.JFormattedTextField etnummodulo;
    private javax.swing.JFormattedTextField etpuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    private javax.swing.JTable t_datos;
    private javax.swing.JFormattedTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}