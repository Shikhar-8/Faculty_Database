package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class TimeTable extends Frame implements ActionListener
{
Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;
Random rd;
JButton b1,b2;
Frame frm;
Choice ch1,ch2;
JLabel l1,l2,l3,l4,l5,l6,l7,l10;
JTextField t1,t2,t3,t4,t5,t6,t7,t10;
String a1="",a2="",a3="",a4="",a5="",a6="",a22="",a8="";
public TimeTable()
 {  

   
   frm=new Frame("My Frame");
   l1=new JLabel("Employee code");
   l2=new JLabel("Batch");
   l3=new JLabel("Department");
   l4=new JLabel("Subject Name");
   l5=new JLabel("Start Time");
   l6=new JLabel("End Time");
   l7=new JLabel("Day");

   t1=new JTextField();
   t2=new JTextField();
   t3=new JTextField();
   t4=new JTextField();
   t5=new JTextField();
   t6=new JTextField();
   t7=new JTextField();
   t10=new JTextField();
   l10=new JLabel("Transaction ID");

   ch1=new Choice();
   ch2=new Choice();
   ch1.addItem("AM");
   ch1.addItem("PM");
   ch2.addItem("AM");
   ch2.addItem("PM");
   add(ch1);
   add(ch2);


    b1=new JButton("Submit");
//  b2=new JButton("Update");
 }

   public void setUpTimeTable()
 {

  Random rd= new Random();
  String tid=""+rd.nextInt(10)+rd.nextInt(10)+rd.nextInt(10)+rd.nextInt(10);
  t10.setText(tid);

 frm.setSize(600,900);
 frm.setLayout(null);
 l1.setBounds(50,100,100,25);
 l2.setBounds(50,130,100,25);
 l3.setBounds(50,160,100,25);
 l4.setBounds(50,190,100,25);
 l5.setBounds(50,220,100,25);
 l6.setBounds(50,250,100,25);
 l7.setBounds(50,280,100,25);

 t1.setBounds(200,100,100,25);
 t2.setBounds(200,130,100,25);
 t3.setBounds(200,160,100,25);
 t4.setBounds(200,190,100,25);
 t5.setBounds(200,220,100,25);
 t6.setBounds(200,250,100,25);
 t7.setBounds(200,280,100,25);
 l10.setBounds(50,70,100,25);
 t10.setBounds(200,70,100,25);
 b1.addActionListener(this);
 //b2.addActionListener(this);
 b1.setBounds(100,310,100,25);
 //b2.setBounds(220,280,100,25);

  ch1.setBounds(300,220,50,25);
  ch2.setBounds(300,250,50,25);
  
 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(l7);
 frm.add(t1);
 frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 frm.add(t5);
 frm.add(t6);
 frm.add(t7);
 frm.add(b1);
// frm.add(b2);
 frm.add(l10);
 frm.add(t10);
 frm.add(ch1);
 frm.add(ch2);


 frm.setVisible(true);
 }
  public void getData() 
  {
    a1=t1.getText();
    a2=t2.getText();
    a3=t3.getText();
    a4=t4.getText();
    a5=t5.getText();
    a6=t6.getText();
    a22=t7.getText();
    a8=t10.getText();
  }
  public void conn()
  {
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con = DriverManager.getConnection("jdbc:odbc:schoolproject1");
  }
  catch(Exception ex)
  {
  System.out.println(ex);
  }
  }


  public void putData()
 {
  try
  {

    
  pst = con.prepareStatement("Insert into timetable values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a22+"','"+a8+"')");
  pst.executeUpdate();
  
  }
  catch(SQLException se)
  {
  System.out.println(se);
  }
 }


 public void actionPerformed(ActionEvent ae)
  {
  if(ae.getSource()== b1)
  {
    getData();
    conn();
    putData();
    //t10.setText(""+rd.nextInt(10)+rd.nextInt(10)+rd.nextInt(10)+rd.nextInt(10));

  }

    /*if(ae.getSource()== b2)
  {

   int dialogButton = JOptionPane.showConfirmDialog (null , "Are You sure?","WARNING",JOptionPane.YES_NO_OPTION);
   if(dialogButton == JOptionPane.YES_OPTION)
    {
    conn();
    getData();
    UpdateData();
    JOptionPane.showMessageDialog(null,"Information has been successfully Updated");

    
    }
  }*/
}
}


  
