/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import Event.Connect_db;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Chenhai
 */
public class Account extends javax.swing.JFrame {
    
    private static Account signup;
    private static Connection con;
    private static Statement stm;
    private ResultSet rs;

    /**
     * Creates new form Signup
     */
    public Account() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngSex = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jlHeader = new javax.swing.JLabel();
        jlFullName = new javax.swing.JLabel();
        jtFullName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtSignin = new javax.swing.JButton();
        jlSex = new javax.swing.JLabel();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        jlPosition = new javax.swing.JLabel();
        jtPoistion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jlUsername = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jlPassword = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jtPassword = new javax.swing.JPasswordField();
        jlRe_Password = new javax.swing.JLabel();
        jtRe_Password = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jlExit = new javax.swing.JLabel();
        jlMinimize = new javax.swing.JLabel();
        jcNew = new javax.swing.JCheckBox();
        jcDisable = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(31, 58, 146));

        jlHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlHeader.setForeground(new java.awt.Color(255, 255, 255));
        jlHeader.setText("Profile");

        jlFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlFullName.setForeground(new java.awt.Color(255, 255, 255));
        jlFullName.setText("Full Name");

        jtFullName.setBackground(new java.awt.Color(31, 58, 146));
        jtFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtFullName.setForeground(new java.awt.Color(255, 255, 255));
        jtFullName.setToolTipText("Enter Your Full Name");
        jtFullName.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jbtSignin.setBackground(new java.awt.Color(0, 102, 153));
        jbtSignin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtSignin.setForeground(new java.awt.Color(255, 255, 255));
        jbtSignin.setText("OK");
        jbtSignin.setToolTipText("Summit");
        jbtSignin.setName("Summit"); // NOI18N
        jbtSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OnMouseEntered(evt);
            }
        });

        jlSex.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlSex.setForeground(new java.awt.Color(255, 255, 255));
        jlSex.setText("Sex");

        jrbMale.setBackground(new java.awt.Color(31, 58, 146));
        btngSex.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrbMale.setForeground(new java.awt.Color(255, 255, 255));
        jrbMale.setSelected(true);
        jrbMale.setText("Male");
        jrbMale.setToolTipText("Male");

        jrbFemale.setBackground(new java.awt.Color(31, 58, 146));
        btngSex.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrbFemale.setForeground(new java.awt.Color(255, 255, 255));
        jrbFemale.setText("Female");
        jrbFemale.setToolTipText("Female");

        jlPosition.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlPosition.setForeground(new java.awt.Color(255, 255, 255));
        jlPosition.setText("Position");

        jtPoistion.setBackground(new java.awt.Color(31, 58, 146));
        jtPoistion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtPoistion.setForeground(new java.awt.Color(255, 255, 255));
        jtPoistion.setToolTipText("Enter Your Position");
        jtPoistion.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(255, 255, 255));
        jlUsername.setText("Username");

        jtUsername.setBackground(new java.awt.Color(31, 58, 146));
        jtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtUsername.setForeground(new java.awt.Color(255, 255, 255));
        jtUsername.setToolTipText("Enter Your Username");
        jtUsername.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jlPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlPassword.setText("Password");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jtPassword.setBackground(new java.awt.Color(31, 58, 146));
        jtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtPassword.setForeground(new java.awt.Color(255, 255, 255));
        jtPassword.setToolTipText("Enter Your Password");
        jtPassword.setBorder(null);

        jlRe_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlRe_Password.setForeground(new java.awt.Color(255, 255, 255));
        jlRe_Password.setText("Re-Password");

        jtRe_Password.setBackground(new java.awt.Color(31, 58, 146));
        jtRe_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtRe_Password.setForeground(new java.awt.Color(255, 255, 255));
        jtRe_Password.setToolTipText("Enter Your Password Again");
        jtRe_Password.setBorder(null);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

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

        jcNew.setBackground(new java.awt.Color(31, 58, 146));
        jcNew.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jcNew.setForeground(new java.awt.Color(255, 255, 255));
        jcNew.setText("New");

        jcDisable.setBackground(new java.awt.Color(31, 58, 146));
        jcDisable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jcDisable.setForeground(new java.awt.Color(255, 255, 255));
        jcDisable.setText("Disable");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtRe_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jlHeader))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFullName)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlRe_Password)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jcNew)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcDisable))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlPosition)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jtPoistion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jlUsername)
                                                .addGap(159, 159, 159))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jlPassword)
                                                .addGap(163, 163, 163)))
                                        .addGap(10, 10, 10))
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlSex)
                            .addGap(18, 18, 18)
                            .addComponent(jrbMale)
                            .addGap(18, 18, 18)
                            .addComponent(jrbFemale))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlExit)
                    .addComponent(jlMinimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlHeader)
                .addGap(21, 21, 21)
                .addComponent(jlFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSex)
                    .addComponent(jrbMale)
                    .addComponent(jrbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPosition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPoistion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlRe_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtRe_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcNew)
                    .addComponent(jcDisable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtSignin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseEntered
       String[] NameComponent = {"Login","Signup","Back","Summit","Reset"};
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

    private void jbtSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSigninMouseClicked
        String fullName = jtFullName.getText();
        String userName = jtUsername.getText();
        String sex = getSex();
        String position = jtPoistion.getText();
        String password = jtPassword.getText();
        String re_password = jtRe_Password.getText();
        if (!fullName.isEmpty() && !userName.isEmpty() && !position.isEmpty()){
            if (!password.equals(re_password)) {
                JOptionPane.showMessageDialog(null, "Your password not match!", "Password not match", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                con = Connect_db.getConnection();
                stm = Connect_db.getStatement();
                try {
                    if (con != null && stm != null) {
                        rs = stm.executeQuery("SELECT Username FROM tbUser");
                        ArrayList<String> arrayUsername = new ArrayList<>();
                        while(rs.next()){
                            arrayUsername.add(rs.getString(1));
                        }
                        if (!arrayUsername.contains(userName)) {
                            CallableStatement cs = con.prepareCall("{call dbo.insertUser("+fullName+","+userName+","+password+","+position+","+sex+","+null+","+null+","+null+")}");
                            cs.execute();
                            JOptionPane.showMessageDialog(null, "SignUp successfully!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                            new Signin().setVisible(true);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "This username has already!", "Signin", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else{
                        System.out.println("Connection null!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fullname, Username, Position\nCan't be null", "Enter information!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbtSigninMouseClicked

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngSex;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbtSignin;
    private javax.swing.JCheckBox jcDisable;
    private javax.swing.JCheckBox jcNew;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlHeader;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlPosition;
    private javax.swing.JLabel jlRe_Password;
    private javax.swing.JLabel jlSex;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtPoistion;
    private javax.swing.JPasswordField jtRe_Password;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables

    private String getSex() {
        String sex = "";
        if(jrbMale.isSelected()){
            sex = "M";
        }
        if(jrbFemale.isSelected()){
            sex = "F";
        }
        return sex;
    }
    
    public static Account getInstance(){
        if (signup == null) {
            signup = new Account();
        }
        return signup;
    }
}
