package org.example.hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddDriver extends JFrame implements ActionListener {

    JLabel heading , lblname , lblage, lblbedtype,lbllocation, lblgender ,lblavailable , lblcompany , lblmodel;
    JComboBox bedtypecombo , availablecombo , gendercombo;
    JButton add,cancel;
    JTextField tfname, tfage , tfprice , tfcompany , tfmodel , tflocation;
    AddDriver(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("Add Driver");
        heading.setFont(new Font("Tahoma" , Font.BOLD , 18));
        heading.setBounds(150,20,200,30);
        add(heading);

        lblname = new JLabel("Name ");
        lblname.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblname.setBounds(60,80,150,30);
        add(lblname);


        tfname = new JTextField();
        tfname.setBounds(200, 80,150 , 30);
        add(tfname);

        lblage = new JLabel("Age");
        lblage.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblage.setBounds(60,130,150,30);
        setBounds(330,200,940,470);
        add(lblage);


        tfage = new JTextField();
        tfage.setBounds(200, 130,150 , 30);
        add(tfage);



        lblgender = new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblgender.setBounds(60,180,120,30);
        add(lblgender);

        String genders[] = {"Male" , "Female"};
        gendercombo = new JComboBox(genders);
        gendercombo.setBounds(200,180,150,30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);

        lblcompany = new JLabel("Car Company");
        lblcompany.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblcompany.setBounds(60,230,150,30);
        add(lblcompany);


        tfcompany = new JTextField();
        tfcompany.setBounds(200, 230,150 , 30);
        add(tfcompany);

        lblmodel = new JLabel("Car Model");
        lblmodel.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblmodel.setBounds(60,280,150,30);
        add(lblmodel);


        tfmodel = new JTextField();
        tfmodel.setBounds(200, 280,150 , 30);
        add(tfmodel);

        lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lblavailable.setBounds(60,330,120,30);
        add(lblavailable);

        String availableOptions[] = {"Available" , "Occupied"};
        availablecombo = new JComboBox(availableOptions);
        availablecombo.setBounds(200,330,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);


        lbllocation = new JLabel("Pickup Point");
        lbllocation.setFont(new Font("Tahoma", Font.PLAIN , 16));
        lbllocation.setBounds(60,380,150,30);
        add(lbllocation);


        tflocation = new JTextField();
        tflocation.setBounds(200, 380,150 , 30);
        add(tflocation);


        add = new JButton( "Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,450,130,30);
        add.addActionListener(this);
        add(add);

        cancel = new JButton( "Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,450,130,30);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(AddDriver.class.getResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);


        setBounds(300,200,940,570);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company = tfcompany.getText();
            String  model = tfmodel.getText();
            String availability = (String) availablecombo.getSelectedItem();
            String location = tflocation.getText();
            try{
                Conn conn = new Conn();
                String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+model+"','"+location+"', '"+availability+"')";
                System.out.println(str);
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null , "Driver added successfully");
                tfname.setText("");
                tfcompany.setText("");
                tfmodel.setText("");
                tflocation.setText("");
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
        new AddDriver();
    }
}
