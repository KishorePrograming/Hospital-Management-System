/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RedirectUserType;
import View.ViewChannel;
import Entities.Doctor;
import View.ViewDoctor;
import home_page.Login;
import java.sql.Connection;
/**
 *
 * @author 91979
 */
public class MainDoctor extends javax.swing.JFrame {
    private int id;
    private String username;
    private String usertype;
    private Connection con;
    
    /**
     * Creates new form Main
     */
    public MainDoctor() {
        initComponents();
        }
     
    public MainDoctor(int id, String username, String usertype,Connection con){
        initComponents();
        this.con=con;
        this.id = id;
        this.username = username;
        this.usertype = usertype;
        lblusernamemain.setText(username);
        lblusertypemain.setText(usertype);
        btndoctor.requestFocus();
        lbllogid.setText(Integer.toString(this.id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btndoctor = new javax.swing.JButton();
        btnviewchennal = new javax.swing.JButton();
        btnviewdoctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblusert = new javax.swing.JLabel();
        lblusern = new javax.swing.JLabel();
        lblusertypemain = new javax.swing.JLabel();
        lblusernamemain = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbllogid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 153, 204));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndoctor.setBackground(new java.awt.Color(153, 255, 255));
        btndoctor.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btndoctor.setForeground(new java.awt.Color(0, 102, 102));
        btndoctor.setText("Doctor");
        btndoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoctorActionPerformed(evt);
            }
        });
        jPanel2.add(btndoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 36));

        btnviewchennal.setBackground(new java.awt.Color(153, 255, 255));
        btnviewchennal.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnviewchennal.setForeground(new java.awt.Color(0, 102, 102));
        btnviewchennal.setText("View Chennal");
        btnviewchennal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewchennalActionPerformed(evt);
            }
        });
        jPanel2.add(btnviewchennal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 36));

        btnviewdoctor.setBackground(new java.awt.Color(153, 255, 255));
        btnviewdoctor.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnviewdoctor.setForeground(new java.awt.Color(0, 102, 102));
        btnviewdoctor.setText("View Doctor");
        btnviewdoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdoctorActionPerformed(evt);
            }
        });
        jPanel2.add(btnviewdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 120, 36));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("RSK HOSPITAL");

        lblusert.setBackground(new java.awt.Color(0, 255, 255));
        lblusert.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lblusert.setForeground(new java.awt.Color(153, 255, 102));
        lblusert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusert.setText("User Type");
        lblusert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 4));

        lblusern.setBackground(new java.awt.Color(0, 255, 255));
        lblusern.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lblusern.setForeground(new java.awt.Color(153, 255, 102));
        lblusern.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusern.setText("User Name");
        lblusern.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 4));

        lblusertypemain.setBackground(new java.awt.Color(0, 255, 255));
        lblusertypemain.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lblusertypemain.setForeground(new java.awt.Color(153, 255, 102));
        lblusertypemain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusertypemain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 4));

        lblusernamemain.setBackground(new java.awt.Color(102, 255, 102));
        lblusernamemain.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lblusernamemain.setForeground(new java.awt.Color(153, 255, 102));
        lblusernamemain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusernamemain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 4));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Founded By Kishore R");

        btnlogout.setBackground(new java.awt.Color(153, 255, 255));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(0, 102, 102));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left.png"))); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Doctor Page");

        lbllogid.setBackground(new java.awt.Color(255, 255, 255));
        lbllogid.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        lbllogid.setForeground(new java.awt.Color(102, 255, 255));
        lbllogid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        lbllogid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("log id: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusern, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusert, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusernamemain, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusertypemain, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnlogout)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlogout)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel10)
                    .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblusernamemain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusern))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusert)
                    .addComponent(lblusertypemain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewchennalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewchennalActionPerformed
         System.gc();
         this.setVisible(false);
         ViewChannel d = new ViewChannel();
         d.id =this.id;
         d.username= this.username;
         d.usertype=this.usertype;
         d.setVisible(true);
//       new View.ViewChannel(this.id,lblusernamemain.getText(),this.usertype,con).setVisible(true);
    }//GEN-LAST:event_btnviewchennalActionPerformed

    private void btndoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoctorActionPerformed
       System.gc();
       this.setVisible(false);
       new Doctor(this.id,lblusernamemain.getText(),this.usertype,con).setVisible(true);
    }//GEN-LAST:event_btndoctorActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
      System.gc();
      this.setVisible(false);
      new Login(con).setVisible(true);  
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnviewdoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdoctorActionPerformed
      System.gc();
      this.setVisible(false);
      new ViewDoctor(this.id,lblusernamemain.getText(),this.usertype,con).setVisible(true); 
    }//GEN-LAST:event_btnviewdoctorActionPerformed

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
            java.util.logging.Logger.getLogger(MainDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoctor;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnviewchennal;
    private javax.swing.JButton btnviewdoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbllogid;
    private javax.swing.JLabel lblusern;
    private javax.swing.JLabel lblusernamemain;
    private javax.swing.JLabel lblusert;
    private javax.swing.JLabel lblusertypemain;
    // End of variables declaration//GEN-END:variables
}
