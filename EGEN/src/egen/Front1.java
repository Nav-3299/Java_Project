package egen;

import javax.swing.*;
import javax.swing.JRadioButton;
import java.awt.*;
//import java.util.Scanner;
import java.awt.event.*;


 class second extends JFrame {
//implements ActionListener {
    JPanel screen2;
    JButton b1,b2;    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JRadioButton j1,j2,j3,j4,j5,j6,j7;
    ButtonGroup bg1,bg2;
    JTextArea a1,a2;
    JCheckBox jb1,jb2,jb3,jb4;
    JScrollPane js;
    JFileChooser chooser;
   public second()
    {
        screen2 = new JPanel();
        screen2.setLayout(null);
        screen2.setBounds(40,150,800,400);
        screen2.setBackground(Color.LIGHT_GRAY);
        screen2.setPreferredSize(new Dimension(800, 680));
        add(screen2);
        js = new JScrollPane(screen2);
        screen2.setAutoscrolls(true);
        js.setBounds(40,150,800,400);
        this.add(js);      
       
       
       
 
       
       
        l1= new JLabel("Name :");
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l1.setBounds(75,10,500,30);
        screen2.add(l1);
        tf1= new JTextField(30);
        tf1.setFont(new Font("Serif", Font.BOLD, 20));
        tf1.setBounds(400,10,300,30);
        screen2.add(tf1);
       
        l2= new JLabel("Father's Name :");
        l2.setFont(new Font("Serif", Font.BOLD, 20));
        l2.setBounds(75,50,500,30);
        screen2.add(l2);
        tf2= new JTextField(30);
        tf2.setFont(new Font("Serif", Font.BOLD, 20));
        tf2.setBounds(400,50,300,30);
        screen2.add(tf2);
       
       
        l3= new JLabel("Mobile:");
        l3.setFont(new Font("Serif", Font.BOLD, 20));
        l3.setBounds(75,90,500,30);
        screen2.add(l3);
        //JPasswordField value = new JPasswordField();
        //value.setBounds(400,160,300,30);
        //screen2.add(l3);
        tf3= new JTextField(30);
        tf3.setFont(new Font("Serif", Font.BOLD, 20));
        tf3.setBounds(400,90,300,30);
        screen2.add(tf3);
       
        l4= new JLabel("Gender:");
        l4.setFont(new Font("Serif", Font.BOLD, 20));
        l4.setBounds(75,130,500,30);
        screen2.add(l4);
       
       
       
        j1=new JRadioButton("Male");
        j2=new JRadioButton("FeMale");
        j3=new JRadioButton("Others");
        j1.setBounds(400,130,70,30);
        j2.setBounds(520,130,70,30);
        j3.setBounds(630,130,70,30);
        bg1= new ButtonGroup();
        bg1.add(j1);
        bg1.add(j2);
        bg1.add(j3);
        j1.setSelected(true);
        screen2.add(j1);
        screen2.add(j2);
        screen2.add(j3);
       
        l5= new JLabel("Address:");
        l5.setFont(new Font("Serif", Font.BOLD, 20));
        l5.setBounds(75,170,500,30);
        screen2.add(l5);
        a1=new JTextArea();
        a1.setBounds(400,170,300,60);
        screen2.add(a1);
           
       
        l6= new JLabel("Email -Id:");
        l6.setFont(new Font("Serif", Font.BOLD, 20));
        l6.setBounds(75,240,300,30);
        screen2.add(l6);
        tf4= new JTextField(30);
        tf4.setFont(new Font("Serif", Font.BOLD, 20));
        tf4.setBounds(400,240,300,30);
        screen2.add(tf4);
       
        l7= new JLabel("Adhar Card Number:");
        l7.setFont(new Font("Serif", Font.BOLD, 20));
        l7.setBounds(75,280,300,30);
        screen2.add(l7);
        tf5= new JTextField(30);
        tf5.setFont(new Font("Serif", Font.BOLD, 20));
        tf5.setBounds(400,280,300,30);
        screen2.add(tf5);
       
         
       
       
        l9= new JLabel("Category:");
        l9.setFont(new Font("Serif", Font.BOLD, 20));
        l9.setBounds(75,320,300,30);
        screen2.add(l9);
        jb1 = new JCheckBox("Student");
        jb2 = new JCheckBox("Govt. Employee");
        jb3 = new JCheckBox("Senior Citizen");
        jb4 = new JCheckBox("Handicapped");
        jb1.setBounds(400,320,150,30);
        jb2.setBounds(400,360,150,30);
        jb3.setBounds(400,400,150,30);
        jb4.setBounds(400,440,150,30);
        screen2.add(jb1);
        screen2.add(jb2);
        screen2.add(jb3);
        screen2.add(jb4);
       
        l10 =new JLabel("Service Type:");
        l10.setFont(new Font("Serif", Font.BOLD, 20));
        l10.setBounds(75,480,300,30);
        screen2.add(l10);
        j4=new JRadioButton("AC");
        j5=new JRadioButton("Non AC");
        j4.setBounds(400,480,70,30);
        j5.setBounds(480,480,70,30);
        bg1= new ButtonGroup();
        bg1.add(j4);
        bg1.add(j5);
        j1.setSelected(true);
        screen2.add(j4);
        screen2.add(j5);
       
        l11 =new JLabel("Route Type:");
        l11.setFont(new Font("Serif", Font.BOLD, 20));
        l11.setBounds(75,520,300,30);
        screen2.add(l11);
        j6=new JRadioButton("All Routes");
        j7=new JRadioButton("Particular Route");
        j6.setBounds(400,520,143,30);
        j7.setBounds(550,520,143,30);
        bg1= new ButtonGroup();
        bg1.add(j6);
        bg1.add(j7);
        j1.setSelected(true);
        screen2.add(j6);
        screen2.add(j7);
       
        l12 = new JLabel("Signature:");
        l12.setFont(new Font("Serif", Font.BOLD, 20));
        l12.setBounds(75,560,300,30);
        screen2.add(l12);
        a2=new JTextArea();
        a2.setBounds(400,560,175,40);
        screen2.add(a2);
        b2= new JButton("Browse");
        b2.setFont(new Font("Serif", Font.BOLD, 25));
        b2.setBounds(580,566,115,26);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.GRAY);
       screen2.add(b2);  
         
       
       
       
        b1= new JButton("SAVE");
        b1.setFont(new Font("Serif", Font.BOLD, 25));
        b1.setBounds(310,630,150,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.GREEN);
       screen2.add(b1);    
       
    }
       
    }
   
   
   
   
   
public class Front1{
    public static void main(String[] args) {
        // TODO code application logic here
        //new first();
        second frame= new second();
        //IMAGE
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
   
}



