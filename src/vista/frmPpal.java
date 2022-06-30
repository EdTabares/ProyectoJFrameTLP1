package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.*;
//import sun.util.calendar.JulianCalendar;

public class frmPpal extends JFrame {

    private JButton btnNew;
    private JButton btnSearch;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnClose;
    private JLabel lblNameClient;
    private JLabel lblId;
    private JLabel lblAddress;
    private JLabel lblPhone;
    private JLabel lblBirthDate;
    private JLabel lblIdSale;
    private JLabel lblDate;
    private JLabel lblIva;
    private JLabel lblTotal;
    private JLabel lblSubtotal;
    private JTextField txtIdSale;
    private JTextField txtDate;
    private JTextField txtIva;
    private JTextField txtSubtotal;
    private JTextField txtTotal;
    private JTextField txtNameClient;
    private JTextField txtId;
    private JTextField txtAddress;
    private JTextField txtPhone;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JTable tableProducts;
    private JCalendar txtBirthDate;

    public frmPpal() {
        setSize(1100, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Parcial 1 Lenguajes de Programación");

        btnNew = new JButton("New");
        btnSearch = new JButton("Search");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClose = new JButton("Close");
        lblNameClient = new JLabel("Name Client");
        lblId = new JLabel("ID Number");
        lblAddress = new JLabel("Address");
        lblPhone = new JLabel("Phone");
        lblBirthDate = new JLabel("Birth Date");
        lblIdSale = new JLabel("ID Sale");
        lblDate = new JLabel("Date");
        lblIva = new JLabel("IVA");
        lblSubtotal = new JLabel("Subtotal");
        lblTotal = new JLabel("Total");
        txtIdSale = new JTextField();
        txtDate = new JTextField();
        txtIva = new JTextField();
        txtSubtotal = new JTextField();
        txtTotal = new JTextField();
        txtNameClient = new JTextField();
        txtId = new JTextField();
        txtAddress = new JTextField();
        txtPhone = new JTextField();
        tableProducts = new JTable(rowData, columnsName);
        //add(new JScrollPane(tableProducts), BorderLayout.CENTER); 
        txtBirthDate = new JCalendar();

        jPanel1 = new JPanel();
        jPanel1.setBackground(new java.awt.Color(241, 75, 18));
        jPanel1.setBounds(20, 20, 510, 640);
        jPanel1.setLayout(null);
        jPanel2 = new JPanel();
        jPanel2.setBackground(new java.awt.Color(241, 75, 18));
        jPanel2.setBounds(570, 20, 510, 125);
        jPanel2.setLayout(null);
        jPanel3 = new JPanel();
        jPanel3.setBackground(new java.awt.Color(241, 75, 18));
        jPanel3.setBounds(570, 165, 510, 425);
        jPanel3.setLayout(null);
        jPanel4 = new JPanel();
        jPanel4.setBackground(new java.awt.Color(240, 240, 240));
        jPanel4.setBounds(570, 600, 510, 70);
        jPanel4.setLayout(null);

        lblNameClient.setForeground(Color.BLACK);
        lblNameClient.setFont(new java.awt.Font("Arial", 2, 24));
        lblId.setForeground(Color.BLACK);
        lblId.setFont(new java.awt.Font("Arial", 2, 24));
        lblAddress.setForeground(Color.BLACK);
        lblAddress.setFont(new java.awt.Font("Arial", 2, 24));
        lblPhone.setForeground(Color.BLACK);
        lblPhone.setFont(new java.awt.Font("Arial", 2, 24));
        lblBirthDate.setForeground(Color.BLACK);
        lblBirthDate.setFont(new java.awt.Font("Arial", 2, 24));
        lblIdSale.setForeground(Color.BLACK);
        lblIdSale.setFont(new java.awt.Font("Arial", 2, 24));
        lblDate.setForeground(Color.BLACK);
        lblDate.setFont(new java.awt.Font("Arial", 2, 24));
        lblIva.setForeground(Color.BLACK);
        lblIva.setFont(new java.awt.Font("Arial", 2, 18));
        lblSubtotal.setForeground(Color.BLACK);
        lblSubtotal.setFont(new java.awt.Font("Arial", 2, 18));
        lblTotal.setForeground(Color.BLACK);
        lblTotal.setFont(new java.awt.Font("Arial", 2, 18));

        txtIdSale.setForeground(Color.DARK_GRAY);
        txtIdSale.setBackground(Color.WHITE);
        txtIdSale.setFont(new java.awt.Font("Arial", 2, 24));
        txtDate.setForeground(Color.DARK_GRAY);
        txtDate.setBackground(Color.WHITE);
        txtDate.setFont(new java.awt.Font("Arial", 2, 24));
        txtIva.setForeground(Color.BLACK);
        txtIva.setBackground(Color.WHITE);
        txtIva.setFont(new java.awt.Font("Arial", 0, 14));
        txtSubtotal.setForeground(Color.BLACK);
        txtSubtotal.setBackground(Color.WHITE);
        txtSubtotal.setFont(new java.awt.Font("Arial", 0, 14));
        txtTotal.setForeground(Color.BLACK);
        txtTotal.setBackground(Color.WHITE);
        txtTotal.setFont(new java.awt.Font("Arial", 1, 14));
        txtNameClient.setForeground(Color.DARK_GRAY);
        txtNameClient.setBackground(Color.WHITE);
        txtNameClient.setFont(new java.awt.Font("Arial", 2, 24));
        txtId.setForeground(Color.DARK_GRAY);
        txtId.setBackground(Color.WHITE);
        txtId.setFont(new java.awt.Font("Arial", 2, 24));
        txtAddress.setForeground(Color.DARK_GRAY);
        txtAddress.setBackground(Color.WHITE);
        txtAddress.setFont(new java.awt.Font("Arial", 2, 24));
        txtPhone.setForeground(Color.DARK_GRAY);
        txtPhone.setBackground(Color.WHITE);
        txtPhone.setFont(new java.awt.Font("Arial", 2, 24));
        txtBirthDate.setBounds(235, 151, 250, 220);
        txtBirthDate.setWeekOfYearVisible(false);
        txtBirthDate.setMaxDayCharacters(1);
       
        
        getContentPane().add(jPanel1);
        getContentPane().add(jPanel2);
        getContentPane().add(jPanel3);
        getContentPane().add(jPanel4);

        jPanel1.add(lblIdSale);
        jPanel1.add(lblDate);
        jPanel1.add(lblIva);
        jPanel1.add(lblSubtotal);
        jPanel1.add(lblTotal);
        jPanel1.add(txtIdSale);
        jPanel1.add(txtDate);
        jPanel1.add(tableProducts);
        jPanel1.add(txtIva);
        jPanel1.add(txtSubtotal);
        jPanel1.add(txtTotal);
        jPanel2.add(btnNew);
        jPanel2.add(btnSearch);
        jPanel2.add(btnUpdate);
        jPanel2.add(btnDelete);
        jPanel3.add(lblNameClient);
        jPanel3.add(lblId);
        jPanel3.add(lblAddress);
        jPanel3.add(lblPhone);
        jPanel3.add(txtNameClient);
        jPanel3.add(txtId);
        jPanel3.add(txtAddress);
        jPanel3.add(txtPhone);
        jPanel3.add(txtBirthDate);
        jPanel4.add(btnClose);

        //Panel 1
        lblIdSale.setBounds(80, 20, 100, 30);
        txtIdSale.setBounds(20, 60, 200, 40);
        lblDate.setBounds(325, 20, 100, 30);
        txtDate.setBounds(255, 60, 200, 40);
        tableProducts.setBounds(20, 120, 470, 400);
        lblSubtotal.setBounds(255, 530, 100, 15);
        txtSubtotal.setBounds(365, 530, 100, 15);
        lblIva.setBounds(255, 550, 100, 15);
        txtIva.setBounds(365, 550, 100, 15);
        lblTotal.setBounds(255, 570, 100, 15);
        txtTotal.setBounds(365, 570, 100, 15);
        txtSubtotal.setText("$38.000");
        txtIva.setText("$7.220");
        txtTotal.setText("$45.220");
        //Panel 2
        btnNew.setBounds(22, 17, 100, 90);
        btnSearch.setBounds(144, 17, 100, 90);
        btnUpdate.setBounds(266, 17, 100, 90);
        btnDelete.setBounds(388, 17, 100, 90);
        //Panel 3
        lblNameClient.setBounds(20, 20, 150, 30);
        txtNameClient.setBounds(20, 50, 180, 40);
        lblId.setBounds(20, 120, 150, 30);
        txtId.setBounds(20, 150, 180, 40);
        lblAddress.setBounds(20, 220, 100, 30);
        txtAddress.setBounds(20, 250, 180, 40);
        lblPhone.setBounds(20, 320, 100, 30);
        txtPhone.setBounds(20, 350, 180, 40);
        //Panel 4
        btnClose.setBounds(382, 15, 100, 40);

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salirActionPerformed(e);
            }
        });

        JLabel label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/imagenes/iniciales.png")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(290, 20, 140, 111);
        jPanel3.add(label);
    }

    private void salirActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private String[] columnsName = {"ID Product", "Description", "Quantity", "Price"};
    private String[][] rowData = {
        {"ID PRODUCT", "DESCRIPTION", "QUANTITY", "PRICE"},
        {"", "", "", ""},
        {"1020", "Coffe", "1", "$5.000"},
        {"1030", "Sugar", "2", "$8.000"},
        {"1050", "Rice", "1", "$5.000"},
        {"1080", "CandyBoom", "10", "$500"},
        {"1090", "Bread", "3", "$1.000"},
        {"2080", "Soap", "2", "$2.000"},};

}
