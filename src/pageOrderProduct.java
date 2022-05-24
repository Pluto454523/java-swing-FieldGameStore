/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/
import java.awt.Container;
import java.awt.GridLayout;
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
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class pageOrderProduct extends JPanel {

    private JPanel[] panelProductList = new JPanel[6];
    private JLabel[] labelImageProduct = new JLabel[6];
    private JLabel[] labelNameProduct = new JLabel[6];
    private JLabel[] labelPriceProduct = new JLabel[6];
    private JButton[] buttonProduct = new JButton[6];
    private ImageIcon[] imagesProduct = new ImageIcon[6];

    private static String[][] data = managerData.getDataProduct();

    private String[] indexProduct = new String[6];
    private String[] NameProduct = new String[6];
    private String[] priceProduct = new String[6];
    private String[] imagesPath = new String[6];

    private static Container Container;

    public pageOrderProduct() {

        Container = Main.aContainer;
        this.setPreferredSize(new Dimension(1820, 980));
        
        this.add( panelHeader() );
        showPanel();

        Container.add(this);
        Container.validate();
        Container.repaint();

    }

    private JPanel changePageProduct(int numPage) {

        new managerData();
        data = managerData.getDataProduct();
        JPanel panelProduct = new JPanel();

        panelProduct.setPreferredSize(new Dimension(1770, 690));
        panelProduct.setLayout(new GridLayout(2, 4, 5, 5));
        panelProduct.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        for (int i = 0; i < 6; i++) {

            int idProduct = ((numPage - 1) * 6) + i;

            if (idProduct >= data.length) {
                break;
            }

            indexProduct[i] = data[idProduct][0];
            NameProduct[i] = data[idProduct][1];
            priceProduct[i] = data[idProduct][2];
            imagesPath[i] = data[idProduct][3];

            panelProductList[i] = new JPanel();
            panelProductList[i].setBackground(new Color(67, 56, 202));
            panelProductList[i].setLayout(null);
            panelProductList[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

            imagesProduct[i] = new ImageIcon(imagesPath[i]);
            labelImageProduct[i] = new JLabel(imagesProduct[i]);
            labelImageProduct[i].setBounds(15, 20, 200, 300);

            labelNameProduct[i] = new JLabel(String.valueOf("<html>" + NameProduct[i] + "</html>"),
                    SwingConstants.CENTER);
            labelNameProduct[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            labelNameProduct[i].setForeground(Color.WHITE);
            labelNameProduct[i].setBounds(220, 30, 370, 150);

            labelPriceProduct[i] = new JLabel(String.valueOf("Price : " + priceProduct[i]));
            labelPriceProduct[i].setFont(new Font("Tahoma", Font.BOLD, 30));
            labelPriceProduct[i].setForeground(Color.WHITE);
            labelPriceProduct[i].setBounds(300, 200, 400, 50);

            buttonProduct[i] = new JButton("Buy Now");
            buttonProduct[i].setBackground(new Color(201, 48, 44));
            buttonProduct[i].setForeground(Color.WHITE);
            buttonProduct[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            buttonProduct[i].setBounds(315, 250, 150, 50);
            buttonProduct[i].setForeground(Color.WHITE);
            buttonProduct[i].setFocusPainted(false);
            buttonProduct[i].setBorderPainted(false);
            buttonProduct[i].setContentAreaFilled(false);
            buttonProduct[i].setFocusable(true);
            buttonProduct[i].setOpaque(true);
            buttonProduct[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    // buttonProduct[0].setBackground(new Color(201, 48, 44));
                    Main.aContainer.removeAll();
                    new pageOrderCustomer(idProduct);

                }

            });

            panelProductList[i].add(labelImageProduct[i]);
            panelProductList[i].add(labelNameProduct[i]);
            panelProductList[i].add(labelPriceProduct[i]);
            panelProductList[i].add(buttonProduct[i]);

        }

        for (int j = 0; j < 6; j++) {

            int idProduct = ((numPage - 1) * 6) + j;

            if (idProduct < data.length) {

                panelProductList[idProduct % 6].setVisible(true);

            } else {

                panelProductList[j].setVisible(false);

            }

            panelProduct.add(panelProductList[j]);

        }

        return panelProduct;
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
        // buttonMainMenu[1].addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         Container.removeAll();
        //         new pageOrderProduct();
        //         Container.validate();
        //         Container.repaint();

        //     }
        // });
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

    private void showPanel() {

        // region // ! [ CENTER ] ! \\
        JPanel panelCenter = new JPanel();
        panelCenter.setPreferredSize(new Dimension(1820, 690));
        // panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        // panelCenter.setBackground(Color.WHITE);

        panelCenter.add(changePageProduct(1));

        // endregion // ! [ CENTER ] ! \\

        // region // ! [ FOOTER ] ! \\

        JPanel panelFooter = new JPanel();
        // panelFooter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panelFooter.setPreferredSize(new Dimension(1820, 55));

        int maxNumPages = (int) Math.ceil((double) data.length / 6);
        JButton[] changePageButton = new JButton[maxNumPages];

        for (int startNumPages = 0; startNumPages < maxNumPages; startNumPages++) {
            changePageButton[startNumPages] = new JButton("" + (startNumPages + 1));
            changePageButton[startNumPages].setPreferredSize(new Dimension(50, 50));
            changePageButton[startNumPages].setFont(new Font("Tahoma", Font.BOLD, 25));
            changePageButton[startNumPages].setBackground(new Color(77, 60, 235));
            changePageButton[startNumPages].setForeground(Color.WHITE);
            changePageButton[startNumPages].setBorder(BorderFactory.createLineBorder(new Color(67, 56, 202), 3));
            changePageButton[startNumPages].setFocusPainted(false);
            changePageButton[startNumPages].setContentAreaFilled(false);
            changePageButton[startNumPages].setBorderPainted(false);
            changePageButton[startNumPages].setFocusable(true);
            changePageButton[startNumPages].setOpaque(true);
            changePageButton[startNumPages].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    panelCenter.removeAll();

                    for (int j = 0; j < maxNumPages; j++) {
                        if (e.getSource() == changePageButton[j]) {
                            // System.out.println(j+1);
                            panelCenter.add(changePageProduct(j + 1));
                        }
                    }

                    panelCenter.validate();
                    panelCenter.repaint();

                }
            });

            panelFooter.add(changePageButton[startNumPages]);
        }

        // endregion // ! ===================== [ FOOTER ] ===================== ! \\

        // region // ! [ add to PANELMAIN and CONTAINER ] ! \\

        this.add(panelCenter);
        this.add(panelFooter);

        // endregion // ! [ add to PANELMAIN and CONTAINER ] ! \\

    }

}
