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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pageMainMenu extends JPanel {

    private static Container Container;
    

    public pageMainMenu() {

        Container = Main.aContainer;
        this.setPreferredSize(new Dimension(1820, 980));
        this.add(panelHeader());
        this.add(panelCenter());

        Container.add(this);
        Container.validate();
        Container.repaint();

    }

    private JPanel panelHeader() {

        JPanel panelHeader = new JPanel(null);
        panelHeader.setPreferredSize(new Dimension(1820, 200));

        // region // ! [ EXIT & LOGOUT & TITLE ] ! \\
        JLabel labelTitle = new JLabel("Field Gaming Store", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelTitle.setBounds(510, 10, 800, 120);
        labelTitle.setOpaque(true);
        labelTitle.setBackground(new Color(67, 56, 202));
        labelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        labelTitle.setForeground(Color.WHITE);

        ImageIcon imagesLogout = new ImageIcon("img/back.png");
        JButton btnLogout = new JButton(imagesLogout);
        btnLogout.setBounds(10, 8, 50, 50);
        btnLogout.setFocusPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setBorderPainted(false);
        btnLogout.setFocusable(true);
        btnLogout.setOpaque(true);
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageLogin();
            }
        });

        JLabel labelLogout = new JLabel("ออกจากระบบ");
        labelLogout.setFont(new Font("Tahoma", Font.BOLD, 25));
        labelLogout.setBounds(70, 5, 300, 60);

        ImageIcon ImageExit = new ImageIcon("img/exit.png");
        JButton btnExit = new JButton(ImageExit);
        btnExit.setBounds(1760, 8, 50, 50);
        btnExit.setFocusPainted(false);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
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
        // endregion // ! [ BUTTON : EXIT & LOGOUT - TITLE ] ! \\

        // region // ! [ MENU ] ! \\

        JPanel panelMenu = new JPanel(null);
        panelMenu.setBounds(500, 140, 820, 60);
        panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));

        JButton[] buttonMainMenu = new JButton[4];
        for (int i = 0; i < 4; i++) {

            String nameMenu[] = { "หน้าแรก", "สั่งซื้อสินค้า", "เมนูหลังบ้าน", "สรุปยอดรายวัน" };
            buttonMainMenu[i] = new JButton(nameMenu[i]);
            buttonMainMenu[i].setBackground(new Color(67, 56, 202));
            buttonMainMenu[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            buttonMainMenu[i].setBounds((200 * i) + 10, 10, 200, 40);
            buttonMainMenu[i].setForeground(Color.white);
            buttonMainMenu[i].setFocusPainted(false);
            buttonMainMenu[i].setContentAreaFilled(false);
            buttonMainMenu[i].setBorderPainted(false);
            buttonMainMenu[i].setFocusable(true);
            buttonMainMenu[i].setOpaque(true);
                
            panelMenu.add(buttonMainMenu[i]);

        }
        // buttonMainMenu[0].addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         Container.removeAll();
        //         new pageMainMenu();

        //     }
        // });
        buttonMainMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageOrderProduct();
                Container.validate();
                Container.repaint();

            }
        });
        buttonMainMenu[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerMenu();
                Container.validate();
                Container.repaint();
            }
        });
        buttonMainMenu[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageSummary();
                Container.validate();
                Container.repaint();
            }
        });

        buttonMainMenu[0].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[1].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[2].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[3].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[3].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[3].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        // endregion // ! [ MENU ] ! \\

        panelHeader.add(btnExit);
        panelHeader.add(btnLogout);
        panelHeader.add(labelLogout);
        panelHeader.add(labelTitle);
        panelHeader.add(panelMenu);

        return panelHeader;
    }

    private JPanel panelCenter() {

        JPanel panelCenter = new JPanel(null);
        panelCenter.setPreferredSize(new Dimension(1600, 750));
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // region // ! [ INFOMATION EMPLOYEE ] ! \\
        new managerData();
        JPanel panelEmployeeInfomation = new JPanel();
        panelEmployeeInfomation.setBounds(40, 75, 600, 600);
        panelEmployeeInfomation.setBackground(new Color(67, 56, 202));
        panelEmployeeInfomation.setForeground(Color.white);

        JLabel labelTitleEmployee = new JLabel("EMPLOYEE ACCOUNT", SwingConstants.CENTER);
        labelTitleEmployee.setForeground(Color.white);
        labelTitleEmployee.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelTitleEmployee.setPreferredSize(new Dimension(500, 200));

        JLabel labelNameEmployee = new JLabel("ชื่อพนักงาน", SwingConstants.LEFT);
        labelNameEmployee.setForeground(Color.white);
        labelNameEmployee.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNameEmployee.setPreferredSize(new Dimension(400, 50));

        JTextField fieldNameEmployee = new JTextField(managerData.getSureNameEmployee());
        fieldNameEmployee.setFont(new Font("Tahoma", Font.BOLD, 20));
        fieldNameEmployee.setPreferredSize(new Dimension(400, 50));
        fieldNameEmployee.setHorizontalAlignment(JTextField.CENTER);
        fieldNameEmployee.setEditable(false);

        panelEmployeeInfomation.add(labelTitleEmployee);
        panelEmployeeInfomation.add(labelNameEmployee);
        panelEmployeeInfomation.add(fieldNameEmployee);

        // endregion // ! [ INFOMATION EMPLOYEE ] ! \\

        // region // ! [ INFOMATION OTHER ] ! \\

        JPanel panelInfomation = new JPanel(null);
        panelInfomation.setBounds(665, 75, 900, 600);
        panelInfomation.setBackground(new Color(0, 0, 0, 0));

        JLabel[] labelInfomation = new JLabel[10];

        ImageIcon imagesCart = new ImageIcon("img/cart.png");
        labelInfomation[0] = new JLabel(" จำนวนสินค้า", SwingConstants.LEFT);
        labelInfomation[0].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[0].setBounds(0, 0, 340, 90);
        labelInfomation[0].setOpaque(true);
        labelInfomation[0].setBackground(new Color(200, 65, 48));
        labelInfomation[0].setForeground(Color.WHITE);
        labelInfomation[0].setIcon(imagesCart);
        // labelInfomation[1].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        labelInfomation[0].setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        labelInfomation[1] = new JLabel(managerData.getProductCount(), SwingConstants.CENTER);
        labelInfomation[1].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[1].setBounds(350, 0, 90, 90);
        labelInfomation[1].setOpaque(true);
        labelInfomation[1].setBackground(Color.WHITE);
        labelInfomation[1].setForeground(Color.BLACK);
        labelInfomation[1].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        ImageIcon imagesCustomer = new ImageIcon("img/user.png");
        labelInfomation[2] = new JLabel(" จำนวนลูกค้า", SwingConstants.LEFT);
        labelInfomation[2].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[2].setBounds(450, 0, 340, 90);
        labelInfomation[2].setOpaque(true);
        labelInfomation[2].setBackground(new Color(133, 64, 171));
        labelInfomation[2].setForeground(Color.WHITE);
        labelInfomation[2].setIcon(imagesCustomer);
        // labelInfomation[3].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        labelInfomation[2].setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        labelInfomation[3] = new JLabel(managerData.getCustomerCount(), SwingConstants.CENTER);
        labelInfomation[3].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[3].setBounds(800, 0, 90, 90);
        labelInfomation[3].setOpaque(true);
        labelInfomation[3].setBackground(Color.WHITE);
        labelInfomation[3].setForeground(Color.BLACK);
        labelInfomation[3].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        ImageIcon imagesEmployee = new ImageIcon("img/employee.png");
        labelInfomation[4] = new JLabel(" จำนวนพนักงาน", SwingConstants.LEFT);
        labelInfomation[4].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[4].setBounds(0, 100, 340, 90);
        labelInfomation[4].setOpaque(true);
        labelInfomation[4].setBackground(new Color(234, 126, 56));
        labelInfomation[4].setForeground(Color.WHITE);
        labelInfomation[4].setIcon(imagesEmployee);
        labelInfomation[4].setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        labelInfomation[5] = new JLabel(managerData.getEmployeeCount(), SwingConstants.CENTER);
        labelInfomation[5].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[5].setBounds(350, 100, 90, 90);
        labelInfomation[5].setOpaque(true);
        labelInfomation[5].setBackground(Color.WHITE);
        labelInfomation[5].setForeground(Color.BLACK);
        labelInfomation[5].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        ImageIcon imagesOrder = new ImageIcon("img/bill.png");
        labelInfomation[6] = new JLabel(" จำนวนคำสั่งซื้อ", SwingConstants.LEFT);
        labelInfomation[6].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[6].setBounds(450, 100, 340, 90);
        labelInfomation[6].setOpaque(true);
        labelInfomation[6].setBackground(new Color(100, 176, 246));
        labelInfomation[6].setForeground(Color.WHITE);
        labelInfomation[6].setIcon(imagesOrder);
        labelInfomation[6].setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        labelInfomation[7] = new JLabel(managerData.getOrderCount(), SwingConstants.CENTER);
        labelInfomation[7].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[7].setBounds(800, 100, 90, 90);
        labelInfomation[7].setOpaque(true);
        labelInfomation[7].setBackground(Color.WHITE);
        labelInfomation[7].setForeground(Color.BLACK);
        labelInfomation[7].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        ImageIcon imagesBanner = new ImageIcon("img/pngegg.png");
        labelInfomation[8] = new JLabel();
        labelInfomation[8].setFont(new Font("Tahoma", Font.BOLD, 32));
        labelInfomation[8].setBounds(650, 250, 900, 900);
        labelInfomation[8].setOpaque(true);
        labelInfomation[8].setBackground(new Color(0, 0, 0, 0));
        labelInfomation[8].setForeground(Color.WHITE);
        labelInfomation[8].setIcon(imagesBanner);

        panelInfomation.add(labelInfomation[0]);
        panelInfomation.add(labelInfomation[1]);
        panelInfomation.add(labelInfomation[2]);
        panelInfomation.add(labelInfomation[3]);
        panelInfomation.add(labelInfomation[4]);
        panelInfomation.add(labelInfomation[5]);
        panelInfomation.add(labelInfomation[6]);
        panelInfomation.add(labelInfomation[7]);
        // endregion // ! [ INFOMATION OTHER ] ! \\

        panelCenter.add(panelEmployeeInfomation);
        panelCenter.add(panelInfomation);
        panelCenter.add(labelInfomation[8]);


        return panelCenter;

    }

}
