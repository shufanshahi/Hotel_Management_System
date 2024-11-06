package org.example.hotel_management_system;


import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame {

    DashBoard(){
        setBounds(0,0,1550,1000);

        setLayout(null);

        ImageIcon i1 = new ImageIcon(DashBoard.class.getResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);

        JLabel text = new JLabel("The Continatal");
        text.setBounds(620,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        image.add(text);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);

        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        hotel.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addemployee = new JMenuItem(("ADD EMPLOYEE"));
        admin.add(addemployee);

        JMenuItem addrooms = new JMenuItem(("ADD ROOMS"));
        admin.add(addrooms);

        JMenuItem adddrivers = new JMenuItem(("ADD DRIVERS"));
        admin.add(adddrivers);

        setVisible(true);
    }

    public static void main(String[] args){
        new DashBoard();
    }
}
