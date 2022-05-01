
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class DeleteUser extends javax.swing.JFrame {

   
    public DeleteUser() {
        initComponents();
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DeletePriezvisko = new javax.swing.JLabel();
        GoBack = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DeletePriezviskoField = new javax.swing.JTextField();
        Meno = new javax.swing.JLabel();
        DeleteMenoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeletePriezvisko.setText("Priezvisko");
        jPanel1.add(DeletePriezvisko, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 76, 30));

        GoBack.setBackground(new java.awt.Color(204, 204, 204));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GoBack.png"))); // NOI18N
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });
        jPanel1.add(GoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 60, 40));

        OK.setBackground(new java.awt.Color(204, 204, 204));
        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OK.png"))); // NOI18N
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        jPanel1.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 60, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Odstráň žiaka");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 40));

        DeletePriezviskoField.setBackground(new java.awt.Color(204, 204, 204));
        DeletePriezviskoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePriezviskoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(DeletePriezviskoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, -1));

        Meno.setText("Meno");
        jPanel1.add(Meno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        DeleteMenoField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(DeleteMenoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        close();
    }//GEN-LAST:event_GoBackActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        close();
    }//GEN-LAST:event_OKActionPerformed

    private void DeletePriezviskoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePriezviskoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletePriezviskoFieldActionPerformed

   
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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DeleteMenoField;
    private javax.swing.JLabel DeletePriezvisko;
    private javax.swing.JTextField DeletePriezviskoField;
    private javax.swing.JButton GoBack;
    private javax.swing.JLabel Meno;
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
