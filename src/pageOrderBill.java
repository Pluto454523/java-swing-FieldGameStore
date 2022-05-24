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
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pageOrderBill extends JPanel {

    private static Container Container;
    private Object[] dataOrder;

    public pageOrderBill(Object[] data) {

        Container = Main.aContainer;
        this.dataOrder = data;
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
        panelCenter.setPreferredSize(new Dimension(1056, 766));
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // region   // ! [ INFOMATION CUSTOMER ] ! \\

        JPanel panelCustomer = new JPanel(null);
        panelCustomer.setBounds(50, 50, 606, 206);
        panelCustomer.setBackground(new Color(67, 56, 202));
        panelCustomer.setForeground(Color.white);
        panelCustomer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel labelTitleCustomer = new JLabel("ข้อมูลลูกค้า", SwingConstants.CENTER);
        labelTitleCustomer.setForeground(Color.white);
        labelTitleCustomer.setFont(new Font("Tahoma", Font.BOLD, 30));
        labelTitleCustomer.setBounds(200, 0, 200, 50);

        JLabel labelNameCustomer = new JLabel("ชื่อ - นามสกุล", SwingConstants.LEFT);
        labelNameCustomer.setForeground(Color.white);
        labelNameCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNameCustomer.setBounds(40, 50, 150, 30);

        JTextField fieldNameCustomer = new JTextField( dataOrder[1].toString() , SwingConstants.LEFT);
        fieldNameCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        fieldNameCustomer.setBounds(40,80, 200, 30);
        fieldNameCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldNameCustomer.setEditable(false);

        JLabel labelAddressCustomer = new JLabel("ที่อยู่", SwingConstants.LEFT);
        labelAddressCustomer.setForeground(Color.white);
        labelAddressCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelAddressCustomer.setBounds(260,50, 150, 30);

        JTextField fieldAddressCustomer = new JTextField( dataOrder[2].toString() , SwingConstants.LEFT);
        fieldAddressCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        fieldAddressCustomer.setBounds(260,80, 300, 30);
        fieldAddressCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldAddressCustomer.setEditable(false);

        JLabel labelTelephoneCustomer = new JLabel("เบอร์โทรศัพท์", SwingConstants.LEFT);
        labelTelephoneCustomer.setForeground(Color.white);
        labelTelephoneCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelTelephoneCustomer.setBounds(40,120, 150, 30);

        JTextField fieldTelephoneCustomer = new JTextField(dataOrder[3].toString(), SwingConstants.LEFT);
        fieldTelephoneCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        fieldTelephoneCustomer.setBounds(40,150, 200, 30);
        fieldTelephoneCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldTelephoneCustomer.setEditable(false);

        JLabel labelEmailCustomer = new JLabel("E-mail", SwingConstants.LEFT);
        labelEmailCustomer.setForeground(Color.white);
        labelEmailCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelEmailCustomer.setBounds(260,120, 150, 30);

        JTextField fieldEmailCustomer = new JTextField(dataOrder[4].toString(), SwingConstants.LEFT);
        fieldEmailCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        fieldEmailCustomer.setBounds(260,150, 200, 30);
        fieldEmailCustomer.setHorizontalAlignment(JTextField.CENTER);
        fieldEmailCustomer.setEditable(false);

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

        //region    // ! [ INFOMATION EMPLOYEE ] ! \\

        JPanel panelEmployee = new JPanel(null);
        panelEmployee.setBounds(700, 50, 306, 206);
        panelEmployee.setBackground(new Color(67, 56, 202));
        panelEmployee.setForeground(Color.white);
        panelEmployee.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel labelTitleEmployee = new JLabel("ข้อมูลพนักงาน", SwingConstants.CENTER);
        labelTitleEmployee.setForeground(Color.white);
        labelTitleEmployee.setFont(new Font("Tahoma", Font.BOLD, 30));
        labelTitleEmployee.setBounds(50, 0, 200, 50);

        JLabel labelNameEmployee = new JLabel("ชื่อ - นามสกุล", SwingConstants.LEFT);
        labelNameEmployee.setForeground(Color.white);
        labelNameEmployee.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNameEmployee.setBounds(40, 50, 150, 30);

        JTextField fieldNameEmployee = new JTextField( managerData.getSureNameEmployee() , SwingConstants.LEFT);
        fieldNameEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
        fieldNameEmployee.setBounds(40,80, 220, 30);
        fieldNameEmployee.setHorizontalAlignment(JTextField.CENTER);
        fieldNameEmployee.setEditable(false);

        panelEmployee.add(labelTitleEmployee);

        panelEmployee.add(labelNameEmployee);
        panelEmployee.add(fieldNameEmployee);

        //endregion    // ! [ INFOMATION EMPLOYEE ] ! \\

        //region    // ! [ TABLE PRODUCT ] ! \\
        JPanel panelTableProduct = new JPanel(null);
        panelTableProduct.setLayout(new FlowLayout());
        panelTableProduct.setBackground(new Color(0, 0, 0, 0));
        panelTableProduct.setBounds(50, 260, 956, 356);
        panelTableProduct.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        new managerData();
        String[][] dataProduct = managerData.getDataProduct();

        int idProduct = Integer.parseInt(dataOrder[0].toString());
        String nameProduct = dataProduct[idProduct][1].toString();
        String priceProduct = dataProduct[idProduct][2].toString();
        String dateBuy = dataOrder[5].toString();
        String nameCustomer = dataOrder[1].toString();
        String nameEmployee = managerData.getSureNameEmployee();

        String[] columnNames = { "วัน/เดือน/ปี", "รายการสินค้า", "ราคา" };
        String[][] dataListProduct = { {dateBuy, nameProduct, priceProduct} }; 
        
        managerData.addOrderHistoryData(nameCustomer, nameEmployee, nameProduct, priceProduct, dateBuy);

        DefaultTableModel modelTableProduct = new DefaultTableModel(dataListProduct, columnNames) {
            
            @Override
            public boolean isCellEditable(int row, int column){  
                return false;  
            }

        };
    
        JTable TableProduct = new JTable(modelTableProduct);
        TableProduct.setFont(new Font("Tahoma", Font.PLAIN, 16));
        TableProduct.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        TableProduct.setPreferredScrollableViewportSize(new Dimension(940, 310));
        TableProduct.setBackground(Color.WHITE);
        TableProduct.setBounds(0, 0, 950, 310);
        TableProduct.setFillsViewportHeight(true);
        TableProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        TableProduct.getTableHeader().setReorderingAllowed(false);
        TableProduct.setRowHeight(30);

        TableColumnModel columnModel = TableProduct.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(350);
        columnModel.getColumn(2).setPreferredWidth(130);

        DefaultTableCellRenderer alignTextTable = new DefaultTableCellRenderer();
        alignTextTable.setHorizontalAlignment(JLabel.CENTER);
        TableProduct.getColumnModel().getColumn(0).setCellRenderer(alignTextTable);
        TableProduct.getColumnModel().getColumn(1).setCellRenderer(alignTextTable);
        TableProduct.getColumnModel().getColumn(2).setCellRenderer(alignTextTable);

        JScrollPane scrollPane = new JScrollPane(TableProduct);

        panelTableProduct.add(scrollPane);

        //endregion // ! [ TABLE PRODUCT ] ! \\

        //region // ! [ BUTTON HOME ] ! \\

        JLabel labelHome = new JLabel("กลับหน้าหลัก", SwingConstants.CENTER);
        labelHome.setFont(new Font("Tahoma", Font.BOLD, 25));
        labelHome.setBounds(375, 680, 300, 60);

        ImageIcon imagesHome = new ImageIcon("img/home.png");
        JButton btnHome = new JButton(imagesHome);
        btnHome.setBounds(493, 630, 64, 64);
        btnHome.setBackground(Color.WHITE);
        btnHome.setFocusPainted(false);
        btnHome.setBorderPainted(false);
        btnHome.setFocusable(true);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageMainMenu();
            }
        });

        //endregion // ! [ BUTTON HOME ] ! \\
        
        panelCenter.add(btnHome);
        panelCenter.add(labelHome);
        panelCenter.add(panelCustomer);
        panelCenter.add(panelEmployee);
        panelCenter.add(panelTableProduct);

        return panelCenter;

    }

}
