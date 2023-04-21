/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burnmagno;

/**
 *
 * @author Jong's TV
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class j4 extends javax.swing.JFrame {

    /**
     * Creates new form j4
     */
    public j4() {
        initComponents();
        User();
    }
        private void User(){
       String databaseURL = "jdbc:derby://localhost:1527/C:/Database/SAdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select STUD_ID From STUDENT ");
            ResultSet rs = pst.executeQuery();
            cbox.removeAllItems();
            while(rs.next()){
                cbox.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JATTENDANCE = new javax.swing.JLabel();
        i1 = new javax.swing.JTextField();
        u1 = new javax.swing.JLabel();
        u2 = new javax.swing.JLabel();
        bj1 = new javax.swing.JButton();
        bj2 = new javax.swing.JButton();
        bj3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        cbox = new javax.swing.JComboBox<>();
        u3 = new javax.swing.JLabel();
        i2 = new javax.swing.JTextField();
        backgrawnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JATTENDANCE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JATTENDANCE.setForeground(new java.awt.Color(204, 204, 204));
        JATTENDANCE.setText("ATTENDANCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JATTENDANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JATTENDANCE, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 40));

        i1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });
        jPanel1.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 30));

        u1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        u1.setForeground(new java.awt.Color(255, 255, 255));
        u1.setText("Code:");
        jPanel1.add(u1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 30));

        u2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        u2.setForeground(new java.awt.Color(255, 255, 255));
        u2.setText("Course:");
        jPanel1.add(u2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 80, 30));

        bj1.setBackground(new java.awt.Color(255, 255, 255));
        bj1.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        bj1.setText("ADD");
        bj1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bj1ActionPerformed(evt);
            }
        });
        jPanel1.add(bj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, 30));

        bj2.setBackground(new java.awt.Color(255, 255, 255));
        bj2.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        bj2.setText("UPDATE");
        bj2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bj2ActionPerformed(evt);
            }
        });
        jPanel1.add(bj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 120, 30));

        bj3.setBackground(new java.awt.Color(255, 255, 255));
        bj3.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        bj3.setText("DELETE");
        bj3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bj3ActionPerformed(evt);
            }
        });
        jPanel1.add(bj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 120, 30));

        jb4.setBackground(new java.awt.Color(255, 255, 255));
        jb4.setFont(new java.awt.Font("Centaur", 0, 10)); // NOI18N
        jb4.setText("BACK TO MAIN MENU");
        jb4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jPanel1.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 150, 30));

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });
        jPanel1.add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 130, 30));

        u3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        u3.setForeground(new java.awt.Color(255, 255, 255));
        u3.setText("I.D Number:");
        jPanel1.add(u3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 30));

        i2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });
        jPanel1.add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 130, 30));

        backgrawnd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jong's TV\\Documents\\bburn\\JJJ1.png")); // NOI18N
        jPanel1.add(backgrawnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i1ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        j2 a = new j2();
        a.show();
        dispose();
    }//GEN-LAST:event_jb4ActionPerformed

    private void bj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bj1ActionPerformed
        // TODO add your handling code here:
        String URL = "jdbc:derby://localhost:1527/C:/Database/SAdb";
        String query = "insert into S_ATTENDANCE(ATTEND_CODE, STUDENT_ID, COURSE) Values(?,?,?)";
        try {
            Connection z = DriverManager.getConnection(URL);
            PreparedStatement p = z.prepareStatement(query);

            p.setString(1, i1.getText());
            p.setString(2, (String) cbox.getSelectedItem());
            p.setString(3, i2.getText());
            
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfully!");
            i1.setText(" ");
            cbox.setSelectedItem(1);
            i2.setText(" ");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bj1ActionPerformed

    private void bj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bj2ActionPerformed
        // TODO add your handling code here:
        String URL = "jdbc:derby://localhost:1527/C:/Database/SAdb";
        String query = "UPDATE S_ATTENDANCE SET STUDENT_ID=?, COURSE=? WHERE ATTEND_CODE=?";
        try {
            Connection z = DriverManager.getConnection(URL);
            PreparedStatement p = z.prepareStatement(query);
            
            
            p.setString(3, i1.getText());
            p.setString(1, (String) cbox.getSelectedItem());
            p.setString(2, i2.getText());
            

            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!");
            
            i1.setText(" ");
            cbox.setSelectedItem(1);
            i2.setText(" ");
            
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bj2ActionPerformed

    private void bj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bj3ActionPerformed
        // TODO add your handling code here:
         String URL = "jdbc:derby://localhost:1527/C:/Database/SAdb";
        String query = "Delete from S_ATTENDANCE where ATTEND_CODE=? ";
        
         try{
            Connection z = DriverManager.getConnection(URL);
            PreparedStatement p = z.prepareStatement(query);
            
            p.setString(1, i1.getText());
            
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted!");
            i1.setText(" ");
    
            
        } catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bj3ActionPerformed

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i2ActionPerformed

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
            java.util.logging.Logger.getLogger(j4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(j4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(j4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(j4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new j4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JATTENDANCE;
    private javax.swing.JLabel backgrawnd;
    private javax.swing.JButton bj1;
    private javax.swing.JButton bj2;
    private javax.swing.JButton bj3;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JTextField i1;
    private javax.swing.JTextField i2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb4;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u2;
    private javax.swing.JLabel u3;
    // End of variables declaration//GEN-END:variables
}
