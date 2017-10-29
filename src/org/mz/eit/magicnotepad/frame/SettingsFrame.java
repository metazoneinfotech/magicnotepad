package org.mz.eit.magicnotepad.frame;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.mz.eit.magicnotepad.constant.Constant;


public class SettingsFrame extends javax.swing.JFrame {

    public static String magicFilePath;

    public SettingsFrame() {
        initComponents();
        filePathField.setText(magicFilePath);
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        fileChangerContainerPanel = new javax.swing.JPanel();
        filePathField = new javax.swing.JTextField();
        fileChooseBttn = new javax.swing.JButton();
        saveBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select File Path");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Constant.SETTINGS_ICON_PATH));
        setLocationByPlatform(true);
        setResizable(false);

        filePathField.setEditable(false);

        fileChooseBttn.setText("jButton1");
        fileChooseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooseBttnActionPerformed(evt);
            }
        });

        saveBttn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        saveBttn.setText("Save");
        saveBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fileChangerContainerPanelLayout = new javax.swing.GroupLayout(fileChangerContainerPanel);
        fileChangerContainerPanel.setLayout(fileChangerContainerPanelLayout);
        fileChangerContainerPanelLayout.setHorizontalGroup(
            fileChangerContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileChangerContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fileChangerContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fileChangerContainerPanelLayout.createSequentialGroup()
                        .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fileChooseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE))
                    .addGroup(fileChangerContainerPanelLayout.createSequentialGroup()
                        .addComponent(saveBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fileChangerContainerPanelLayout.setVerticalGroup(
            fileChangerContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileChangerContainerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fileChangerContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fileChooseBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filePathField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fileChangerContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fileChangerContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(saveBttn);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void fileChooseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooseBttnActionPerformed
        chooserAction();
    }//GEN-LAST:event_fileChooseBttnActionPerformed

    private void saveBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBttnActionPerformed
        saveBttnAction();
    }//GEN-LAST:event_saveBttnActionPerformed
    
    private void chooserAction(){
        fileChooser.showOpenDialog(fileChooseBttn);
        File file = fileChooser.getSelectedFile();
        if(file.exists()){
            filePathField.setText(file.getPath());
        }
        else
        {
            JOptionPane.showMessageDialog(this,Constant.FILE_NOT_FOUND_TITLE
                 ,Constant.INCORRECT_LOGIN_TITLE,JOptionPane.ERROR_MESSAGE);
        }
     }

    private void saveBttnAction(){
        
        FileWriter writeNewFilePath = null;
        try {
            writeNewFilePath = new FileWriter(Constant.PATH_FILE_PATH);
            writeNewFilePath.write(filePathField.getText());
            writeNewFilePath.close();
            this.dispose();
            new MagicNotepad().setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(SettingsFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fileChangerContainerPanel;
    private javax.swing.JButton fileChooseBttn;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextField filePathField;
    private javax.swing.JButton saveBttn;
    // End of variables declaration//GEN-END:variables
}
