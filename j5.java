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
public class j5 extends javax.swing.JFrame {

    /**
     * Creates new form j5
     */
    public j5() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        JDATABASE = new javax.swing.JLabel();
        jb4 = new javax.swing.JButton();
        student1 = new javax.swing.JButton();
        student2 = new javax.swing.JButton();
        bakagarawnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JDATABASE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JDATABASE.setForeground(new java.awt.Color(204, 204, 204));
        JDATABASE.setText("DATABASE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDATABASE, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDATABASE, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jb4.setBackground(new java.awt.Color(255, 255, 255));
        jb4.setFont(new java.awt.Font("Centaur", 0, 10)); // NOI18N
        jb4.setText("BACK TO MAIN MENU");
        jb4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jPanel1.add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, 30));

        student1.setBackground(new java.awt.Color(255, 255, 255));
        student1.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        student1.setText("FOR ATTENDANCE");
        student1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student1ActionPerformed(evt);
            }
        });
        jPanel1.add(student1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 260, 30));

        student2.setBackground(new java.awt.Color(255, 255, 255));
        student2.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        student2.setText("FOR STUDENT");
        student2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student2ActionPerformed(evt);
            }
        });
        jPanel1.add(student2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, 30));

        bakagarawnd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jong's TV\\Documents\\bburn\\JJJ1.png")); // NOI18N
        jPanel1.add(bakagarawnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        j2 a = new j2();
        a.show();
        dispose();
    }//GEN-LAST:event_jb4ActionPerformed

    private void student2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student2ActionPerformed
        // TODO add your handling code here:
    
        j6 a = new j6();
        a.show();
        dispose();
    }//GEN-LAST:event_student2ActionPerformed

    private void student1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student1ActionPerformed
        // TODO add your handling code here:
        j7 a = new j7();
        a.show();
        dispose();
    }//GEN-LAST:event_student1ActionPerformed

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
            java.util.logging.Logger.getLogger(j5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(j5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(j5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(j5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new j5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JDATABASE;
    private javax.swing.JLabel bakagarawnd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb4;
    private javax.swing.JButton student1;
    private javax.swing.JButton student2;
    // End of variables declaration//GEN-END:variables
}
