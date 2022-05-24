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
import javax.swing.SwingConstants;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pageManagerMenu extends JPanel {

    private static Container Container;
    

    public pageManagerMenu() {

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
        buttonMainMenu[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageMainMenu();

            }
        });
        buttonMainMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageOrderProduct();
                Container.validate();
                Container.repaint();

            }
        });
        // buttonMainMenu[2].addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         Container.removeAll();
        //         new pageManagerMenu();
        //         Container.validate();
        //         Container.repaint();
        //     }
        // });
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

        // region // ! [ INFOMATION OTHER ] ! \\

        JPanel panelInfomation = new JPanel(null);
        panelInfomation.setBounds(0, 50, 1600, 650);
        panelInfomation.setBackground(new Color(0, 0, 0, 0));

        JLabel labelInfomation = new JLabel("เลือกข้อมูลที่ต้องการจัดการ", SwingConstants.CENTER);
        labelInfomation.setFont(new Font("Tahoma", Font.BOLD, 80));
        labelInfomation.setBounds(100, 100, 1400, 650);
        labelInfomation.setOpaque(true);
        labelInfomation.setBackground(new Color(200, 65, 48));
        labelInfomation.setForeground(Color.WHITE);

        panelInfomation.add(labelInfomation);
        // endregion // ! [ INFOMATION OTHER ] ! \\

        // region // ! [ MENU ] ! \\

        JPanel panelMenu = new JPanel(null);
        panelMenu.setBounds(50, 15, 1500, 80);
        panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        panelMenu.setBackground(Color.BLACK);

        JButton[] buttonMainMenu = new JButton[3];
        for (int i = 0; i < 3; i++) {

            String nameMenu[] = { "จัดสินค้า", "จัดการข้อมูลพนักงาน", "จัดการข้อมูลลูกค้า" };
            buttonMainMenu[i] = new JButton(nameMenu[i]);
            // buttonMainMenu[i].setBackground(new Color(67, 56, 202));
            // buttonMainMenu[i].setBackground(new Color(133, 64, 171));
            buttonMainMenu[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            buttonMainMenu[i].setForeground(Color.white);
            buttonMainMenu[i].setFocusPainted(false);
            buttonMainMenu[i].setBorderPainted(false);
            buttonMainMenu[i].setFocusable(true);
            buttonMainMenu[i].setContentAreaFilled(false);
            buttonMainMenu[i].setOpaque(true);

            panelMenu.add(buttonMainMenu[i]);

        }

        buttonMainMenu[0].setBounds(5,5,500,70);
        buttonMainMenu[1].setBounds(505,5,500,70);
        buttonMainMenu[2].setBounds(995,5,500,70);
        
        buttonMainMenu[0].setBackground(new Color(200, 65, 48));
        buttonMainMenu[2].setBackground(new Color(200, 65, 48));
        buttonMainMenu[1].setBackground(new Color(200, 65, 48));
        
        buttonMainMenu[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerProduct();

            }
        });
        buttonMainMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerEmployee();

            }
        });
        buttonMainMenu[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerCustomer();
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

        // endregion // ! [ MENU ] ! \\


        panelCenter.add(panelMenu);
        panelCenter.add(panelInfomation);
        // panelCenter.add(labelInfomation[8]);


        return panelCenter;

    }

}
