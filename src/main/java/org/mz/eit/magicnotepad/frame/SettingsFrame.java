
/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.eit.magicnotepad.frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.log4j.LogManager;
import org.mz.eit.magicnotepad.constant.Constant;

/**
 * This Frame is open when user want to change setting by logging in.
 *
 * @author ankesh
 */
public class SettingsFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = -6427245149710041681L;
    public static String magicFilePath;
    private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(SettingsFrame.class.getName());

    public SettingsFrame() {
        initComponents();
        filePathField.setText(magicFilePath);
    }


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

		fileChooseBttn.setText("...");
		fileChooseBttn.addActionListener((ActionEvent evt)->
		fileChooseBttnActionPerformed());

		saveBttn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
		saveBttn.setText("Save");
		saveBttn.addActionListener((ActionEvent evt)->
		saveBttnActionPerformed());

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
										.addComponent(fileChooseBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
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
	/**
     * This method is called when File choose Button Clicked.
     *
     * @param evt
     */
	private void fileChooseBttnActionPerformed() {//GEN-FIRST:event_fileChooseBttnActionPerformed
            LOGGER.info("File Choose Button Clicked");
            chooserAction();
	}//GEN-LAST:event_fileChooseBttnActionPerformed
    /**
     * This method is called when we clicked on save button.
     *
     * @param evt
     */
	private void saveBttnActionPerformed() {//GEN-FIRST:event_saveBttnActionPerformed
            LOGGER.info("Save Button Clicked");
            saveBttnAction();
	}//GEN-LAST:event_saveBttnActionPerformed
    /**
     * This method is called within the method fileChooseBttnActionPerformed.
     * This method is use to choose the path of destination
     */
    private void chooserAction() {
        fileChooser.showOpenDialog(fileChooseBttn);
        File file = fileChooser.getSelectedFile();
        if (file.exists()) {
            filePathField.setText(file.getPath());
        } else {
            JOptionPane.showMessageDialog(this, Constant.FILE_NOT_FOUND_TITLE,
                     Constant.INCORRECT_LOGIN_TITLE, JOptionPane.ERROR_MESSAGE);
        }
        LOGGER.info("File Choosed");
    }

    /**
     * This method is called within saveBttnActionPerformed. This method is use
     * to save the path of destination
     */
    private void saveBttnAction() {
        FileWriter writeNewFilePath = null;
        try {
            writeNewFilePath = new FileWriter(Constant.PATH_FILE_PATH);
            writeNewFilePath.write(filePathField.getText());
            magicFilePath = filePathField.getText();
            this.dispose();
            new MagicNotepad().setVisible(true);
            LOGGER.info("Saved");
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage(), ex);
        } finally {
            try {
                if (writeNewFilePath != null) {
                    writeNewFilePath.close();
                }
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
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
