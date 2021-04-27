/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egen;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

class abc extends JFrame implements ActionListener {
    JPanel screen1;
    JButton b1,b2;    
    JLabel l1,l2;
    JTextField tf1,tf2; 
    
    //action handler
    
    
   public abc()
    {
         
        screen1 = new JPanel();
        screen1.setLayout(null);
        screen1.setBounds(40,150,800,400);
        screen1.setBackground(Color.LIGHT_GRAY);
        add(screen1);
        
        
        
        b1= new JButton("LOGIN");
        b1.setFont(new Font("Serif", Font.BOLD, 30));
        b1.setBounds(180,275,155,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.RED);
       screen1.add(b1);
       b1.addActionListener(this);
      
      // b1.addActionListener(this);
       //getContentPane().add(b1);
        //pack();
        
        
        
        b2 = new JButton("SIGNUP");
        b2.setFont(new Font("Serif", Font.BOLD, 30));
        b2.setBounds(380,275,155,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.GREEN);
       screen1.add(b2);
       //b2.addActionListener(this);
        
        
        
        l1= new JLabel("USERNAME :");
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l1.setBounds(75,105,500,30);
        screen1.add(l1);
        tf1= new JTextField(30);
        tf1.setBounds(400,105,300,30);
        screen1.add(tf1);
        
        
        l2= new JLabel("PASSWORD :");
        l2.setFont(new Font("Serif", Font.BOLD, 20));
        l2.setBounds(75,160,500,30);
        screen1.add(l2);
        JPasswordField value = new JPasswordField();
        value.setBounds(400,160,300,30);
        screen1.add(value);
        //tf2= new JTextField(30);
        //tf2.setBounds(400,160,300,30);
        //screen1.add(tf2);
    }
        
    
    
   public void actionPerformed(ActionEvent e) {
 if( e.getSource()==b1){
      this.setVisible(false);
         through frame=new through();
  
         JButton b= new JButton(new ImageIcon("C:\\Users\\Navpreet Kaur\\Documents\\NetBeansProjects\\EGEN\\L1.png"));
        b.setBounds(380,17,120,120);
        b.setBackground(Color.YELLOW);
        frame.add(b);
        
           frame.setTitle("E-GEN");
     frame.setBounds(300,150,900,600);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
   
 }
     
   }  
    }
    
public class first{ 
    public static void main(String[] args) {
        // TODO code application logic here
        //new first();
        abc frame=new abc();
        JButton b;
        //IMAGE
        b= new JButton(new ImageIcon("C:\\Users\\Navpreet Kaur\\Documents\\NetBeansProjects\\EGEN\\L1.png"));
        b.setBounds(380,17,120,120);
        b.setBackground(Color.YELLOW);
        frame.add(b);
        frame.setTitle("E-GEN Online Payment Window");
        frame.setBounds(300,150,900,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
}
    