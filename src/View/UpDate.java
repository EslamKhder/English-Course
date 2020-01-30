/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import course.CoursesSql;
import Model.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng Eslam Khder
 */
public class UpDate extends javax.swing.JFrame {

    /**
     * Creates new form UpDate
     */
    public UpDate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namef = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CODE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        namef.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namef.setForeground(new java.awt.Color(102, 102, 102));
        namef.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });
        getContentPane().add(namef);
        namef.setBounds(267, 140, 200, 51);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name(F) :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 140, 250, 51);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter Serial Number :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 78, 250, 49);

        CODE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CODE.setForeground(new java.awt.Color(102, 102, 102));
        CODE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODEActionPerformed(evt);
            }
        });
        getContentPane().add(CODE);
        CODE.setBounds(267, 80, 200, 51);

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(472, 80, 89, 50);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Up Date Your Data");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 541, 56);

        namel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namel.setForeground(new java.awt.Color(102, 102, 102));
        namel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namelActionPerformed(evt);
            }
        });
        getContentPane().add(namel);
        namel.setBounds(267, 200, 200, 51);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name(L) :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 200, 250, 51);

        Age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Age.setForeground(new java.awt.Color(102, 102, 102));
        Age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        getContentPane().add(Age);
        Age.setBounds(267, 260, 200, 51);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Age :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 260, 250, 51);

        code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        code.setForeground(new java.awt.Color(102, 102, 102));
        code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code);
        code.setBounds(267, 320, 200, 51);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Serial Code :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 320, 250, 51);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(437, 376, 124, 47);

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 376, 124, 47);

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("Main");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(226, 376, 124, 47);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

    private void CODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String serialcode = CODE.getText();
        Student student = new Student();
        student.setSerialcode(serialcode);
        try {
            Controller controller = new Controller();
            student = controller.getStudent(student);
            if (student.getNamef() != null) {
                namef.setText(student.getNamef());
                namel.setText(student.getNamel());
                Age.setText(String.valueOf(student.getAge()));
                code.setText(student.getSerialcode());
            } else {
                namef.setText("");
                namel.setText("");
                Age.setText("");
                code.setText("");
            }
            code.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SQL ERROR ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void namelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namelActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        ManageCourse managecourse = new ManageCourse();
        managecourse.setSize(625, 270);
        managecourse.setResizable(false);
        managecourse.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        MainPage mainpage = new MainPage();
        mainpage.setSize(595, 325);
        mainpage.setResizable(false);
        mainpage.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String namefirst = namef.getText().trim().toLowerCase(),
                namelast = namel.getText().trim().toLowerCase(),
                serialcode = code.getText().trim().toLowerCase();
        try {
            int age = Integer.parseInt(Age.getText().trim().toLowerCase());
            CoursesSql coursesql = new CoursesSql();
            Student student = new Student();
            student.setNamef(namefirst);
            student.setNamel(namelast);
            student.setAge(age);
            student.setSerialcode(serialcode);
            int result = coursesql.updateStudent(student);
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Success UPDATE", "Add Student",
                        JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                ManageCourse managecourse = new ManageCourse();
                managecourse.setSize(625, 270);
                managecourse.setResizable(false);
                managecourse.show();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Your Age must include only number ",
                    "Write ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField CODE;
    private javax.swing.JTextField code;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField namel;
    // End of variables declaration//GEN-END:variables
}
