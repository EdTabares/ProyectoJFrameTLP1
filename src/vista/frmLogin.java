package vista;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

public class frmLogin extends JFrame {

    JButton btnIngresar;
    JPanel jPanel;
//    Image imagen;

    public frmLogin() {

     //   this.setContentPane(imax);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Parcial 1 Lenguajes de Programación");

        btnIngresar = new JButton("Ingresar");

        jPanel = new JPanel();
        jPanel.setBackground(new java.awt.Color(255, 135, 84));
        jPanel.setBounds(0, 0, 600, 500);
        jPanel.setLayout(null);

        getContentPane().add(jPanel);
        jPanel.add(btnIngresar);
        
        btnIngresar.setBounds(250, 225, 100, 50);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarActionPerformed(e);
            }
        }
        );
        
        JLabel label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/imagenes/iniciales.png")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(225,75,150,121);
        jPanel.add(label);

    } //Fin Constructor

    private void ingresarActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Parcial  Nº 1");
        frmPpal openfrm = new frmPpal();
        this.setEnabled(false);
        this.setVisible(false);
        openfrm.setVisible(true);

    }

//    class Imagen extends JPanel {
//
//        private Image imagen;
//
//        @Override
//        public void paintComponent(Graphics g) {
//
//            imagen = new ImageIcon(getClass().getResource("/imagenes/iniciales.png")).getImage();
//
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            super.paint(g);
//        }
//
//    }
}
