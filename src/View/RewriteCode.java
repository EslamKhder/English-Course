/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng Eslam Khder
 */
public class RewriteCode extends javax.swing.JFrame {

    private static int idstudent;

    public RewriteCode(int idstudent) {
        this.idstudent = idstudent;
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

        jLabel1 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codeagain = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Serial Code :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 195, 57);

        code.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        code.setForeground(new java.awt.Color(51, 0, 51));
        code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(code);
        code.setBounds(212, 11, 251, 57);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Again :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 74, 195, 57);

        codeagain.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        codeagain.setForeground(new java.awt.Color(51, 0, 51));
        codeagain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(codeagain);
        codeagain.setBounds(212, 74, 251, 57);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(346, 142, 117, 57);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Back");
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 142, 117, 57);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/staff6.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, 0, 480, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String code1 = code.getText().trim().toLowerCase(),
                    code2 = codeagain.getText().trim().toLowerCase();
            if (code1.equals(code2)) {
                Student student = new Student();
                student.setId(idstudent);
                student.setSerialcode(code2);
                Controller c = new Controller();
                int result = c.updateSerialCode(student);
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Success UPDATE", "Code Update",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    ManageCourse managecourse = new ManageCourse();
                    managecourse.setSize(625, 270);
                    managecourse.setResizable(false);
                    managecourse.show();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your Code not Matches ", "Error Code",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Success UPDATE", "Add Student",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RewriteCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RewriteCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RewriteCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RewriteCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RewriteCode(idstudent).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JTextField codeagain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}