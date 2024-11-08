package org.example.hotel_management_system;

import javax.swing.*;
import java.awt.*;

public class Reception extends JFrame {
    Reception(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JButton newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.white);
        add(newCustomer);

        JButton rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.white);
        add(rooms);


        JButton department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.white);
        add(department);

        JButton allEmployees = new JButton("All Employees");
        allEmployees.setBounds(10,150,200,30);
        allEmployees.setBackground(Color.BLACK);
        allEmployees.setForeground(Color.white);
        add(allEmployees);

        JButton customers = new JButton("Customer Info");
        customers.setBounds(10,190,200,30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.white);
        add(customers);

        JButton managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.white);
        add(managerInfo);

        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.white);
        add(checkout);

        JButton update = new JButton("Update status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.white);
        add(update);


        JButton roomStatus = new JButton("Update Room status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.white);
        add(roomStatus);


        JButton pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.white);
        add(pickup);



        JButton searchRoom = new JButton("Search Rooms");
        searchRoom.setBounds(10,430,200,30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.white);
        add(searchRoom);

        JButton logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.white);
        add(logout);

        ImageIcon i1 = new ImageIcon(Reception.class.getResource("icons/fourth.jpg"));


        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);



        setBounds(350,200,800,570);
        setVisible(true);

    }
    public static void main(String[] args){
        new Reception();
    }
}
