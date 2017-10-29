package org.mz.eit.magicnotepad.frame;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import org.mz.eit.magicnotepad.constant.Constant;

public class MagicNotepad extends javax.swing.JFrame {

    private FileReader magicFileReader;
    private int magicChar;
    
    public MagicNotepad() {
        initComponents();
        initFiles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notePadScrollPane = new javax.swing.JScrollPane();
        fileArea = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        settings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAGIC NOTEPAD");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(Constant.MAGIC_ICON_PATH));

        fileArea.setColumns(20);
        fileArea.setRows(5);
        fileArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fileAreaKeyTyped(evt);
            }
        });
        notePadScrollPane.setViewportView(fileArea);

        fileMenu.setText("File");

        settings.setIcon(new javax.swing.ImageIcon(Constant.SETTINGS_MENU_ICON_PATH));
        settings.setText("Settings");
        settings.setMaximumSize(new java.awt.Dimension(36570, 36570));
        settings.setPressedIcon(new javax.swing.ImageIcon(Constant.SETTINGS_ICON_PATH)
        );
        settings.setSelectedIcon(new javax.swing.ImageIcon(Constant.SETTINGS_ICON_PATH)
        );
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        fileMenu.add(settings);

        menu.add(fileMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notePadScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notePadScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initFiles(){
        BufferedReader reader;
        FileReader fileReader;
        try {
            fileReader = new FileReader(Constant.PATH_FILE_PATH);
            reader = new BufferedReader(fileReader);
            SettingsFrame.magicFilePath = reader.readLine();
            if(SettingsFrame.magicFilePath==null || SettingsFrame.magicFilePath.isEmpty()){
                SettingsFrame.magicFilePath = Constant.DEFAULT_FILE_PATH;
            }
            reader.close();
            fileReader.close();
            
            magicFileReader = new FileReader(SettingsFrame.magicFilePath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MagicNotepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MagicNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_settingsActionPerformed

    private void fileAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fileAreaKeyTyped
        try {
            magicChar = magicFileReader.read();
            evt.setKeyChar((char) magicChar);
        } catch (NullPointerException ex) {
        } catch (IOException ex) {
            Logger.getLogger(MagicNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fileAreaKeyTyped

    public static void main(String[] args) throws FileNotFoundException {

        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagicNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MagicNotepad magicnote=new MagicNotepad();
                magicnote.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea fileArea;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menu;
    private javax.swing.JScrollPane notePadScrollPane;
    private javax.swing.JMenuItem settings;
    // End of variables declaration//GEN-END:variables

}
