
package com.mycompany.votingsystem;
import java.awt.*;
import javax.swing.*;
public class VotingSystem extends JFrame{
    VotingSystem(){
        setBounds(0,0,1600,700);
        getContentPane().setBackground(Color.white);
        
        JLabel l1=new JLabel("Welcome to");
        l1.setFont(new Font("Tahoma",Font.BOLD,50));
        l1.setBounds(300, 230, 300, 100);
        add(l1);
        
          JLabel l2=new JLabel("online voting system");
        l2.setFont(new Font("Tahoma",Font.BOLD,50));
        l2.setBounds(200, 300, 700, 100);
        add(l2);    
        
        ImageIcon i1=new ImageIcon("vote.jpg");
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(900,300,500,300);
        add(l3);
        
        JButton b1=new JButton("Next");
        b1.setFont(new Font("Tahoma",Font.BOLD,20));
        b1.setBounds(350,500,200,50);
        add(b1);
        
        setLayout(null);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new VotingSystem();
    }
}
