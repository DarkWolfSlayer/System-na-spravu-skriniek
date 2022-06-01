import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class EditUser extends javax.swing.JFrame {
counter c = new counter();
 
    public EditUser() {

        initComponents();
        Show_Users_In_JTable();
        jTable_Display_Users.setAutoCreateRowSorter(true);


        
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
       Object[] row = new Object[5];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getMeno();
           row[1] = list.get(i).getPriezvisko();
           row[2] = list.get(i).getTel_cislo();
           row[3] = list.get(i).getId_user();
           
           model.addRow(row);
       }
   }
       public void executeSQlQuery(String query)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               
               DefaultTableModel model = (DefaultTableModel)jTable_Display_Users.getModel();
               model.setRowCount(0);
               Show_Users_In_JTable();
              
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
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
        EditMenoField = new javax.swing.JTextField();
        EditPriezviskoField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Users = new javax.swing.JTable();
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

        EditMenoField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(EditMenoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        EditPriezviskoField.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(EditPriezviskoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 450, 430));

        jLabel4.setText("Trieda");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        FieldTelCislo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(FieldTelCislo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        EditUser.setBackground(new java.awt.Color(204, 204, 204));
        EditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditUser.png"))); // NOI18N
        EditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserActionPerformed(evt);
            }
        });
        jPanel2.add(EditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 60, 60));

        GoBack.setBackground(new java.awt.Color(204, 204, 204));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GoBack.png"))); // NOI18N
        GoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackActionPerformed(evt);
            }
        });
        jPanel2.add(GoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 60));

        EditUser1.setBackground(new java.awt.Color(204, 204, 204));
        EditUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveUser.png"))); // NOI18N
        EditUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUser1ActionPerformed(evt);
            }
        });
        jPanel2.add(EditUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackActionPerformed
        close();
    }//GEN-LAST:event_GoBackActionPerformed

    private void EditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserActionPerformed
        String meno = EditMenoField.getText();
        String priezvisko = EditPriezviskoField.getText();
        String trieda = FieldTelCislo.getText(); 
  
        
        if(meno.isEmpty() == false && priezvisko.isEmpty() == false && trieda.isEmpty() == false){

        try {
                
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek","root","");
                Statement sta = connection.createStatement();
                
                String skrinkaFull = ("SELECT * FROM databaza_skriniek WHERE ID_skrinka = '"+fekete+"'");
                
                ResultSet rs = sta.executeQuery(skrinkaFull);
                

                   String query = "UPDATE databaza_skriniek SET Meno='"+EditMenoField.getText()+"',Priezvisko='"+EditPriezviskoField.getText()+
                    "',TelCislo='"+FieldTelCislo.getText()+"' WHERE ID_skrinka = " + fekete;
                    executeSQlQuery(query);
                    
                    DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
                    model.setRowCount(0);
                    Show_Users_In_JTable();
                
                

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
 }
             else{
             JOptionPane.showMessageDialog(this,"Nezadal si všetky hodnoty");  
        
        }
        
        
    }//GEN-LAST:event_EditUserActionPerformed

    private void EditUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUser1ActionPerformed
        
          int[] rows = jTable_Display_Users.getSelectedRows();
        int a = JOptionPane.showConfirmDialog((Component) null, "Chces to vazne vymazat?", "DELETE", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            for (int i = 0; i < rows.length; i++) {
                String bmdel = jTable_Display_Users.getModel().getValueAt(rows[i], 3).toString();

                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek", "root", "");
                    Statement stmt = conn.createStatement();
                    String query = "DELETE FROM databaza_skriniek WHERE ID_skrinka = '" + bmdel + "'";
                    stmt.executeUpdate(query);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
        model.setRowCount(0);
        Show_Users_In_JTable();
        
    }//GEN-LAST:event_EditUser1ActionPerformed
    String fekete;
    String idskrinkaField;
    private void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UsersMouseClicked
          int i = jTable_Display_Users.getSelectedRow();
          
          
        TableModel model = jTable_Display_Users.getModel();
         // Display Slected Row In JTexteFields  
        EditMenoField.setText(model.getValueAt(i,0).toString());

        EditPriezviskoField.setText(model.getValueAt(i,1).toString());

        FieldTelCislo.setText(model.getValueAt(i,2).toString());
        

        fekete = model.getValueAt(i,3).toString();
       
    }//GEN-LAST:event_jTable_Display_UsersMouseClicked

    
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
            @Override
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeletePriezvisko;
    private javax.swing.JTextField EditMenoField;
    private javax.swing.JTextField EditPriezviskoField;
    private javax.swing.JButton EditUser;
    private javax.swing.JButton EditUser1;
    private javax.swing.JTextField FieldTelCislo;
    private javax.swing.JButton GoBack;
    private javax.swing.JLabel Meno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Users;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
