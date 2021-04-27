/*
 Interface to pay the money
 */
package egen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class screen extends JFrame implements ItemListener {
    JPanel screen5;
//    JPanel screen4_heading;
    JLabel Source;
    JLabel Destination;
   JLabel Amount;
    JButton ComputeFee;
    JToggleButton Pay;
    JComboBox sourcelist;
    JComboBox destinationlist;
    
    screen()
    {
        String sd[]={"Zirakpur","Sector 14","Sector 11","Sector 1","Rock Garden","Rose Garden",
            "Sukhna lake","Mohali","Panchkula"};
       screen5=new JPanel();
       screen5.setLayout(null);
       screen5.setBounds(40,150,800,400);
       screen5.setBackground(Color.LIGHT_GRAY);
        add(screen5);
      
       
      Source=new JLabel("SOURCE");
      screen5.add(Source);
      Source.setFont(new Font("Serif", Font.BOLD, 20));
      Source.setBounds(75,35,500,30);
      
      
        Destination=new JLabel("DESTINATION");
         screen5.add(Destination);
          Destination.setFont(new Font("Serif", Font.BOLD, 20));
           Destination.setBounds(75,80,500,30);
           
           ComputeFee=new JButton("Compute Fee");
           screen5.add(ComputeFee);
       ComputeFee.setBounds(300,200,150,30);
     
           
    Amount= new JLabel("Amount");
      Amount.setFont(new Font("Serif", Font.BOLD, 20));
       Amount.setForeground(Color.blue);
     screen5.add(Amount);
    Amount.setBounds(300,250,150,30);
    
    Pay = new JToggleButton("PAY");
    screen5.add(Pay);
       Pay.setBounds(300,300,150,30);
        Pay.addItemListener(this);  
    
    sourcelist=new  JComboBox(sd);
         screen5.add(sourcelist);
             sourcelist.setBounds(500,35,200,30);
             
        destinationlist=new JComboBox(sd);
        screen5.add(destinationlist);
        destinationlist.setBounds(500,80,200,30);
        
        
    }//end of screen constructor
     public void itemStateChanged(ItemEvent eve) {  
        if (Pay.isSelected())  
            Pay.setText("PAID");  
        else  
            Pay.setText("PAY"); 
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


