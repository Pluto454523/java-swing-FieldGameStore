/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class pageSummary extends JPanel {

    private static Container Container;
    private static String[][] dataTable;

    public pageSummary() {

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
        buttonMainMenu[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerMenu();
                Container.validate();
                Container.repaint();
            }
        });
        // buttonMainMenu[3].addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         Container.removeAll();
        //         new pageSummary();
        //         Container.validate();
        //         Container.repaint();
        //     }
        // });

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

    private String[] genDateWeekDay(String[] dateday){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        for (int i = 0; i < 7; i++) {
            calendar.setTime(date);
            calendar.add(Calendar.DATE, -i);
            String newDateinStr = formatter.format(calendar.getTime());
            dateday[i] = newDateinStr;
        }

        return dateday;
    }

    private JPanel panelCenter() {

        JPanel panelCenter = new JPanel(null);
        panelCenter.setPreferredSize(new Dimension(1600, 750));
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JPanel panelSummary = new JPanel();
        panelSummary.setPreferredSize(new Dimension(20, 750));
        panelSummary.setBounds(450, 30, 700, 50);
        panelSummary.setBackground(new Color(220, 20, 60));

        JLabel labelPageSummary = new JLabel("สรุปผลยอดขายรายวัน");
        labelPageSummary.setFont(new Font("Tahoma", Font.BOLD, 30));
        labelPageSummary.setBounds(450, 10, 500, 300);
        labelPageSummary.setForeground(Color.WHITE);

        String[] dateday = new String[7];
        dateday = genDateWeekDay(dateday);
        new managerData();
        dataTable = managerData.getSumaryDataByDate(dateday[0]);
        String[] columNames = { "รายการที่", "ผู้ซื้อ", "ผู้ขาย", "ชื่อสินค้า", "ราคา", "วัน/เดือน/ปี" };
        DefaultTableModel modeltableSummary = new DefaultTableModel(dataTable, columNames) {
            
            @Override
            public boolean isCellEditable(int row, int column){  
                return false;  
            }
    
        };
        
        JComboBox<String> combo = new JComboBox<String>(dateday);
        combo.setFont(new Font("Tahoma", Font.BOLD, 18));
        combo.setBounds(600, 10, 500, 300);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = combo.getSelectedItem().toString();
                new managerData();
                dataTable = managerData.getSumaryDataByDate(s);

                int rowCount = modeltableSummary.getRowCount();
                for (int i = rowCount-1; i >= 0; i--) {


                    modeltableSummary.removeRow(i);
                    
                }

                for (int i = 0; i < dataTable.length; i++) {

                    modeltableSummary.addRow(dataTable[i]);
                }

                
            }
        });

        panelSummary.add(labelPageSummary);
        panelSummary.add(combo);

        JPanel panelTableSummary = new JPanel(null);
        panelTableSummary.setLayout(new FlowLayout());
        panelTableSummary.setBackground(new Color(0, 0, 0, 0));
        panelTableSummary.setBounds(125, 100, 1400, 600);
        // panelTableSummary.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JTable tableSummary = new JTable(modeltableSummary);
        tableSummary.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableSummary.setPreferredScrollableViewportSize(new Dimension(1300, 500));
        tableSummary.setBackground(Color.WHITE);
        tableSummary.setBounds(0, 0, 1300, 2000);
        tableSummary.setFillsViewportHeight(true);
        tableSummary.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableSummary.setRowHeight(30);
        tableSummary.setFocusable(false);
        tableSummary.setShowHorizontalLines(false);
        tableSummary.setSelectionBackground(new Color(250, 190, 200));

        tableSummary.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableSummary.getTableHeader().setReorderingAllowed(false);
        tableSummary.getTableHeader().setForeground(Color.WHITE);
        tableSummary.getTableHeader().setForeground(Color.WHITE);
        tableSummary.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        tableSummary.getTableHeader().setBackground(new Color(220, 20, 60));
        tableSummary.getTableHeader().setReorderingAllowed(false);

        tableSummary.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableSummary.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableSummary.getColumnModel().getColumn(2).setPreferredWidth(110);
        tableSummary.getColumnModel().getColumn(3).setPreferredWidth(150);
        tableSummary.getColumnModel().getColumn(4).setPreferredWidth(100);
        tableSummary.getColumnModel().getColumn(5).setPreferredWidth(100);

        DefaultTableCellRenderer alignTextTable = new DefaultTableCellRenderer();
        alignTextTable.setHorizontalAlignment(JLabel.CENTER);
        tableSummary.getColumnModel().getColumn(0).setCellRenderer(alignTextTable);
        tableSummary.getColumnModel().getColumn(1).setCellRenderer(alignTextTable);
        tableSummary.getColumnModel().getColumn(2).setCellRenderer(alignTextTable);
        tableSummary.getColumnModel().getColumn(3).setCellRenderer(alignTextTable);
        tableSummary.getColumnModel().getColumn(4).setCellRenderer(alignTextTable);
        tableSummary.getColumnModel().getColumn(5).setCellRenderer(alignTextTable);

        JScrollPane scrollPane = new JScrollPane(tableSummary);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        panelTableSummary.add(scrollPane);

        panelCenter.add(panelSummary);
        panelCenter.add(panelTableSummary);

        return panelCenter;

    }

}
