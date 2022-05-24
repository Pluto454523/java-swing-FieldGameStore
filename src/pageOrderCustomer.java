/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/
import java.awt.Container;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;  


public class pageOrderCustomer extends JPanel {

    private static Container Container;
    private int idProduct;

    public pageOrderCustomer(int idProduct) {

        Container = Main.aContainer;
        this.idProduct = idProduct;
        this.setPreferredSize(new Dimension(1820, 980));
        this.add(panelHeader());
        this.add(panelCenter());

        Container.add(this);
        Container.validate();
        Container.repaint();

    }

    private JPanel panelHeader() {

        JPanel panelHeader = new JPanel(null);
        panelHeader.setPreferredSize(new Dimension(1820, 150));

        // region // ! [ BUTTON : EXIT ] ! \\
        JLabel labelTitle = new JLabel("Field Gaming Store", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelTitle.setBounds(510, 10, 800, 120);
        labelTitle.setOpaque(true);
        labelTitle.setBackground(new Color(67, 56, 202));
        labelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        labelTitle.setForeground(Color.WHITE);

        ImageIcon ImageExit = new ImageIcon("img/exit.png");
        JButton btnExit = new JButton(ImageExit);
        btnExit.setBounds(1760, 8, 50, 50);
        btnExit.setFocusPainted(false);
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(true);
        btnExit.setOpaque(true);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selection = JOptionPane.showConfirmDialog(
                        null,
                        "You sure to exit this program",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);

                if (selection == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        // endregion // ! [ BUTTON : EXIT ] ! \\

        panelHeader.add(btnExit);
        panelHeader.add(labelTitle);

        return panelHeader;
    }

    private JPanel panelCenter() {

        JPanel panelCenter = new JPanel(null);
        panelCenter.setPreferredSize(new Dimension(750, 800));
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // region // ! [ INFOMATION Customer ] ! \\

        JPanel panelCustomer = new JPanel();
        panelCustomer.setBounds(75, 25, 600, 625);
        panelCustomer.setBackground(new Color(67, 56, 202));
        panelCustomer.setForeground(Color.white);

        JLabel labelTitleCustomer = new JLabel("กรอกข้อมูลลูกค้า", SwingConstants.CENTER);
        labelTitleCustomer.setForeground(Color.white);
        labelTitleCustomer.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelTitleCustomer.setPreferredSize(new Dimension(500, 100));

        JLabel labelNameCustomer = new JLabel("ชื่อ - นามสกุล", SwingConstants.LEFT);
        labelNameCustomer.setForeground(Color.white);
        labelNameCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNameCustomer.setPreferredSize(new Dimension(400, 50));

        JTextField fieldNameCustomer = new JTextField();
        fieldNameCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldNameCustomer.setPreferredSize(new Dimension(400, 50));
        fieldNameCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldNameCustomer.setEditable(true);

        JLabel labelAddressCustomer = new JLabel("ที่อยู่", SwingConstants.LEFT);
        labelAddressCustomer.setForeground(Color.white);
        labelAddressCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelAddressCustomer.setPreferredSize(new Dimension(400, 50));

        JTextField fieldAddressCustomer = new JTextField();
        fieldAddressCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldAddressCustomer.setPreferredSize(new Dimension(400, 50));
        fieldAddressCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldAddressCustomer.setEditable(true);

        JLabel labelTelephoneCustomer = new JLabel("เบอร์โทรศัพท์", SwingConstants.LEFT);
        labelTelephoneCustomer.setForeground(Color.white);
        labelTelephoneCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelTelephoneCustomer.setPreferredSize(new Dimension(400, 50));

        JTextField fieldTelephoneCustomer = new JTextField();
        fieldTelephoneCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldTelephoneCustomer.setPreferredSize(new Dimension(400, 50));
        fieldTelephoneCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldTelephoneCustomer.setEditable(true);

        JLabel labelEmailCustomer = new JLabel("Email", SwingConstants.LEFT);
        labelEmailCustomer.setForeground(Color.white);
        labelEmailCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelEmailCustomer.setPreferredSize(new Dimension(400, 50));

        JTextField fieldEmailCustomer = new JTextField();
        fieldEmailCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldEmailCustomer.setPreferredSize(new Dimension(400, 50));
        fieldEmailCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldEmailCustomer.setEditable(true);

        panelCustomer.add(labelTitleCustomer);

        panelCustomer.add(labelNameCustomer);
        panelCustomer.add(fieldNameCustomer);

        panelCustomer.add(labelAddressCustomer);
        panelCustomer.add(fieldAddressCustomer);

        panelCustomer.add(labelTelephoneCustomer);
        panelCustomer.add(fieldTelephoneCustomer);

        panelCustomer.add(labelEmailCustomer);
        panelCustomer.add(fieldEmailCustomer);

        // endregion // ! [ INFOMATION Customer ] ! \\

        // region // ! [ BUTTON ] ! \\
        
        JButton btnOK = new JButton("ตกลง");
        btnOK.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnOK.setBounds(175, 660, 200, 70);
        btnOK.setBackground(new Color(102, 255, 102));
        btnOK.setFocusPainted(false);
        btnOK.setBorderPainted(false);
        // btnOK.setContentAreaFilled(false);
        btnOK.setFocusable(true);
        btnOK.setOpaque(true);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!(fieldNameCustomer.getText().toString().isEmpty() 
                || fieldAddressCustomer.getText().toString().isEmpty()
                || fieldEmailCustomer.getText().toString().isEmpty() 
                || fieldTelephoneCustomer.getText().toString().isEmpty())
                ){
                    JLabel labelMessage = new JLabel("ยืนยันการสั่งซื้อสินค้า");
                    labelMessage.setFont(new Font("Tahoma", Font.BOLD, 20));
    
                    String nameCustomer = fieldNameCustomer.getText().toString();
                    String addressCustomer = fieldAddressCustomer.getText().toString();
                    String telephoneCustomer = fieldTelephoneCustomer.getText().toString();
                    String emailCustomer = fieldEmailCustomer.getText().toString();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                    formatter.setTimeZone(TimeZone.getTimeZone("UTC+7"));
                    Date date = new Date();
                    
                    new managerData();
                    managerData.addCustomer(nameCustomer, addressCustomer, telephoneCustomer, emailCustomer);
    
                    Object[] dataProduct = {idProduct, nameCustomer, addressCustomer, telephoneCustomer, emailCustomer, formatter.format(date)};
    
                    int selection = JOptionPane.showConfirmDialog(
                        null,
                        labelMessage,
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);
                    
                    
                    if (selection == JOptionPane.YES_OPTION) {
    
                        Container.removeAll();
                        new pageOrderBill(dataProduct);
                    
                    } else if (selection == JOptionPane.NO_OPTION) {
    
                        Container.removeAll();
                        new pageOrderProduct();
    
                    }   
                } else {
                    JLabel labelMessage = new JLabel("โปรดกรอกข้อมูลไห้ครบ",SwingConstants.CENTER);
                    labelMessage.setFont(new Font("Tahoma", Font.BOLD, 20));

                    JOptionPane.showMessageDialog(
                        null, 
                        labelMessage, 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        JButton btnBack = new JButton("ยกเลิก");
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnBack.setBounds(380, 660, 200, 70);
        btnBack.setBackground(new Color(255, 102, 102));
        btnBack.setFocusPainted(false);
        btnBack.setBorderPainted(false);
        btnBack.setFocusable(true);
        btnBack.setOpaque(true);
        // btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageOrderProduct();

            }
        });
        
        // endregion // ! [ BUTTON ] ! \\

        panelCenter.add(panelCustomer);
        panelCenter.add(btnOK);
        panelCenter.add(btnBack);

        return panelCenter;

    }

}
