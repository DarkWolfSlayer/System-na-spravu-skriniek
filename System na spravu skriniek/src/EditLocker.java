
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Short.valueOf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EditLocker extends javax.swing.JFrame {

    public EditLocker() {
        initComponents();
        Show_Users_In_JTable();
        jTable_Display_Users.setAutoCreateRowSorter(true);
    }

    public Connection getConnection() {
        Connection con;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek", "root", "");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<User> getUsersList() {
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();

        String query = "SELECT * FROM  `databaza_skriniek` ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            User user;

            while (rs.next()) {
                user = new User(rs.getInt("User_ID"), rs.getString("Meno"), rs.getString("Priezvisko"), rs.getString("TelCislo"), rs.getString("ID_skrinka"));
                usersList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usersList;
    }

    public void Show_Users_In_JTable() {
        ArrayList<User> list = getUsersList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMeno();
            row[1] = list.get(i).getPriezvisko();
            row[2] = list.get(i).getTel_cislo();
            row[3] = list.get(i).getId_user();

            model.addRow(row);
        }
    }

    public void executeSQlQuery(String query) {
        Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1) {

                DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
                model.setRowCount(0);
                Show_Users_In_JTable();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void close() {
        this.dispose();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Done = new javax.swing.JButton();
        FieldCisloSkrinky = new javax.swing.JTextField();
        Meno = new javax.swing.JLabel();
        GoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meno", "Priezvisko", "Trieda", "ID_Skrinka"
            }
        ));
        jTable_Display_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Users);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 440, 420));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uprav skrinku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Done.setBackground(new java.awt.Color(204, 204, 204));
        Done.setForeground(new java.awt.Color(255, 153, 153));
        Done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Done.png"))); // NOI18N
        Done.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        jPanel1.add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 60, 50));

        FieldCisloSkrinky.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(FieldCisloSkrinky, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        Meno.setText("Čislo skrinky");
        jPanel1.add(Meno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        GoBack.setBackground(new java.awt.Color(204, 204, 204));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GoBack.png"))); // NOI18N
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });
        jPanel1.add(GoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String fekete;
    String meno;
    String priezvisko;
    String trieda;
    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
        int i = jTable_Display_Users.getSelectedRow();

        TableModel model = jTable_Display_Users.getModel();

        FieldCisloSkrinky.setText(model.getValueAt(i, 3).toString());

        
        meno = model.getValueAt(i, 0).toString();
        priezvisko = model.getValueAt(i, 1).toString();
        trieda = model.getValueAt(i, 2).toString();

    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        String skrinka = FieldCisloSkrinky.getText();
        if (skrinka.isEmpty() == false) {
            if(valueOf(skrinka) <= 50 && valueOf(skrinka) > 0){
            try {

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek", "root", "");
                Statement sta = connection.createStatement();

                String skrinkaFull = ("SELECT * FROM databaza_skriniek WHERE ID_skrinka = " + FieldCisloSkrinky.getText());

                ResultSet rs = sta.executeQuery(skrinkaFull);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Skrinka už je pridelena");

                } 
                else {
                    String query = "UPDATE databaza_skriniek SET ID_skrinka='" + FieldCisloSkrinky.getText() + "' WHERE Meno = '" + meno + "' "
                            + "AND Priezvisko = '" + priezvisko + "' AND TelCislo = '" + trieda + "'";
                    executeSQlQuery(query);

                    DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
                    model.setRowCount(0);
                    Show_Users_In_JTable();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            }
            else{
                JOptionPane.showMessageDialog(this,"Čislo skrinky môže byť od 1 do 50");  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nezadal si všetky hodnoty");

        }


    }//GEN-LAST:event_DoneActionPerformed

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        close();

    }//GEN-LAST:event_GoBackActionPerformed

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
            java.util.logging.Logger.getLogger(EditLocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLocker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLocker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done;
    private javax.swing.JTextField FieldCisloSkrinky;
    private javax.swing.JButton GoBack;
    private javax.swing.JLabel Meno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    // End of variables declaration//GEN-END:variables
}
