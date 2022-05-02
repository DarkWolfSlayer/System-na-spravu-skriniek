
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class EditUser extends javax.swing.JFrame {

 
    public EditUser() {
        initComponents();
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Meno = new javax.swing.JLabel();
        DeletePriezvisko = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EditMenoField = new javax.swing.JTextField();
        EditPriezviskoField = new javax.swing.JTextField();
        EditIDField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        FieldTelCislo = new javax.swing.JTextField();
        EditUser = new javax.swing.JButton();
        GoBack = new javax.swing.JButton();
        EditUser1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uprav žiaka");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 40));

        Meno.setText("Meno");
        jPanel2.add(Meno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        DeletePriezvisko.setText("Priezvisko");
        jPanel2.add(DeletePriezvisko, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 76, 30));

        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        EditMenoField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(EditMenoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        EditPriezviskoField.setBackground(new java.awt.Color(204, 204, 204));
        EditPriezviskoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPriezviskoFieldActionPerformed(evt);
            }
        });
        jPanel2.add(EditPriezviskoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        EditIDField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(EditIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 450, 430));

        jLabel4.setText("Telefone číslo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        FieldTelCislo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(FieldTelCislo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        EditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditUser.png"))); // NOI18N
        EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserActionPerformed(evt);
            }
        });
        jPanel2.add(EditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 60, 60));

        GoBack.setBackground(new java.awt.Color(204, 204, 204));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GoBack.png"))); // NOI18N
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });
        jPanel2.add(GoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 60, 60));

        EditUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveUser.png"))); // NOI18N
        EditUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUser1ActionPerformed(evt);
            }
        });
        jPanel2.add(EditUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        close();
    }//GEN-LAST:event_GoBackActionPerformed

    private void EditPriezviskoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPriezviskoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPriezviskoFieldActionPerformed

    private void EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserActionPerformed
        EditUser ziak1 = new EditUser();
        ziak1.setVisible(true);
    }//GEN-LAST:event_EditUserActionPerformed

    private void EditUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUser1ActionPerformed
        EditUser ziak1 = new EditUser();
        ziak1.setVisible(true);
    }//GEN-LAST:event_EditUser1ActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeletePriezvisko;
    private javax.swing.JTextField EditIDField;
    private javax.swing.JTextField EditMenoField;
    private javax.swing.JTextField EditPriezviskoField;
    private javax.swing.JButton EditUser;
    private javax.swing.JButton EditUser1;
    private javax.swing.JTextField FieldTelCislo;
    private javax.swing.JButton GoBack;
    private javax.swing.JLabel Meno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
