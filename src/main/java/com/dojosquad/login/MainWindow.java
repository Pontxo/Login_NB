package com.dojosquad.login;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainWindow {
    
    JFrame frame;
    
    GridBagConstraints constraints;
    
    JPanel pLogin;
    
    JLabel lUsuario;
    JTextField tfUsuario;
    
    JLabel lPassword;
    JPasswordField pfPassword;
    
    JButton bIniciar;
    JButton bCancelar;
        
    public MainWindow()
    {
        inicializarLookAndFeel();
        
        constraints = new GridBagConstraints();
        
        frame = new JFrame("Iniciar sesión");
        frame.setMinimumSize(new Dimension(400,200));
        
        pLogin = new JPanel();
        pLogin.setLayout(new GridBagLayout());
              
        //Inicializando sección de usuario
        lUsuario = new JLabel("Usuario:");
        setConstraints(0, 0, 1, 1, GridBagConstraints.WEST);
        pLogin.add(lUsuario, getConstraints());
        tfUsuario = new JTextField(20);
        setConstraints(1, 0, 2, 1);
        //constraints.insets = new Insets(0,0,10,0);
        pLogin.add(tfUsuario, getConstraints());
        
        //Inicializando sección de password
        lPassword = new JLabel("Contraseña:");
        setConstraints(0, 1, 1, 1, GridBagConstraints.WEST);
        constraints.insets = new Insets(10,0,10,0);
        pLogin.add(lPassword, getConstraints());
        pfPassword = new JPasswordField(20);
        setConstraints(1, 1, 2, 1);
        constraints.insets = new Insets(10,0,10,0);
        pLogin.add(pfPassword, getConstraints());
        
        //Inicializando sección de botones
        bIniciar = new JButton("Iniciar sesión");
        setConstraints(1, 2, 1, 1, GridBagConstraints.WEST);
        pLogin.add(bIniciar, getConstraints());
        bCancelar = new JButton("Cancelar");
        setConstraints(2, 2, 1, 1, GridBagConstraints.CENTER);
        pLogin.add(bCancelar, getConstraints());
        
        frame.add(pLogin);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Método para centrar el frame en la pantalla.
        frame.setLocationRelativeTo(null);
        
        actionListeners();
    }
    
    private void setConstraints(int gridx, int gridy, int gridwidth, int gridheight)
    {
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.insets = new Insets(0, 0, 0, 0);
    }
    
    private void setConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty)
    {
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(0, 0, 0, 0);
    }
    
    private void setConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor)
    {
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.anchor = anchor;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.insets = new Insets(0, 0, 0, 0);
    }
    
    private void setConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor, int fill)
    {
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.anchor = anchor;
        constraints.fill = fill;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.insets = new Insets(0, 0, 0, 0);
    }
    
    private GridBagConstraints getConstraints()
    {
        return constraints;
    }
    
    public boolean validarTextFields()
    {
        if(tfUsuario.getText().isEmpty() && pfPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor, introduce el usuario y contraseña.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(tfUsuario.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor, introduce el usuario.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(pfPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor, introduce la contraseña.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void actionListeners()
    {
        //Eventos de los botones.
        
        bIniciar.addActionListener((ActionEvent e) -> {
            if(validarTextFields())
                JOptionPane.showMessageDialog(null, "Evento para iniciar sesión");
        });
        
        bCancelar.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    
    private LookAndFeel inicializarLookAndFeel() {
        return new LookAndFeel();
    }
}
