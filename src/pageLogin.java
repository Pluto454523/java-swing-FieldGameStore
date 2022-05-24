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
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pageLogin extends JPanel {

    private static Container Container;

    public pageLogin() {

        Container = Main.aContainer;

        this.setPreferredSize(new Dimension(1820, 980));
        this.add( panelHeader() );
        this.add( panelCenter() );

        Container.add(this);
        Container.validate();
        Container.repaint();

    }

    private JPanel panelHeader() {

        JPanel panelHeader = new JPanel(null);
        panelHeader.setPreferredSize(new Dimension(1820, 200));
        panelHeader.setBackground( new Color(1f,0f,0f,.0f ) );
        
        ImageIcon ImageExit = new ImageIcon("img/exit.png");
        JButton btnExit = new JButton(ImageExit);
        btnExit.setContentAreaFilled(false);
        btnExit.setBounds(1760,8,50,50);
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

        panelHeader.add(btnExit);


        return panelHeader;
    }

    private JPanel panelCenter() {
        
        JPanel panelCenter = new JPanel();
        panelCenter.setPreferredSize(new Dimension(1820, 770));
        panelCenter.setBackground( new Color(1f,0f,0f,.0f ) );

        JPanel panelLogin;
        JLabel titlePage,titleUsername;
        JTextField inputUsername;
        JButton btnLogin;

        panelLogin = new JPanel();
        panelLogin.setPreferredSize(new Dimension(600, 600));
        panelLogin.setBackground(new Color(67, 56, 202));
        panelLogin.setForeground(Color.white);
        // panelLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));

        titlePage = new JLabel("LOGIN EMPLOYEE", SwingConstants.CENTER);
        titlePage.setForeground(Color.white);
        titlePage.setFont(new Font("Tahoma", Font.BOLD, 40));
        titlePage.setPreferredSize(new Dimension(500, 200));

        titleUsername = new JLabel("USERNAME", SwingConstants.LEFT);
        titleUsername.setForeground(Color.white);
        titleUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
        titleUsername.setPreferredSize(new Dimension(400, 50));

        inputUsername = new JTextField();
        inputUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
        inputUsername.setPreferredSize(new Dimension(400, 50));
        inputUsername.setHorizontalAlignment(JTextField.CENTER);

        btnLogin = new JButton("LOGIN");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnLogin.setPreferredSize(new Dimension(200, 70));
        btnLogin.setBackground(new Color(71, 255, 42));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusable(true);
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                btnLogin.setBackground(new Color(40, 167, 69));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                btnLogin.setBackground(new Color(71, 255, 42));
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
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ImageIcon successIcon = new ImageIcon("img/success.png");
                ImageIcon errorIcon = new ImageIcon("img/error.png");
                String username = inputUsername.getText().toString();
                new managerData();
                managerData.setUsernameEmployee( username );

                if (username.isEmpty()) {
            
                    JOptionPane.showMessageDialog(
                        Container,
                        "Please enter username",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE,
                        errorIcon
                    );
        
                } else {
        
        
                    if ( managerData.checkLogin() ) {
    
                        JOptionPane.showMessageDialog(
                            Container, 
                            "Login Success", 
                            "Success Message",
                            JOptionPane.PLAIN_MESSAGE,
                            successIcon
                        );
                        
                        Container.removeAll();
                        new pageMainMenu();
            
                    }  else {
    
                        JOptionPane.showMessageDialog(
                            Container,
                            "Username \"" + username.toString() + "\" not found",
                            "Error Message",
                            JOptionPane.ERROR_MESSAGE,
                            errorIcon
                        );
                    
                    }
        
                }


            }
        });

        panelLogin.add(titlePage);
        panelLogin.add(titleUsername);
        panelLogin.add(inputUsername);
        panelLogin.add(btnLogin);

        panelCenter.add(panelLogin);
        
        return panelCenter;
    }

}
