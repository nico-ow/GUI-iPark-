/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import admin.accountmanager;
import config.connectDB;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author vienz
 */
public class changepassword extends javax.swing.JFrame {

    /**
     * Creates new form changepassword
     */
    public changepassword(String id, String fname, String lname, String eMail, String pnum) {
        initComponents();
        
        idfieldtext.setText(id);
        firstname.setText(fname);
        lastname.setText(lname);
        contactnumber.setText(pnum);
        email.setText(eMail);
        
    idfieldtext.setText(id);
    firstname.setEditable(false);
    lastname.setEditable(false);
    contactnumber.setEditable(false);
    email.setEditable(false);
        
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
        logintext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        requiredfname = new javax.swing.JLabel();
        lastnametext = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        requiredlname = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        emailtext = new javax.swing.JLabel();
        requiredemail = new javax.swing.JLabel();
        changepassword1 = new javax.swing.JTextField();
        cnumbertext = new javax.swing.JLabel();
        requiredcnumber = new javax.swing.JLabel();
        idfieldtext1 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        backlogin = new javax.swing.JLabel();
        contactnumber = new javax.swing.JTextField();
        passwordtext = new javax.swing.JLabel();
        requiredpassword = new javax.swing.JLabel();
        idfieldtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logintext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logintext.setText("EDIT INFORMATION");
        jPanel2.add(logintext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstnameFocusLost(evt);
            }
        });
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 196, 30));

        requiredfname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 10));

        lastnametext.setText("Last Name");
        jPanel2.add(lastnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 196, 30));

        requiredlname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, 10));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 196, 30));

        emailtext.setText("Email");
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 54, -1));

        requiredemail.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 10));

        changepassword1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changepassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                changepassword1FocusLost(evt);
            }
        });
        changepassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassword1ActionPerformed(evt);
            }
        });
        jPanel2.add(changepassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 197, 30));

        cnumbertext.setText("Contact Number");
        jPanel2.add(cnumbertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        requiredcnumber.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredcnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 10));

        idfieldtext1.setText("ID:");
        jPanel2.add(idfieldtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        Signup.setBackground(new java.awt.Color(241, 185, 185));
        Signup.setText("Edit");
        Signup.setBorderPainted(false);
        Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SignupFocusLost(evt);
            }
        });
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel2.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 120, 19));

        backlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (2).png"))); // NOI18N
        backlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backloginMouseClicked(evt);
            }
        });
        jPanel2.add(backlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        contactnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactnumberFocusLost(evt);
            }
        });
        contactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumberActionPerformed(evt);
            }
        });
        jPanel2.add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 197, 30));

        passwordtext.setText("Password");
        jPanel2.add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        requiredpassword.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 190, 10));
        jPanel2.add(idfieldtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 54, 42, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 670, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusLost
        
    }//GEN-LAST:event_firstnameFocusLost

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        
    }//GEN-LAST:event_lastnameFocusLost

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost

    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void changepassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_changepassword1FocusLost
String pass = changepassword1.getText();

    if (pass.isEmpty()) {
        changepassword1.setForeground(Color.RED);
        requiredpassword.setText("Password is required");
        requiredpassword.setForeground(Color.RED);

    } else {
        changepassword1.setForeground(Color.BLACK);
        requiredpassword.setText("");
    }

    changepassword1.repaint();
    }//GEN-LAST:event_changepassword1FocusLost

    private void changepassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changepassword1ActionPerformed

    private void SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignupFocusLost

    }//GEN-LAST:event_SignupFocusLost

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed

        if (signUpValidation()) {

    connectDB con = new connectDB();

    con.updateData("UPDATE tbl_user SET u_password = '" + changepassword1.getText() + "' " +
        "WHERE u_id = '" + idfieldtext1.getText() + "'");

    JOptionPane.showMessageDialog(this, "Password Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    accountmanager acc = new accountmanager();
    acc.setVisible(true);
    this.dispose();

} else {

    JOptionPane.showMessageDialog(this, "Password update error. Please fill all required fields.", "Warning", JOptionPane.WARNING_MESSAGE);

}

    }//GEN-LAST:event_SignupActionPerformed

    private void backloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backloginMouseClicked
        accountmanager acc = new accountmanager();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backloginMouseClicked

    private void contactnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactnumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumberFocusLost

    private void contactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumberActionPerformed

    
    private boolean signUpValidation() {
        boolean valid = true;

        // Password Validation
        String pass = changepassword1.getText();
        if (pass.isEmpty()) {
            changepassword1.setForeground(Color.RED);
            requiredpassword.setText("Password is required");
            requiredpassword.setForeground(Color.RED);
            valid = false;
        } else {
            changepassword1.setForeground(Color.BLACK);
            requiredpassword.setText("");
        }

        // Additional validation for other fields can be added here

        changepassword1.repaint();
        return valid;
    }

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
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                

                String id = null;
                String fname = null;
                String lname = null;
                String pnum = null;
                String eMail = null;

                new changepassword(id, fname, lname, pnum, eMail).setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup;
    private javax.swing.JLabel backlogin;
    private javax.swing.JTextField changepassword1;
    private javax.swing.JLabel cnumbertext;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailtext;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel idfieldtext;
    private javax.swing.JLabel idfieldtext1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lastnametext;
    private javax.swing.JLabel logintext;
    private javax.swing.JLabel passwordtext;
    private javax.swing.JLabel requiredcnumber;
    private javax.swing.JLabel requiredemail;
    private javax.swing.JLabel requiredfname;
    private javax.swing.JLabel requiredlname;
    private javax.swing.JLabel requiredpassword;
    // End of variables declaration//GEN-END:variables
}
