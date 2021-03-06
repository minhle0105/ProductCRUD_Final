package productcrud;

import javax.swing.*;

public class login extends javax.swing.JFrame {
      static Password p = new Password();

      /**
       * Creates new form NewJFrame
       */
      public login() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the form.
       * WARNING: Do NOT modify this code. The content of this method is always
       * regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated
      // Code">//GEN-BEGIN:initComponents
      private void initComponents() {
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            userNameText = new javax.swing.JTextField();
            passwordText = new javax.swing.JPasswordField();
            loginBtn = new javax.swing.JButton();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            jLabel1.setText("UserName");
            jLabel2.setText("Password");
            loginBtn.setText("Log In");
            loginBtn.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        loginBtnActionPerformed(evt);
                  }
            });
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1).addComponent(jLabel2))
                                    .addGap(48, 48, 48)
                                    .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(userNameText)
                                                .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 120,
                                                            Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
                                                            .addComponent(loginBtn,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(148, Short.MAX_VALUE)));
            layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2).addComponent(passwordText,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18).addComponent(loginBtn).addContainerGap(166, Short.MAX_VALUE)));
            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
            String userName = userNameText.getText();
            String userPassword = passwordText.getText();
            if (userName.equals("admin")) {
                  if (p.validatePassword(userPassword)) {
                        JOptionPane.showMessageDialog(this, "Successfully Log In");
                        product newProductForm = new product();
                        newProductForm.setVisible(true);
                        this.setVisible(false);
                  }
            } else {
                  JOptionPane.showMessageDialog(this, "Invalid UserName or Password");
            }
      }

      /**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
            // (optional) ">
            /*
             * If Nimbus (introduced in Java SE 6) is not available, stay with the default
             * look and feel. For details see
             * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Metal".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                              ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                              ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                              ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null,
                              ex);
            }
            // </editor-fold>
            // </editor-fold>
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new login().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JButton loginBtn;
      private javax.swing.JPasswordField passwordText;
      private javax.swing.JTextField userNameText;
      // End of variables declaration//GEN-END:variable
}