/*
 E-GEN:Online e-Ticket generating app
 */
package egen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class through extends JFrame implements ActionListener{
    JPanel screen4;
//    JPanel screen4_heading;
    JLabel Source;
    JLabel Destination;
    JLabel Fair;
    JButton Pay;
    JButton Send_Request;
    JButton Show_Ticket ;
    JTextField textfair;
    JComboBox sourcelist;
    JComboBox destinationlist;
    
    public through()
    {
//        JFrame f = new JFrame();
         String sd[]={"Zirakpur","Sector 14","Sector 11","Sector 1","Rock Garden","Rose Garden",
            "Sukhna lake","Mohali","Panchkula"};
         
//         What if I want to add a new panel at the top?
//         screen4_heading = new JPanel(new BorderLayout());
////         screen4_heading.setLayout(new(BorderLayout()));
////           screen4_heading.setBounds(40,10,800,400);
//           screen4.setBackground(Color.GREEN);
//          add(screen4_heading);
          
          
         screen4=new JPanel();
         screen4.setLayout(null);
         Source=new JLabel("SOURCE");
          Destination=new JLabel("DESTINATION");
          Fair=new JLabel("FAIR");
    
        screen4.add(Source);
          Source.setFont(new Font("Serif", Font.BOLD, 20));
           Source.setBounds(75,35,500,30);
       
        screen4.add(Destination);
          Destination.setFont(new Font("Serif", Font.BOLD, 20));
           Destination.setBounds(75,80,500,30);
           
            screen4.add(Fair);
          Fair.setFont(new Font("Serif", Font.BOLD, 20));
           Fair.setBounds(75,125,500,30);
           
          Pay= new JButton("Pay");
          screen4.add(Pay);
          Pay.setBounds(300,200,150,30);
         Send_Request =new JButton("Send Request");
           screen4.add(Send_Request);
          Send_Request.setBounds(300,250,150,30);
         Show_Ticket = new JButton("Show Ticket") ;
           screen4.add(Show_Ticket);
          Show_Ticket.setBounds(300,300,150,30);
         
           
          
       
         sourcelist=new  JComboBox(sd);
         screen4.add(sourcelist);
             sourcelist.setBounds(500,35,200,30);
             
        destinationlist=new JComboBox(sd);
        screen4.add(destinationlist);
        destinationlist.setBounds(500,80,200,30);
        
        textfair=new JTextField(15);
        
        screen4.add(textfair);
         textfair.setBounds(500,125,200,30);
        
       screen4.setBounds(40,150,800,400);
       screen4.setBackground(Color.LIGHT_GRAY);
     add(screen4,BorderLayout.CENTER);
        
     Show_Ticket.addActionListener(this);
    Pay.addActionListener(this);
    Send_Request.addActionListener(this);
     
    }//end of constructor
    
  public void actionPerformed(ActionEvent e){
    
      if( e.getSource()==Show_Ticket){
             this.setVisible (false);
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
  }
      
       if(e.getSource()==Pay){
              this.setVisible (false);
    screen frame=new screen();
          
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
       }
  
       
        if( e.getSource()==Send_Request){
//            //     new screenticket().setVisible(true);
//               this.setVisible (false);
//              screenticket obj=new screenticket();
//             obj.setBounds(300,150,900,600);
//              obj.setVisible(true);
  }
    
  }
    
    
}//end of looged_in class

public class EGEN extends through {
    public static void main(String[] args) {
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
