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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Signin extends javax.swing.JFrame {
    
    private static Signin signin;
    private static Connection con;
    private static Statement stm;
    private ResultSet rs;
    private int check =0;

    public Signin() {
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
        jlExit = new javax.swing.JLabel();
        jlMinimize = new javax.swing.JLabel();
        jlHeader = new javax.swing.JLabel();
        jlUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtSignup = new javax.swing.JButton();
        jbtLogin = new javax.swing.JButton();
        jlForgot = new javax.swing.JLabel();
        jtPassword = new javax.swing.JPasswordField();
        jtUsername = new javax.swing.JTextField();

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
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jpComponent.setBackground(new java.awt.Color(31, 58, 146));

        jlExit.setBackground(new java.awt.Color(31, 58, 146));
        jlExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barform/icons8_multiply_20px.png"))); // NOI18N
        jlExit.setToolTipText("Close");
        jlExit.setName("Exit"); // NOI18N
        jlExit.setOpaque(true);
        jlExit.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jlHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlHeader.setForeground(new java.awt.Color(255, 255, 255));
        jlHeader.setText("Sign in");

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(255, 255, 255));
        jlUsername.setText("Username");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jbtSignup.setBackground(new java.awt.Color(34, 167, 240));
        jbtSignup.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtSignup.setForeground(new java.awt.Color(255, 255, 255));
        jbtSignup.setText("Signup");
        jbtSignup.setToolTipText("Signup");
        jbtSignup.setName("Signup"); // NOI18N
        jbtSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseEntered(evt);
            }
        });

        jbtLogin.setBackground(new java.awt.Color(219, 10, 91));
        jbtLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtLogin.setText("Login");
        jbtLogin.setToolTipText("Login");
        jbtLogin.setName("Login"); // NOI18N
        jbtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseEntered(evt);
            }
        });

        jlForgot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlForgot.setForeground(new java.awt.Color(153, 153, 153));
        jlForgot.setText("Forgot password ?");
        jlForgot.setToolTipText("Forgot Password ?");
        jlForgot.setName("Forgot"); // NOI18N
        jlForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlForgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseLabelEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OnMouseLabelExited(evt);
            }
        });

        jtPassword.setBackground(new java.awt.Color(31, 58, 146));
        jtPassword.setColumns(15);
        jtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(204, 204, 204));
        jtPassword.setToolTipText("Enter Password here");
        jtPassword.setBorder(null);

        jtUsername.setBackground(new java.awt.Color(31, 58, 146));
        jtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(204, 204, 204));
        jtUsername.setToolTipText("Enter Your Username");
        jtUsername.setBorder(null);

        javax.swing.GroupLayout jpComponentLayout = new javax.swing.GroupLayout(jpComponent);
        jpComponent.setLayout(jpComponentLayout);
        jpComponentLayout.setHorizontalGroup(
            jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComponentLayout.createSequentialGroup()
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComponentLayout.createSequentialGroup()
                        .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(jlForgot))
                                .addGroup(jpComponentLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpComponentLayout.createSequentialGroup()
                                            .addComponent(jbtSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlUsername)
                                        .addComponent(jLabel5)
                                        .addGroup(jpComponentLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jpComponentLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComponentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlHeader)
                .addGap(137, 137, 137))
        );
        jpComponentLayout.setVerticalGroup(
            jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComponentLayout.createSequentialGroup()
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlExit)
                    .addComponent(jlMinimize))
                .addGap(20, 20, 20)
                .addComponent(jlHeader)
                .addGap(19, 19, 19)
                .addComponent(jlUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlForgot)
                .addGap(18, 18, 18)
                .addGroup(jpComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSignup)
                    .addComponent(jbtLogin))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jpComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDetailProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseEntered
       String[] NameComponent = {"Login","Signup",};
        for (String NameComponent1 : NameComponent) {
            if (NameComponent1.equals(evt.getComponent().getName())) {
                evt.getComponent().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
        }
    }//GEN-LAST:event_OnMouseEntered

    private void OnMouseLabelClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelClicked

        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
            if(JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0){
                System.exit(0);
            }
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            this.setState(JFrame.ICONIFIED);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Forgot")){
            //new ResetPassword().setVisible(true);
            ResetPassword.getInstance().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_OnMouseLabelClicked

    private void OnMouseLabelEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelEntered
        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
            evt.getComponent().setBackground(Color.red);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(37, 116, 168));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Forgot")){
            evt.getComponent().setForeground(Color.WHITE);
            evt.getComponent().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_OnMouseLabelEntered

    private void OnMouseLabelExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseLabelExited
        if(evt.getComponent().getName().equalsIgnoreCase("Exit")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Forgot")){
            evt.getComponent().setForeground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_OnMouseLabelExited

    private void jbtSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSignupMouseClicked
        Signup.getInstance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtSignupMouseClicked

    private void jbtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtLoginMouseClicked
        String username = jtUsername.getText();
        String password = jtPassword.getText();
        try {
            rs = stm.executeQuery("SELECT username FROM tbUser WHERE username = '" + username + "' and user_password = '" + password + "'");
            int count = 0;
            while(rs.next()){
                count++;
                
            }
            //System.out.println("count = " + count);
            if(count == 0){
                check++;
                if(check==3){
                    JOptionPane.showMessageDialog(null, "You are trying to login !", "Login trying", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong username or password!", "Login fail", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                new Dashboard().setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtLoginMouseClicked

    private void jlForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlForgotMouseClicked
        ResetPassword.getInstance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlForgotMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        con = Connect_db.getConnection();
        stm = Connect_db.getStatement();
        
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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtSignup;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlForgot;
    private javax.swing.JLabel jlHeader;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JPanel jpComponent;
    private javax.swing.JPanel jpDetailProject;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables

    public static Signin getInstance(){
        if (signin == null) {
            signin = new Signin();
        }
        return signin;
    }
    
}
