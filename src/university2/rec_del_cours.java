/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static university2.connectdb.connect;

/**
 *
 * @author w
 */
public class rec_del_cours extends javax.swing.JFrame {

    /**
     * Creates new form rec_del_cours
     */
    
    int val;
    Connection con = null;
    PreparedStatement p=null;
    ResultSet rst=null;
    
    
    public rec_del_cours() {
        initComponents();
     //   tabledatabase( );
       
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
        jLabel1 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register or delete a course for a student");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Register or delete a course for a student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        reg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reg.setText(" registration");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel.setText("cancel");
        cancel.setEnabled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number_cours", "name_cours", "hours_cours", "doctor_name", "regester cours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setRowSelectionAllowed(false);
        jTable.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setText("Save");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(cancel)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(save)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(767, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
       try{
        String value = JOptionPane.showInputDialog(null,"تسجيل مادة ادخل رقم الطالب  ");
       val=Integer.parseInt(value);
      if(JOptionPane.OK_OPTION==0){
      int result= tabledatabase(val);
      if(result==1){
       reg.setEnabled(false);
       delete.setEnabled(false);
       cancel.setEnabled(true);
       save.setEnabled(true);
       save.setText("save reg");
      }
      }}catch(Exception e){}
      
    }//GEN-LAST:event_regActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try{
      String value = JOptionPane.showInputDialog(null,"حذف مادة ادخل رقم الطالب  ");
      val=Integer.parseInt(value);
      
      if(JOptionPane.OK_OPTION==0){
          int result= deletecours(val);
      if(result==1){ 
       reg.setEnabled(false);
       delete.setEnabled(false);
       cancel.setEnabled(true);
       save.setEnabled(true);
       save.setText("save delete");
      }
      }else{
         
      }}catch(Exception e){}
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       reg.setEnabled(true);
       delete.setEnabled(true);
       cancel.setEnabled(false);
       save.setEnabled(false);
       save.setText("save");
       DefaultTableModel model1=(DefaultTableModel) jTable.getModel();
       model1.setRowCount(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     if(save.getText().equals("save reg")){
     
     saveinsert();
     }else{
     savedelete();
     }

    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(rec_del_cours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rec_del_cours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rec_del_cours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rec_del_cours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rec_del_cours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton reg;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    private int tabledatabase(int id) {
          con = connect();
          
     try {  
         p=con.prepareStatement("select * from student where id='"+id+"' ");
          rst=p.executeQuery();
          if(rst.next()){
             
            int sem=mainmenu.sem;
            p = con.prepareStatement("select * from cours where semester='1'");
             rst=p.executeQuery();
             
             DefaultTableModel model=(DefaultTableModel)jTable.getModel();
             while(rst.next()){
            PreparedStatement p1=con.prepareStatement("select * from student_cours where id_student='"+id+"' and name_cours='"+rst.getString(2)+"'");
            ResultSet rst1=p1.executeQuery();
            if(rst1.next()){
            model.addRow(new Object[]{rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(5),true});
            }else{
            model.addRow(new Object[]{rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(5),false});
             }
             }
          } else{
        JOptionPane.showMessageDialog(null,"رقم الطالب غير موجود ");

          return 0;
          }
            
        } catch (SQLException ex) {
                        System.out.println(ex.getMessage());

        }finally{
            try {
                con.close();
                 p.close();
            rst.close();
            } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

            }
           
        } 
   return 1;
    }

    private int deletecours(int id) {
        
        con=connect();
       DefaultTableModel mod=(DefaultTableModel)jTable.getModel();
       
        try {
            p=con.prepareStatement("select * from student where id='"+id+"' ");
            rst=p.executeQuery();
             if(rst.next()){
                 
              p=con.prepareStatement("select * from student_cours where id_student='"+id+"'");
             rst=p.executeQuery();
              
             while(rst.next()){
            mod.addRow(new Object[]{rst.getString("number_cours"),rst.getString("name_cours"),rst.getString("hours"),rst.getString("name_doctor"),true});
             }
             }else{
             JOptionPane.showMessageDialog(null,"رقم الطالب غير موجود ");
                return 0;
             }
        } catch (SQLException ex) {
            Logger.getLogger(rec_del_cours.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
                 p.close();
            rst.close();
            } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

            }
           
        } 
            return 1;
    
    }


    private void saveinsert() {
      
                con = connect();
          
     try {  
          for (int row=0 ; row<jTable.getRowCount();row++){
          if(jTable.getModel().getValueAt(row, 4).equals(true)){
          String namec= jTable.getModel().getValueAt(row,1 ).toString();
          p=con.prepareStatement("select * from student_cours where id_student='"+val+"' and name_cours='"+namec+"' ");
          rst=p.executeQuery();
          
          if(!rst.next()){
              int idc= Integer.parseInt(jTable.getModel().getValueAt(row,0 ).toString());
              int hour= Integer.parseInt(jTable.getModel().getValueAt(row,2 ).toString());
              String named= jTable.getModel().getValueAt(row,3 ).toString();

            p=con.prepareStatement("insert into student_cours values('"+val+"','"+namec+"','"+hour+"',0,0,'"+named+"','"+idc+"')");
            p.execute();
          }
          }
          
          
          }  
            JOptionPane.showMessageDialog(null,"تم تثبيت التسجيل ");

            
        } catch (SQLException ex) {
                        System.out.println(ex.getMessage());

        }finally{
            try {
                con.close();
                 p.close();
            rst.close();
            } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

            }
           
        } 
    }
    
    
    private void savedelete() {
              con = connect();
          
     try {  
          for (int row=0 ; row<jTable.getRowCount();row++){
          if(jTable.getModel().getValueAt(row, 4).equals(false)){
          String namec= jTable.getModel().getValueAt(row,1 ).toString();
          p=con.prepareStatement("delete  from student_cours where id_student='"+val+"' and name_cours='"+namec+"' ");
          p.execute();
          
          
          }
          
          
          }  
            JOptionPane.showMessageDialog(null,"تم تثبيت الحذف ");

            
        } catch (SQLException ex) {
                        System.out.println(ex.getMessage());

        }finally{
            try {
                con.close();
                 p.close();
            rst.close();
            } catch (SQLException ex) {
                            System.out.println(ex.getMessage());

            }
           
        } 
        
    }
}
