package org.mz.eit.magicnotepad.frame;

import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.mz.eit.magicnotepad.bean.LoginCredentials;
import org.mz.eit.magicnotepad.constant.Constant;
import org.mz.eit.magicnotepad.service.LoginAuthService;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLoginCotainerPanel = new javax.swing.JPanel();
        loginBttn = new javax.swing.JButton();
        userIdLabel = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRATOR LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Constant.SETTINGS_ICON_PATH));
        setResizable(false);

        adminLoginCotainerPanel.setFocusable(false);

        loginBttn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginBttn.setForeground(new java.awt.Color(0, 0, 153));
        loginBttn.setText("LOGIN");
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        userIdLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        userIdLabel.setText("USER ID");

        pwdLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pwdLabel.setText("PASSWORD");

        javax.swing.GroupLayout adminLoginCotainerPanelLayout = new javax.swing.GroupLayout(adminLoginCotainerPanel);
        adminLoginCotainerPanel.setLayout(adminLoginCotainerPanelLayout);
        adminLoginCotainerPanelLayout.setHorizontalGroup(
            adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginCotainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(userIdField))
                .addContainerGap())
        );
        adminLoginCotainerPanelLayout.setVerticalGroup(
            adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginCotainerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminLoginCotainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBttn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLoginCotainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLoginCotainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        char[] passwordArray = pwdField.getPassword();
        String userId = userIdField.getText();
        String password = String.copyValueOf(passwordArray);
        LoginCredentials credentials = new LoginCredentials();
        credentials.setUserId(userId);
        credentials.setPassword(password);
        boolean authorised = new LoginAuthService().authenticateUser(credentials);
        if (authorised) {
            new SettingsFrame().setVisible(true);
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, Constant.INCORRECT_LOGIN_MSG,
                    Constant.INCORRECT_LOGIN_TITLE, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_loginBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminLoginCotainerPanel;
    private javax.swing.JButton loginBttn;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField userIdField;
    private javax.swing.JLabel userIdLabel;
    // End of variables declaration//GEN-END:variables
}
