
package Main;

import Model.User;
import Service.User_Service;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JFrame {
    User_Service ss= new User_Service();
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
          setIcon();
    }
  private boolean check(){
         if(txtUser.getText().trim().length()==0&txtPass.getPassword().length==0){
             txtUser.requestFocus();
             JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin","Thông báo",JOptionPane.WARNING_MESSAGE);
             return false;
         }
         if(txtUser.getText().trim().length()==0){
             txtUser.requestFocus();
             JOptionPane.showMessageDialog(this, "Vui lòng nhập ID");
             return false;
         }
         if(txtPass.getPassword().length==0){
             txtPass.requestFocus();
             JOptionPane.showMessageDialog(this, "Vui lòng nhập Pass");
             return false;
         }
         return true;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnResert = new javax.swing.JButton();
        chkCheck = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setText("Username");
        txtUser.setBorder(new javax.swing.border.MatteBorder(null));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        jPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 104, 182, 31));

        txtPass.setText("Password");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 167, 182, 31));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 139, 200, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 204, 200, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 105, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Unlock.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 167, -1, 47));

        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 79, 84)));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 266, 85, 33));

        btnResert.setText("Cancer");
        btnResert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 79, 84)));
        btnResert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResertActionPerformed(evt);
            }
        });
        jPanel3.add(btnResert, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 266, 85, 33));

        chkCheck.setText("Show Password");
        chkCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheckActionPerformed(evt);
            }
        });
        jPanel3.add(chkCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 220, 114, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 244, 106, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 23, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 340, 360));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-mau-loang-doc-dao_092448013.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheckActionPerformed
        if(chkCheck.isSelected()){
            txtPass.setEchoChar((char)0);
        }
        if(chkCheck.isSelected()==false){
            txtPass.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_chkCheckActionPerformed

    private void btnResertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResertActionPerformed
        txtUser.setText("");
        txtPass.setText("");
        txtUser.requestFocus();
    }//GEN-LAST:event_btnResertActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ImageIcon icon= new ImageIcon("D:\\Sof203_Java3\\Tai nguyen\\baitap\\PH29011_Ass_Java3\\src\\img\\Help.png");
        ArrayList<User> list= ss.getUser();
        String user=txtUser.getText();
        String pass=new String(txtPass.getPassword());
        if(check()){
            for (User x : list) {
                if(user.equals(x.getUser())&&pass.equals(x.getPass())){
                    JOptionPane.showMessageDialog(this, "Login thành công");
                    if(x.getRole().equalsIgnoreCase("nhanvien")){
                        setVisible(false);
                        QuanLyTTNhanVien sv=new QuanLyTTNhanVien();
                        sv.setVisible(true);
                    }else{
                        setVisible(false);
                        QuanLyChamCong d= new QuanLyChamCong();
                        d.setVisible(true);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại","Thất bại",JOptionPane.INFORMATION_MESSAGE, icon);

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        txtPass.setText("");

    }//GEN-LAST:event_txtPassMouseClicked

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        txtUser.setText("");
    }//GEN-LAST:event_txtUserMouseClicked

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnResert;
    private javax.swing.JCheckBox chkCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Sof203_Java3\\Tai nguyen\\baitap\\JavaApplication7\\src\\img\\User group.png"));

    }
}
