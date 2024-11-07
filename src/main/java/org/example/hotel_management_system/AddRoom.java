package org.example.hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

    JLabel heading , lblroomno , lblavailable, lblbedtype,lblprice, lblclean;
    JComboBox bedtypecombo , availablecombo , cleaningstatuscombo;
    JButton add,cancel;
    JTextField tfroom, tfprice;
    AddRoom(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("Add Rooms");
        heading.setFont(new Font("Tahoma" , Font.BOLD , 18));
        heading.setBounds(150,20,200,30);
        add(heading);

        lblroomno = new JLabel("Room Number");
        lblroomno.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblroomno.setBounds(60,80,150,30);
        add(lblroomno);


        tfroom = new JTextField();
        tfroom.setBounds(200, 80,150 , 30);
        add(tfroom);

        lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblavailable.setBounds(60,130,120,30);
        add(lblavailable);

        String availableOptions[] = {"Available" , "Occupied"};
        availablecombo = new JComboBox(availableOptions);
        availablecombo.setBounds(200,130,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);

        lblclean = new JLabel("Cleaning Status");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblclean.setBounds(60,180,120,30);
        add(lblclean);

        String cleaningStatusOptions[] = {"Cleaned" , "Not Cleaned"};
        cleaningstatuscombo = new JComboBox(cleaningStatusOptions);
        cleaningstatuscombo.setBounds(200,180,150,30);
        cleaningstatuscombo.setBackground(Color.WHITE);
        add(cleaningstatuscombo);

        lblprice = new JLabel("Price");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblprice.setBounds(60,230,150,30);
        setBounds(330,200,940,470);
        add(lblprice);


        tfprice = new JTextField();
        tfprice.setBounds(200, 230,150 , 30);
        add(tfprice);

        lblbedtype = new JLabel("Bed Type");
        lblbedtype.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblbedtype.setBounds(60,280,120,30);
        add(lblbedtype);

        String bedTypeOptions[] = {"Single" , "Double"};
        bedtypecombo = new JComboBox(bedTypeOptions);
        bedtypecombo.setBounds(200,280,150,30);
        bedtypecombo.setBackground(Color.WHITE);
        add(bedtypecombo);

        add = new JButton( "Add Room");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,350,130,30);
        add.addActionListener(this);
        add(add);

        cancel = new JButton( "Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,350,130,30);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(AddRoom.class.getResource("icons/twelve.jpg"));
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(400,30,500,300);
        add(image);


        setBounds(330,200,940,470);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String roomnumber = tfroom.getText();
            String availability = (String) availablecombo.getSelectedItem();
            String cleaningstatus = (String) cleaningstatuscombo.getSelectedItem();
            String bedtype = (String) bedtypecombo.getSelectedItem();
            String price = tfprice.getText();
            try{
                Conn conn = new Conn();
                String str = "insert into room values('"+roomnumber+"','"+availability+"','"+cleaningstatus+"','"+price+"','"+bedtype+"')";
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null , "New Room added successfully");
                tfroom.setText("");
                tfprice.setText("");
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
        else{
            setVisible(false);
        }

    }

    public static void main(String[] args){
        new AddRoom();
    }
}
