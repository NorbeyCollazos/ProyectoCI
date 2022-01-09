
import Clases.Conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ConsultarModulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarModulo
     */
    DefaultTableModel model;
    Conectar cc = new Conectar();
    Connection cn = cc.getConnection();

    public ConsultarModulo() {
        initComponents();
        cargar("");
        
    }
    
    
    
    
    
     void cargar(String valor){
        String []  titulos ={"NOMBRE DE LA CARPETA","MODULO","No MODULO", "PUESTO"};

        String[] registros = new String[4];
        
        String sql = "SELECT nom,modulo,numM,puesto FROM carpetasm where nom LIKE '%"+valor+"%' order by modulo asc";
        
        model = new DefaultTableModel(null,titulos);

         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString("nom");
                registros[1]=rs.getString("modulo");
                registros[2]=rs.getString("numM");
                registros[3]=rs.getString("puesto");
                model.addRow(registros);
            }
            
            t_datos.setModel(model);
            jlcanti.setText(""+t_datos.getRowCount());
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
        
        
        
    }
     
     
     
     
     
     void cargarC(){
        String []  titulos ={"NOMBRE DE LA CARPETA","MODULO","No MODULO", "PUESTO"};
        String[] registros = new String[4];       
        String sql = "SELECT nom,modulo,numM,puesto FROM carpetasm order by nom asc";     
        model = new DefaultTableModel(null,titulos);


        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);  
            while(rs.next()){
                registros[0]=rs.getString("nom");
                registros[1]=rs.getString("modulo");
                registros[2]=rs.getString("numM");
                registros[3]=rs.getString("puesto");
                model.addRow(registros);
            } 
            t_datos.setModel(model);
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }  
    }
     
     
     
         void cargarM(){
        String []  titulos ={"NOMBRE DE LA CARPETA","MODULO","No MODULO", "PUESTO"};
        String[] registros = new String[4];       
        String sql = "SELECT nom,modulo,numM,puesto FROM carpetasm order by modulo asc";     
        model = new DefaultTableModel(null,titulos);



        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);  
            while(rs.next()){
                registros[0]=rs.getString("nom");
                registros[1]=rs.getString("modulo");
                registros[2]=rs.getString("numM");
                registros[3]=rs.getString("puesto");
                model.addRow(registros);
            } 
            t_datos.setModel(model);
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }  
    }
     
     
     
     
      
         void cargarNM(){
        String []  titulos ={"NOMBRE DE LA CARPETA","MODULO","No MODULO", "PUESTO"};
        String[] registros = new String[4];       
        String sql = "SELECT nom,modulo,numM,puesto FROM carpetasm order by numM asc";     
        model = new DefaultTableModel(null,titulos);


        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);  
            while(rs.next()){
                registros[0]=rs.getString("nom");
                registros[1]=rs.getString("modulo");
                registros[2]=rs.getString("numM");
                registros[3]=rs.getString("puesto");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        aux = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jlcanti = new javax.swing.JLabel();
        chekc = new javax.swing.JRadioButton();
        chekm = new javax.swing.JRadioButton();
        cheknm = new javax.swing.JRadioButton();
        btnordenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jld = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Carpetas del Módulo");
        setMinimumSize(new java.awt.Dimension(300, 40));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoguardar.jpg"))); // NOI18N

        jcMousePanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banerc.png"))); // NOI18N
        jcMousePanel2.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Images/taponcito.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconbuscar.png"))); // NOI18N
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
        jLabel2.setText("Buscar carpetas del Módulo");

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(588, Short.MAX_VALUE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        t_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_datos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Cantidad de Carpetas:");

        jlcanti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(chekc);
        chekc.setText("Ordenar por Carpetas");

        buttonGroup1.add(chekm);
        chekm.setText("Ordenar por Módulos");

        buttonGroup1.add(cheknm);
        cheknm.setText("Ordenar por No Módulo");

        btnordenar.setText("Ordenar");
        btnordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenarActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jld.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(50, 50, 50)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlcanti, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheknm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chekc)
                        .addGap(12, 12, 12)
                        .addComponent(chekm)
                        .addGap(16, 16, 16)
                        .addComponent(cheknm)
                        .addGap(30, 30, 30)
                        .addComponent(btnordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcanti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jld, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenarActionPerformed
        // TODO add your handling code here:
        if(chekc.isSelected()==true){
            cargarC();
        }else if(chekm.isSelected()==true){
            cargarM();
        }else{
            cargarNM();
        }
    }//GEN-LAST:event_btnordenarActionPerformed

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        // TODO add your handling code here:
        cargar(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

    private void auxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auxMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_auxMouseReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        aux.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           try {
            // TODO add your handling code here:
            JasperReport reporte = JasperCompileManager.compileReport("ReportModulo.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null,this.cn);
            JasperViewer.viewReport(print);

        } catch (JRException ex) {
            Logger.getLogger(ConsultarCajones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField aux;
    private javax.swing.JButton btnordenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chekc;
    private javax.swing.JRadioButton chekm;
    private javax.swing.JRadioButton cheknm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private javax.swing.JLabel jlcanti;
    private javax.swing.JLabel jld;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables
}
