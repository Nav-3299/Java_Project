/*
 Showing the ticket to the customer
 */
package egen;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;

class screenticket extends JFrame{
    JPanel screen6;
    JLabel[] labels=new JLabel[10];
    JTextField[] tf=new JTextField[10];
    JButton download;
    
    screenticket()
    {
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
        
         labels[2].setText("TICKET NO:");
         labels[2].setFont(new Font("Serif", Font.BOLD, 20));
        labels[2].setBounds(75,100,500,30);
        screen6.add(labels[2]);
        
          tf[2].setBounds(400,100,300,30);
        screen6.add(tf[2]);
        
        labels[6]=new JLabel("Amount");
        labels[6].setForeground(Color.BLUE);
         labels[6].setFont(new Font("Serif", Font.BOLD, 30));
         labels[6].setBounds(300,150,500,30);
         screen6.add(labels[6]);
        
        
          labels[3].setText("ISSUE DATE AND TIME");
           labels[3].setFont(new Font("Serif", Font.BOLD, 20));
        labels[3].setBounds(75,200,500,30);
        screen6.add(labels[3]);
        
          tf[3].setBounds(400,200,300,30);
        screen6.add(tf[3]);
        
          labels[4].setText("NAME:");
          labels[4].setFont(new Font("Serif", Font.BOLD, 20));
        labels[4].setBounds(75,250,500,30);
        screen6.add(labels[4]);
        
          tf[4].setBounds(400,250,300,30);
        screen6.add(tf[4]);
        
          labels[5].setText("SIGNATURE:");
          labels[5].setFont(new Font("Serif", Font.BOLD, 20));
        labels[5].setBounds(75,300,500,30);
        screen6.add(labels[5]);
        
          tf[5].setBounds(400,300,300,30);
        screen6.add(tf[5]);
        
        download = new JButton("DOWNLOAD");
       download.setFont(new Font("Serif", Font.BOLD, 30));
         download.setBounds(300,350,250,30);
         download.setForeground(Color.WHITE);
           download.setBackground(Color.RED);
         screen6.add(download);
        

        
    }//end of constructor
}//end of class

