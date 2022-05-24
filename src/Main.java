/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static Container aContainer;

    public Main() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //FULLSCREEN 
        this.setUndecorated(true); //ปิด TAB TITLE
        this.setVisible(true);
        this.setSize(1920, 1080);
        
        aContainer = this.getContentPane();
        aContainer.setLayout(new GridBagLayout());
        aContainer.setBackground(new Color(193, 189, 189));

    }

    public static void main(String[] args) {
        
        new Main();
        new managerData();
        new pageLogin();

    }
    
}
