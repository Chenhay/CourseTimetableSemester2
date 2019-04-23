/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Event.Connect_db;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ResetPassword extends javax.swing.JFrame {
    
    private static ResetPassword resetPassword;
    private static Connection con;
    private static Statement stm;
    private ResultSet rs;

    
    public ResetPassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDetailProject = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jpComponent = new javax.swing.JPanel();
        jlHeader = new javax.swing.JLabel();
        jlFullName = new javax.swing.JLabel();
        jtFullName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jlNewPassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtSignup = new javax.swing.JButton();
        jbtReset = new javax.swing.JButton();
        jtNew_Password = new javax.swing.JPasswordField();
        jlUsername = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jlRePassword = new javax.swing.JLabel();
        jtRe_Password = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jlMinimize = new javax.swing.JLabel();
        jlExited = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpDetailProject.setBackground(new java.awt.Color(0, 102, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Timetable");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Project");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo/TimetableLogo.png"))); // NOI18N
        jLabel9.setToolTipText("");

        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout jpDetailProjectLayout = new javax.swing.GroupLayout(jpDetailProject);
        jpDetailProject.setLayout(jpDetailProjectLayout);
        jpDetailProjectLayout.setHorizontalGroup(
            jpDetailProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetailProjectLayout.createSequentialGroup()
                .addGroup(jpDetailProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetailProjectLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jpDetailProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(jpDetailProjectLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jpDetailProjectLayout.setVerticalGroup(
            jpDetailProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetailProjectLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpComponent.setBackground(new java.awt.Color(31, 58, 146));

        jlHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlHeader.setForeground(new java.awt.Color(255, 255, 255));
        jlHeader.setText("Reset Password");

        jlFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlFullName.setForeground(new java.awt.Color(255, 255, 255));
        jlFullName.setText("Full Name");

        jtFullName.setBackground(new java.awt.Color(31, 58, 146));
        jtFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtFullName.setForeground(new java.awt.Color(255, 255, 255));
        jtFullName.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jlNewPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlNewPassword.setText("New Password");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jbtSignup.setBackground(new java.awt.Color(0, 102, 204));
        jbtSignup.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtSignup.setForeground(new java.awt.Color(255, 255, 255));
        jbtSignup.setText("Back");
        jbtSignup.setToolTipText("Back");
        jbtSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtSignup.setName("Back"); // NOI18N
        jbtSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseEntered(evt);
            }
        });

        jbtReset.setBackground(new java.awt.Color(153, 0, 153));
        jbtReset.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtReset.setForeground(new java.awt.Color(255, 255, 255));
        jbtReset.setText("Reset");
        jbtReset.setToolTipText("Reset");
        jbtReset.setName("Reset"); // NOI18N
        jbtReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnMouseClicked(evt);
            }
        });

        jtNew_Password.setBackground(new java.awt.Color(31, 58, 146));
        jtNew_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtNew_Password.setBorder(null);

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(255, 255, 255));
        jlUsername.setText("Username");

        jtUsername.setBackground(new java.awt.Color(31, 58, 146));
        jtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(255, 255, 255));
        jtUsername.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jlRePassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlRePassword.setForeground(new java.awt.Color(255, 255, 255));
        jlRePassword.setText("Re-Password");

        jtRe_Password.setBackground(new java.awt.Color(31, 58, 146));
        jtRe_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtRe_Password.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jlMinimize.setBackground(new java.awt.Color(31, 58, 146));
        jlMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barform/icons8_minus_math_20px.png"))); // NOI18N
        jlMinimize.setToolTipText("Minimize");
        jlMinimize.setName("Minimize"); // NOI18N
        jlMinimize.setOpaque(true);
        jlMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnMouseLabelClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseLabelEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OnMouseLabelExited(evt);
            }
        });

        jlExited.setBackground(new java.awt.Color(31, 58, 146));
        jlExited.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlExited.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barform/icons8_multiply_20px.png"))); // NOI18N
        jlExited.setToolTipText("Close");
        jlExited.setName("Exit"); // NOI18N
        jlExited.setOpaque(true);
        jlExited.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnMouseLabelClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseLabelEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OnMouseLabelExited(evt);
            }
        });

        javax.swing.GroupLayout jpComponentLayout = new javax.swing.GroupLayout(jpComponent);
        jpComponent.setLayout(jpComponentLayout);
        jpComponentLayout.setHorizontalGroup(
            jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComponentLayout.createSequentialGroup()
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpComponentLayout.createSequentialGroup()
                        .addComponent(jbtSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpComponentLayout.createSequentialGroup()
                        .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlRePassword)
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jtRe_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNewPassword)
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jtNew_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlUsername)
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(113, 113, 113)
                                    .addComponent(jlHeader))
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlFullName)
                                        .addGroup(jpComponentLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(10, 10, 10)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jlExited, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpComponentLayout.setVerticalGroup(
            jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComponentLayout.createSequentialGroup()
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlExited)
                    .addComponent(jlMinimize))
                .addGap(18, 18, 18)
                .addComponent(jlHeader)
                .addGap(21, 21, 21)
                .addComponent(jlFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNew_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlRePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtRe_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSignup)
                    .addComponent(jbtReset))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jpDetailProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpDetailProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnMouseLabelClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelClicked
        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
           if(JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0){
                System.exit(0);
            }
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            this.setState(ICONIFIED);
        }
    }//GEN-LAST:event_OnMouseLabelClicked

    private void OnMouseLabelEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelEntered
        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
            evt.getComponent().setBackground(Color.red);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(37, 116, 168));
        }
    }//GEN-LAST:event_OnMouseLabelEntered

    private void OnMouseLabelExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelExited
        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
    }//GEN-LAST:event_OnMouseLabelExited

    private void OnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseClicked
        if(evt.getComponent().getName().equalsIgnoreCase("Back")){
            Signin.getInstance().setVisible(true);
            this.dispose();
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Reset")){
            if (!jtFullName.getText().isEmpty() && !jtUsername.getText().isEmpty()) {
                if (!jtNew_Password.getText().isEmpty() && !jtRe_Password.getText().isEmpty()) {
                    if (jtNew_Password.getText().equals(jtRe_Password.getText())) {
                        con = Connect_db.getConnection();
                        stm = Connect_db.getStatement();
                        String adminPassword = JOptionPane.showInputDialog("Please enter Admin's password");
                        System.out.println(adminPassword);
                        if (con != null) {
                            if (stm != null) {
                                try {
                                    rs = stm.executeQuery("SELECT user_position FROM tbUser WHERE user_password = '" + adminPassword + "' GROUP BY user_position");
                                    ArrayList<String> position = new ArrayList<>();
                                    while(rs.next()){
                                        position.add(rs.getString("user_position"));
                                    }
                                    System.out.println(position.toString());
                                    if (position.contains("Admin")) {
                                        rs = stm.executeQuery("SELECT * FROM tbUser WHERE user_fullname = '" + jtFullName.getText() + "' AND username = '" + jtUsername.getText() + "'");
                                        rs.last();
                                        if (rs.getRow() == 1) {
                                            rs.updateString("user_password", jtNew_Password.getText());
                                            rs.updateRow();
                                            JOptionPane.showMessageDialog(null, "Reset password successfully!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
                                            new Signin().setVisible(true);
                                            this.dispose();
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Wrong username or fullname!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Wrong admin's password!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else{
                            System.out.println("stm == null");
                        }
                    }
                    else{
                        System.out.println("con == null");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password not match!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter password!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Enter all Information!", "Reset password", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_OnMouseClicked

    private void OnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseEntered
        String[] NameComponent = {"Back","Reset"};
        for (String NameComponent1 : NameComponent) {
            if (NameComponent1.equals(evt.getComponent().getName())) {
                evt.getComponent().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
        }
    }//GEN-LAST:event_OnMouseEntered

    public static ResetPassword getInstance(){
        if (resetPassword == null) {
            resetPassword = new ResetPassword();
        }
        return resetPassword;
    }
    
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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtReset;
    private javax.swing.JButton jbtSignup;
    private javax.swing.JLabel jlExited;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlHeader;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JLabel jlNewPassword;
    private javax.swing.JLabel jlRePassword;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JPanel jpComponent;
    private javax.swing.JPanel jpDetailProject;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JPasswordField jtNew_Password;
    private javax.swing.JPasswordField jtRe_Password;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables

    
}
