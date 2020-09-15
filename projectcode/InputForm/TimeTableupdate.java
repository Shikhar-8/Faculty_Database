package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class TimeTableupdate extends Frame implements ActionListener
{
Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;
Random rd;
JButton b1,b2;
Frame frm;
JLabel l1,l2,l3,l4,l5,l6,l10;
JTextField t1,t2,t3,t4,t5,t6,t10;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="";
public TimeTableupdate()
 {  

   
   frm=new Frame("My Frame");
   l1=new JLabel("Employee code");
   //l2=new JLabel("Batch");
   l3=new JLabel("Day");
   l4=new JLabel("Subject Name");
   l5=new JLabel("Start Time");
   l6=new JLabel("End Time");

   t1=new JTextField();
   //t2=new JTextField();
   t3=new JTextField();
   t4=new JTextField();
   t5=new JTextField();
   t6=new JTextField();
   t10=new JTextField();
   l10=new JLabel("Transaction ID");

   b1=new JButton("Search");
   b2=new JButton("Update");
 }

   public void setUpTimeTableupdate()
 {

    

 frm.setSize(600,900);
 frm.setLayout(null);
 l1.setBounds(50,100,100,25);
 //l2.setBounds(50,130,100,25);
 l3.setBounds(50,160,100,25);
 l4.setBounds(50,190,100,25);
 l5.setBounds(50,220,100,25);
 l6.setBounds(50,250,100,25);

 t1.setBounds(200,100,100,25);
 //t2.setBounds(200,130,100,25);
 t3.setBounds(200,160,100,25);
 t4.setBounds(200,190,100,25);
 t5.setBounds(200,220,100,25);
 t6.setBounds(200,250,100,25);
 l10.setBounds(50,70,100,25);
 t10.setBounds(200,70,100,25);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b1.setBounds(320,70,100,25);
  b2.setBounds(200,280,100,25);
  
 frm.add(l1);
// frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(t1);
 //frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 frm.add(t5);
 frm.add(t6);
 frm.add(b1);
 frm.add(b2);
 frm.add(l10);
 frm.add(t10);

 frm.setVisible(true);
 }
  public void getData() 
  {
    a1=t1.getText();
   // a2=t2.getText();
    a3=t3.getText();
    a4=t4.getText();
    a5=t5.getText();
    a6=t6.getText();
    a7=t10.getText();
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


  
public void SearchData()
{
  try
  {
  st=con.createStatement();
  String bn=t10.getText();
  rec=st.executeQuery("Select *from timetable where transactionid='"+bn+"'");

  if(rec.next())
  { 
  t1.setText(rec.getString(1));     
  //t2.setText(rec.getString(2));
  t3.setText(rec.getString(3));
  t4.setText(rec.getString(4));
  t5.setText(rec.getString(5));
  t6.setText(rec.getString(6));
  }
  else // nice way to check whether this loop is working or not

   {
    t1.setText("NO data");
   }
 }

  catch(Exception ex)
  {
  System.out.println("Search error="+ex);
  }
 }
public void UpdateData()
{
  try
  {
  String bn=t1.getText();
  pst = con.prepareStatement("update timetable set batch='"+a2+"',department ='"+a3+"',subjectname='"+a4+"',starttime='"+a5+"',endtime='"+a6+"'where employeecode='"+bn+"'");
  pst.executeUpdate();
  }
  catch(SQLException se)
  {
  System.out.println("this is error from UpdateData"+se);
  }
}

 public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    { 
      conn();
      SearchData();
    }
  
    if(ae.getSource()== b2)
  {
   int dialogButton = JOptionPane.showConfirmDialog (null , "Are You sure?","WARNING",JOptionPane.YES_NO_OPTION);
   if(dialogButton == JOptionPane.YES_OPTION)
    {
    conn();
    getData();
    UpdateData();
    JOptionPane.showMessageDialog(null,"Information has been successfully Updated");

    
    }
  
  }

}
}


  
