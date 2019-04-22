/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Chenhai
 */
public class Classroom extends javax.swing.JFrame {
    
    private static Classroom classroom;

    /**
     * Creates new form Faculty
     */
    public Classroom() {
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

        jPanel1 = new javax.swing.JPanel();
        jlMinimize = new javax.swing.JLabel();
        jlClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFaculty = new javax.swing.JTable();
        jbtNew = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtUpdate = new javax.swing.JButton();
        jbtDelete = new javax.swing.JButton();
        jbtSearch = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(31, 58, 146));

        jlMinimize.setBackground(new java.awt.Color(31, 58, 146));
        jlMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barform/icons8_minus_math_20px.png"))); // NOI18N
        jlMinimize.setName("Minimize"); // NOI18N
        jlMinimize.setOpaque(true);
        jlMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizeOnMouseLabelClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMinimizeOnMouseLabelEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMinimizeOnMouseLabelExited(evt);
            }
        });

        jlClose.setBackground(new java.awt.Color(31, 58, 146));
        jlClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barform/icons8_multiply_20px.png"))); // NOI18N
        jlClose.setName("Close"); // NOI18N
        jlClose.setOpaque(true);
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseOnMouseLabelClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCloseOnMouseLabelEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCloseOnMouseLabelExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jlClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlClose)
            .addComponent(jlMinimize)
        );

        jPanel2.setBackground(new java.awt.Color(31, 58, 146));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Classroom Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room No.");

        jTextField1.setBackground(new java.awt.Color(31, 58, 146));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Building");

        jTextField2.setBackground(new java.awt.Color(31, 58, 146));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacity");

        jTextField3.setBackground(new java.awt.Color(31, 58, 146));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");

        jTextField4.setBackground(new java.awt.Color(31, 58, 146));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);

        jtFaculty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtFaculty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classroom No", "Building", "Capacity", "Description"
            }
        ));
        jtFaculty.setName("lstView"); // NOI18N
        jtFaculty.setSelectionBackground(new java.awt.Color(51, 0, 102));
        jScrollPane1.setViewportView(jtFaculty);

        jbtNew.setBackground(new java.awt.Color(0, 102, 153));
        jbtNew.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtNew.setForeground(new java.awt.Color(255, 255, 255));
        jbtNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/New.png"))); // NOI18N
        jbtNew.setText("New");

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/Save.png"))); // NOI18N
        jButton3.setText("Save");

        jbtUpdate.setBackground(new java.awt.Color(0, 102, 153));
        jbtUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jbtUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/Update.png"))); // NOI18N
        jbtUpdate.setText("Update");

        jbtDelete.setBackground(new java.awt.Color(0, 102, 153));
        jbtDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/Delete.png"))); // NOI18N
        jbtDelete.setText("Delete");

        jbtSearch.setBackground(new java.awt.Color(0, 102, 153));
        jbtSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jbtSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/button/Search.png"))); // NOI18N
        jbtSearch.setText("Search");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSeparator5.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                                .addGap(158, 158, 158))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator4)
                                .addGap(54, 54, 54)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator5)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jbtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNew)
                    .addComponent(jButton3)
                    .addComponent(jbtUpdate)
                    .addComponent(jbtDelete)
                    .addComponent(jbtSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlMinimizeOnMouseLabelClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeOnMouseLabelClicked
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            //Create Messagebox =>> Yes No Ok

            //Call Loginform or Staying form Dashboard
            new Signin().setVisible(true);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            this.setState(ICONIFIED);
        }
    }//GEN-LAST:event_jlMinimizeOnMouseLabelClicked

    private void jlMinimizeOnMouseLabelEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeOnMouseLabelEntered
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            evt.getComponent().setBackground(Color.red);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jlMinimizeOnMouseLabelEntered

    private void jlMinimizeOnMouseLabelExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeOnMouseLabelExited
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
    }//GEN-LAST:event_jlMinimizeOnMouseLabelExited

    private void jlCloseOnMouseLabelClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseOnMouseLabelClicked
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            //Create Messagebox =>> Yes No Ok

            lstClassroom.dashboard.setEnabled(true);
            this.dispose();
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            this.setState(ICONIFIED);
        }
    }//GEN-LAST:event_jlCloseOnMouseLabelClicked

    private void jlCloseOnMouseLabelEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseOnMouseLabelEntered
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            evt.getComponent().setBackground(Color.red);
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jlCloseOnMouseLabelEntered

    private void jlCloseOnMouseLabelExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseOnMouseLabelExited
        if(evt.getComponent().getName().equalsIgnoreCase("Close")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
        if(evt.getComponent().getName().equalsIgnoreCase("Minimize")){
            evt.getComponent().setBackground(new Color(31,58,146));
        }
    }//GEN-LAST:event_jlCloseOnMouseLabelExited

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
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtNew;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JTable jtFaculty;
    // End of variables declaration//GEN-END:variables

    public static Classroom getInstance(){
        if (classroom == null) {
            classroom = new Classroom();
        }
        return classroom;
    }
    
}
