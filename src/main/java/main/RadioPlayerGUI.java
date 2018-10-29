package main;

import configuration.DriverManager;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebElement;
import webElements.WebElements;

public class RadioPlayerGUI extends javax.swing.JFrame {

    public RadioPlayerGUI() {
        initComponents();
        time.TimeAndDate.showTime(labelClock);
        time.TimeAndDate.showData(labelData, labelDay);
        WebElements.clickOnRmffm(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);
    }

    public static WebElement webElement;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonFree = new javax.swing.JButton();
        buttonstop = new javax.swing.JButton();
        buttonRMF = new javax.swing.JButton();
        buttonZet = new javax.swing.JButton();
        buttonEska = new javax.swing.JButton();
        buttonVox = new javax.swing.JButton();
        buttonRmfMaxx = new javax.swing.JButton();
        buttonEskaRock = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonZetGold = new javax.swing.JButton();
        buttonPlay = new javax.swing.JButton();
        labelEqualizer = new javax.swing.JLabel();
        labelRadio = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelClock = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelDay = new javax.swing.JLabel();
        buttonAbout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Radio Player");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        buttonFree.setBackground(new java.awt.Color(255, 204, 0));
        buttonFree.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        buttonFree.setForeground(new java.awt.Color(0, 0, 0));
        buttonFree.setText("Radio Free");
        buttonFree.setToolTipText("Niedostępne");
        buttonFree.setEnabled(false);
        buttonFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFreeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFree);
        buttonFree.setBounds(30, 300, 110, 40);

        buttonstop.setBackground(new java.awt.Color(0, 0, 0));
        buttonstop.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        buttonstop.setForeground(new java.awt.Color(255, 255, 255));
        buttonstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stop.png"))); // NOI18N
        buttonstop.setBorder(null);
        buttonstop.setBorderPainted(false);
        buttonstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonstopActionPerformed(evt);
            }
        });
        jPanel1.add(buttonstop);
        buttonstop.setBounds(490, 210, 60, 50);

        buttonRMF.setBackground(new java.awt.Color(255, 204, 0));
        buttonRMF.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonRMF.setForeground(new java.awt.Color(0, 0, 0));
        buttonRMF.setText("RMF FM");
        buttonRMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRMFActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRMF);
        buttonRMF.setBounds(30, 200, 110, 40);

        buttonZet.setBackground(new java.awt.Color(255, 204, 0));
        buttonZet.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonZet.setForeground(new java.awt.Color(0, 0, 0));
        buttonZet.setText("Radio ZET");
        buttonZet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZetActionPerformed(evt);
            }
        });
        jPanel1.add(buttonZet);
        buttonZet.setBounds(270, 250, 110, 40);

        buttonEska.setBackground(new java.awt.Color(255, 204, 0));
        buttonEska.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonEska.setForeground(new java.awt.Color(0, 0, 0));
        buttonEska.setText("ESKA");
        buttonEska.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEskaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEska);
        buttonEska.setBounds(270, 200, 110, 40);

        buttonVox.setBackground(new java.awt.Color(255, 204, 0));
        buttonVox.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonVox.setForeground(new java.awt.Color(0, 0, 0));
        buttonVox.setText("VOX FM");
        buttonVox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoxActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVox);
        buttonVox.setBounds(150, 300, 110, 40);

        buttonRmfMaxx.setBackground(new java.awt.Color(255, 204, 0));
        buttonRmfMaxx.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonRmfMaxx.setForeground(new java.awt.Color(0, 0, 0));
        buttonRmfMaxx.setText("RMF MAXXX");
        buttonRmfMaxx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRmfMaxxActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRmfMaxx);
        buttonRmfMaxx.setBounds(150, 200, 110, 40);

        buttonEskaRock.setBackground(new java.awt.Color(255, 204, 0));
        buttonEskaRock.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonEskaRock.setForeground(new java.awt.Color(0, 0, 0));
        buttonEskaRock.setText("Eska Rock");
        buttonEskaRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEskaRockActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEskaRock);
        buttonEskaRock.setBounds(150, 250, 110, 40);

        buttonPlus.setBackground(new java.awt.Color(255, 204, 0));
        buttonPlus.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonPlus.setForeground(new java.awt.Color(0, 0, 0));
        buttonPlus.setText("Radio Plus");
        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPlus);
        buttonPlus.setBounds(30, 250, 110, 40);

        buttonZetGold.setBackground(new java.awt.Color(255, 204, 0));
        buttonZetGold.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        buttonZetGold.setForeground(new java.awt.Color(0, 0, 0));
        buttonZetGold.setText("ZET Gold");
        buttonZetGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZetGoldActionPerformed(evt);
            }
        });
        jPanel1.add(buttonZetGold);
        buttonZetGold.setBounds(270, 300, 110, 40);

        buttonPlay.setBackground(new java.awt.Color(0, 0, 0));
        buttonPlay.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        buttonPlay.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        buttonPlay.setBorder(null);
        buttonPlay.setBorderPainted(false);
        buttonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPlay);
        buttonPlay.setBounds(420, 210, 60, 50);
        buttonPlay.setOpaque(true);

        labelEqualizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eq.gif"))); // NOI18N
        jPanel1.add(labelEqualizer);
        labelEqualizer.setBounds(240, 50, 130, 120);

        labelRadio.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
        labelRadio.setForeground(new java.awt.Color(255, 255, 255));
        labelRadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRadio.setText("RMF FM");
        jPanel1.add(labelRadio);
        labelRadio.setBounds(40, 50, 190, 30);

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rmfFm.png"))); // NOI18N
        jPanel1.add(labelLogo);
        labelLogo.setBounds(80, 100, 100, 60);

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 350, 140);

        labelClock.setBackground(new java.awt.Color(0, 0, 0));
        labelClock.setFont(new java.awt.Font("DS-Digital", 1, 24)); // NOI18N
        labelClock.setForeground(new java.awt.Color(255, 255, 255));
        labelClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClock.setText("14:45;56");
        labelClock.setOpaque(true);
        jPanel1.add(labelClock);
        labelClock.setBounds(420, 60, 130, 30);

        labelData.setBackground(new java.awt.Color(0, 0, 0));
        labelData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelData.setForeground(new java.awt.Color(255, 255, 255));
        labelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelData.setText("21 Październik 2018");
        labelData.setOpaque(true);
        jPanel1.add(labelData);
        labelData.setBounds(410, 130, 150, 40);

        labelDay.setBackground(new java.awt.Color(0, 0, 0));
        labelDay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDay.setForeground(new java.awt.Color(255, 255, 255));
        labelDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDay.setText("środa");
        labelDay.setOpaque(true);
        jPanel1.add(labelDay);
        labelDay.setBounds(420, 110, 130, 20);

        buttonAbout.setBackground(new java.awt.Color(255, 204, 0));
        buttonAbout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonAbout.setForeground(new java.awt.Color(0, 0, 0));
        buttonAbout.setText("Info");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAbout);
        buttonAbout.setBounds(30, 10, 60, 20);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 40, 170, 140);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 200, 170, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void aboutProgram() throws HeadlessException {
        JOptionPane.showMessageDialog(null,
                "Program \"Radio internetowe\" służy do odtwarzania audycji radiowych takich jak: \"RMF FM\" czy \"Radio Zet\".\n"
                + "Program działa za pośrednictwem strony internetowej \"http://radiofm-online.com\".\n"
                + "Dodatkowo program wyświetla aktulaną datę oraz godzinę.\n\n"
                + "Autor:  Grzegorz Filewicz\n"
                + "Lublin, Luty 2018.",
                "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exitProgram() throws HeadlessException {
        int exit = JOptionPane.showConfirmDialog(rootPane, "Czy napewno chcesz wyjść?", "Notatnik", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();
            DriverManager.disposeDriver();
        } else if (exit == JOptionPane.NO_OPTION) {
        }
    }


    private void buttonFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFreeActionPerformed

        WebElements.clickOnRadioFree(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);
    }//GEN-LAST:event_buttonFreeActionPerformed


    private void buttonstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonstopActionPerformed
        WebElements.clickOnButtonStop(DriverManager.getWebDriver(), webElement, labelEqualizer);
    }//GEN-LAST:event_buttonstopActionPerformed


    private void buttonVoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoxActionPerformed
        WebElements.clickOnVoxfmButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);
    }//GEN-LAST:event_buttonVoxActionPerformed


    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayActionPerformed
        WebElements.clickOnButtonPlay(DriverManager.getWebDriver(), webElement, labelEqualizer);
    }//GEN-LAST:event_buttonPlayActionPerformed


    private void buttonRmfMaxxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRmfMaxxActionPerformed

        WebElements.clickOnRmfmaxButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonRmfMaxxActionPerformed


    private void buttonRMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRMFActionPerformed

        WebElements.clickOnRmffm(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonRMFActionPerformed


    private void buttonEskaRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEskaRockActionPerformed
        WebElements.clickOnEskaRockButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonEskaRockActionPerformed


    private void buttonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlusActionPerformed
        WebElements.clickOnRadioPlusButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonPlusActionPerformed


    private void buttonZetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZetActionPerformed
        WebElements.clickOnradioZetButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonZetActionPerformed


    private void buttonZetGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZetGoldActionPerformed
        WebElements.clickOnRadioZetGoldButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);
    }//GEN-LAST:event_buttonZetGoldActionPerformed


    private void buttonEskaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEskaActionPerformed
        WebElements.clickOnRadioEskaButton(DriverManager.getWebDriver(), webElement, labelRadio, labelLogo, labelEqualizer);

    }//GEN-LAST:event_buttonEskaActionPerformed


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitProgram();
    }//GEN-LAST:event_formWindowClosing


    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        aboutProgram();
    }//GEN-LAST:event_buttonAboutActionPerformed

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
            java.util.logging.Logger.getLogger(RadioPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioPlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        DriverManager.configurationAndNavigate();

        java.awt.EventQueue.invokeLater(() -> {
            new RadioPlayerGUI().setVisible(true);
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonEska;
    private javax.swing.JButton buttonEskaRock;
    private javax.swing.JButton buttonFree;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JButton buttonRMF;
    private javax.swing.JButton buttonRmfMaxx;
    private javax.swing.JButton buttonVox;
    private javax.swing.JButton buttonZet;
    private javax.swing.JButton buttonZetGold;
    private javax.swing.JButton buttonstop;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelClock;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDay;
    private javax.swing.JLabel labelEqualizer;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelRadio;
    // End of variables declaration//GEN-END:variables
}
