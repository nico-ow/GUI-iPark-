/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.connectDB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import panel.login;
import panel.register;

/**
 *
 * @author vienz
 */
public class adminDB extends javax.swing.JFrame {

    /**
     * Creates new form adminDB
     */
    public adminDB() {
        initComponents();
        
        displayData();
    }
    Color lightGray = new Color(211, 211, 211);
    Color lightBlue = new Color(173, 216, 230);
    Color charcoal = new Color(28, 28, 28);
    Color teal = new Color(0, 128, 128);
    Color white = new Color(240,240,240);
    
    
    public void displayData() {
    try {
        connectDB dbc = new connectDB();
        
        // Select only the specific columns from tbl_user
        String query = "SELECT u_id, u_firstname, u_lastname, u_contactnumber, u_type, u_status FROM user";
        ResultSet rs = dbc.getData(query);
        
        // Use DbUtils to set the result set to the table
        overview.setModel(DbUtils.resultSetToTableModel(rs));

        // Change column titles
        overview.getColumnModel().getColumn(0).setHeaderValue("ID");
        overview.getColumnModel().getColumn(1).setHeaderValue("First Name");
        overview.getColumnModel().getColumn(2).setHeaderValue("Last Name");
        overview.getColumnModel().getColumn(3).setHeaderValue("Contact Number");
        overview.getColumnModel().getColumn(4).setHeaderValue("Role");
        overview.getColumnModel().getColumn(5).setHeaderValue("Status");
        
        // Refresh the table to apply the new headers
        overview.getTableHeader().repaint();
        
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        overview = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        accounts = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        logs = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbg.setBackground(new java.awt.Color(173, 216, 230));
        mbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Clients");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 80));

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Admins");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 250, 80));

        jPanel4.setBackground(new java.awt.Color(173, 216, 230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Pending Accounts");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 250, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("ADMIN DASHBOARD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(173, 216, 230));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Contact Number", "Role", "Status"
            }
        ));
        jScrollPane1.setViewportView(overview);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 740, 260));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setText("Overview");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 760, 320));

        mbg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 510));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("iPark");
        mbg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (2).png"))); // NOI18N
        exit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                exitFocusLost(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        mbg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("PROFILE");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        profile.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 3, -1, -1));

        mbg.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 30));

        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("DASHBOARD");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 4, -1, 20));

        mbg.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountsMouseExited(evt);
            }
        });
        accounts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("ACCOUNTS");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        accounts.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 3, -1, -1));

        mbg.add(accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 30));

        logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logsMouseExited(evt);
            }
        });
        logs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("LOGS");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        logs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 4, -1, 20));

        mbg.add(logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        getContentPane().add(mbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_exitFocusLost

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        login log = new login();

        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
       adminDB db = new adminDB();

        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseClicked
       accountmanager man = new accountmanager();

        man.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountsMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
       account acc = new account();

        acc.setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(lightGray);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
       dashboard.setBackground(white);
    }//GEN-LAST:event_dashboardMouseExited

    private void accountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseEntered
        accounts.setBackground(lightGray);
    }//GEN-LAST:event_accountsMouseEntered

    private void accountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseExited
        accounts.setBackground(white);
    }//GEN-LAST:event_accountsMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setBackground(lightGray);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setBackground(white);
    }//GEN-LAST:event_profileMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    }//GEN-LAST:event_jLabel12MouseClicked

    private void logsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsMouseClicked
        adminlogs log = new adminlogs();

        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logsMouseClicked

    private void logsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsMouseEntered
        logs.setBackground(lightGray);
    }//GEN-LAST:event_logsMouseEntered

    private void logsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsMouseExited
        logs.setBackground(white);
    }//GEN-LAST:event_logsMouseExited

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
            java.util.logging.Logger.getLogger(adminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accounts;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logs;
    private javax.swing.JPanel mbg;
    private javax.swing.JTable overview;
    private javax.swing.JPanel profile;
    // End of variables declaration//GEN-END:variables
}
