package com.dojosquad.login;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookAndFeel implements Configuration {

    public LookAndFeel() {
        switch (LOOK_AND_FEEL) {
            case LF_DEFAULT: {
                //Look and Feel comentado por que afecta a los JInternalFrames.
                try {
                    // Set System L&F
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    // handle exception
                    System.out.println("Error cargando Look and Feel");
                    System.out.println("" + e);
                }
            }
            break;

            case LF_NIMBUS: {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                    System.out.println("Error cargando Look and Feel");
                    System.out.println("" + e);
                }
            }
            break;
            case LF_JTATOO: {
            try {
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            break;
            case LF_WEBLAF: {
            try {
                UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            break;            
            case LF_PGS: {
            try {
                UIManager.setLookAndFeel("com.pagosoft.plaf.PgsLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            break;
        }
    }
}
