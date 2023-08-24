
package com.mycompany.votingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class votepage  extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    int a,b,c,d;
    votepage(){
        ImageIcon i1=new ImageIcon("bjp.jpg");
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(100, 50, 400, 300);
        add(l1);
        
        ImageIcon i4=new ImageIcon("congress.jpg");
        Image i5=i4.getImage().getScaledInstance(310,260,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(950, 60, 400, 300);
        add(l2);
        
          ImageIcon i7=new ImageIcon("jdu.jpg");
        Image i8=i7.getImage().getScaledInstance(250,220,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(950, 450, 400, 300);
        add(l3);
        
        
           ImageIcon i10=new ImageIcon("rss.jpg");
        Image i11=i10.getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel l4=new JLabel(i12);
        l4.setBounds(100, 430, 400, 300);
        add(l4);
        
        b1=new JButton("vote");
        b1.setBounds(250, 350, 100, 50);
        add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("vote");
        b2.setBounds(1090, 350, 100, 50);
        add(b2);
        b2.addActionListener(this);
        
        b3=new JButton("vote");
        b3.setBounds(1090, 730, 100, 50);
        add(b3);
        b3.addActionListener(this);
        
        b4=new JButton("vote");
        b4.setBounds(250, 730, 100, 50);
        add(b4);
        b4.addActionListener(this);
        
       b5=new JButton("result");
       b5.setBounds(680, 440, 100, 50);
       add(b5);
       b5.addActionListener(this);
        
        setBounds(0,0,1600,700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new votepage();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
           a=a+1;
           JOptionPane.showMessageDialog(null,"your vote is added to bjp");
       } 
       if(e.getSource()==b2){
           b=b+1;
           JOptionPane.showMessageDialog(null,"your vote is added to congress");
       } 
         if(e.getSource()==b3){
           c=c+1;
           JOptionPane.showMessageDialog(null,"your vote is added to RSS");
       } 
           if(e.getSource()==b4){
           d=d+1;
           JOptionPane.showMessageDialog(null,"your vote is added to Janta dal unit");
       } 
           
             if(e.getSource()==b5){
           JOptionPane.showMessageDialog(null,"bjp  =  "+a+"      congress  = "+b+" \n" + "RSS = "+c+"      JDU = "+d);
       } 
    }
    
    
}
