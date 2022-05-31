import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Hlavne_okno extends javax.swing.JFrame {
counter c = new counter();
    
    
    public Hlavne_okno() {
        initComponents();
        jTable_Display_Users.setAutoCreateRowSorter(true);
        Show_Users_In_JTable();
        
        c.pocet_skriniek();
        
        jLabel1.setText(String.valueOf(c.getPocet()));
        jLabel4.setText(String.valueOf(c.getVolne()));
        jLabel5.setText(String.valueOf(c.getObsadene()));
    }

 
    public Connection getConnection()
   {
       Connection con;

       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek", "root","");
           return con;
           
       } 
      catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
    
    
    public ArrayList<User> getUsersList()
   {
       ArrayList<User> usersList = new ArrayList<User>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `databaza_skriniek` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);

           User user;
           
           while(rs.next())
           {
               user = new User(rs.getInt("User_ID"), rs.getString("Meno"),rs.getString("Priezvisko"),rs.getString("TelCislo"),rs.getString("ID_skrinka"));
               usersList.add(user);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }


       return usersList;
   }
    
    
    
    public void Show_Users_In_JTable()
   {
       ArrayList<User> list = getUsersList();
       DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getMeno();
           row[1] = list.get(i).getPriezvisko();
           row[2] = list.get(i).getTel_cislo();
           row[3] = list.get(i).getId_user();
           
           model.addRow(row);
       }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jScrollBar1 = new javax.swing.JScrollBar();
        Pozadie1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AddUser = new javax.swing.JButton();
        EditUser = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PocetSkriniek = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTextPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTextPane1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pozadie1.setBackground(new java.awt.Color(51, 51, 51));
        Pozadie1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Pozadie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 444));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddUser.setForeground(new java.awt.Color(255, 153, 153));
        AddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddUser.png"))); // NOI18N
        AddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });
        jPanel1.add(AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 70, 60));

        EditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditUser.png"))); // NOI18N
        EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserActionPerformed(evt);
            }
        });
        jPanel1.add(EditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, 60));

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 440));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Display_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meno", "Priezvisko", "Trieda", "ID_Skrinky"
            }
        ));
        jScrollPane2.setViewportView(jTable_Display_Users);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 350));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 780, 350));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Voľné skrinky");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 80, 20));

        jLabel3.setText("Obsadené skrinky");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, 20));

        PocetSkriniek.setBackground(new java.awt.Color(255, 255, 255));
        PocetSkriniek.setText("Počet skriniek");
        PocetSkriniek.setToolTipText("");
        PocetSkriniek.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(PocetSkriniek, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 20));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 40));

        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 60, 40));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 60, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 780, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed

        PridajZiaka ziak1 = new PridajZiaka();
        ziak1.setVisible(true);
    }//GEN-LAST:event_AddUserActionPerformed

    private void EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserActionPerformed
        EditUser ziak1 = new EditUser();
        ziak1.setVisible(true);
    }//GEN-LAST:event_EditUserActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable_Display_Users.getModel();
        dtm.setRowCount(0);
        Show_Users_In_JTable();
        
        c.pocet_skriniek();
        jLabel1.setText(String.valueOf(c.getPocet()));
        jLabel4.setText(String.valueOf(c.getVolne()));
        jLabel5.setText(String.valueOf(c.getObsadene()));
    }//GEN-LAST:event_RefreshActionPerformed

   
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
            java.util.logging.Logger.getLogger(Hlavne_okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hlavne_okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hlavne_okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hlavne_okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Hlavne_okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser;
    private javax.swing.JButton EditUser;
    private javax.swing.JLabel PocetSkriniek;
    private javax.swing.JPanel Pozadie1;
    private javax.swing.JButton Refresh;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
