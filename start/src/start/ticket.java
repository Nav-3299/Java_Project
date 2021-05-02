/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

class screenticket extends JFrame {
    JPanel screen6;
    JLabel[] labels=new JLabel[10];
    JTextField[] tf=new JTextField[10];
    JButton download;
    String name,fair,passwd;
    
    public void getinfo(String n,String f,String p){
        name=n;
        fair=f;
        passwd=p;
        System.out.println(name+" " +fair+""+passwd);

    }
    public  screenticket()
    {
        
        System.out.println(name+"and " +fair+"and "+passwd);
        screen6=new JPanel();
        screen6.setLayout(null);
       screen6.setBounds(40,150,800,400);
       screen6.setBackground(Color.LIGHT_GRAY);
        add(screen6);
        
        for(int i=1;i<=9;i++)
        {
            labels[i] =new JLabel(" "+i);
             tf[i] = new JTextField(15);
        }
        
        labels[1].setText("DEPOT NO:");
         labels[1].setFont(new Font("Serif", Font.BOLD, 20));
        labels[1].setBounds(75,45,500,30);
        screen6.add(labels[1]);
      
        
         
        tf[1].setBounds(400,45,300,30);
        screen6.add(tf[1]);
          tf[1].setText("Depot-4");
        
         labels[2].setText("TICKET NO:");
         labels[2].setFont(new Font("Serif", Font.BOLD, 20));
        labels[2].setBounds(75,100,500,30);
        screen6.add(labels[2]);
         
        
          tf[2].setBounds(400,100,300,30);
        screen6.add(tf[2]);
            tf[2].setText("TICKET-15312");
        
        labels[6]=new JLabel("Amount");
        labels[6].setForeground(Color.BLUE);
         labels[6].setFont(new Font("Serif", Font.BOLD, 30));
         labels[6].setBounds(300,150,500,30);
         screen6.add(labels[6]);
        
         
         labels[7]=new JLabel("hello ");
        labels[7].setForeground(Color.red);
         labels[7].setFont(new Font("Serif", Font.BOLD, 20));
         labels[7].setBounds(450,150,500,30);
         screen6.add(labels[7]);
         labels[7].setText(String.valueOf(fair));
      
        
          labels[3].setText("ISSUE DATE AND TIME");
           labels[3].setFont(new Font("Serif", Font.BOLD, 20));
        labels[3].setBounds(75,200,500,30);
        screen6.add(labels[3]);
        
          tf[3].setBounds(400,200,300,30);
        screen6.add(tf[3]);
        tf[3].setText("01/05/2021  13:12");
        
          labels[4].setText("NAME:");
          labels[4].setFont(new Font("Serif", Font.BOLD, 20));
        labels[4].setBounds(75,250,500,30);
        screen6.add(labels[4]);
        
          tf[4].setBounds(400,250,300,30);
          tf[4].setText(String.valueOf(name));
        screen6.add(tf[4]);
        
        
          labels[5].setText("SIGNATURE:");
          labels[5].setFont(new Font("Serif", Font.BOLD, 20));
        labels[5].setBounds(75,300,500,30);
        screen6.add(labels[5]);
        
          tf[5].setBounds(400,300,300,30);
        screen6.add(tf[5]);
        
        download = new JButton("UPDATE");
       download.setFont(new Font("Serif", Font.BOLD, 30));
         download.setBounds(300,350,250,30);
         download.setForeground(Color.WHITE);
           download.setBackground(Color.RED);
         screen6.add(download);

 addWindowListener(new WindowAdapter() {
   
        @Override
        public void windowOpened(WindowEvent e) {
             tf[4].setText(String.valueOf(name));
             labels[7].setText(String.valueOf(fair));
             download.setText("DOWNLOAD");
        }


    });
    }//end of constructor
      
   

}//end of class

public class ticket{ 
    public static void main(String[] args) {
          screenticket frame=new screenticket();
         JButton b= new JButton(new ImageIcon("C:\\Users\\Navpreet Kaur\\Documents\\NetBeansProjects\\EGEN\\L1.png"));
        b.setBounds(380,17,120,120);
        b.setBackground(Color.YELLOW);
        frame.add(b);
       frame.setTitle("E-GEN Online Payment Window");
       frame.setBounds(300,150,900,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

      
    }}
