package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
// inserting page final
public class OutputForm1 extends Frame implements ActionListener
{

Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;
JButton b1,b2,b3;
Frame frm;

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l40;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t40;
String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="",a18="",a19="",a20="",a21="",a22="";

public OutputForm1()
{
	frm=new Frame("My Frame");
   

   l1=new JLabel("Employee code");
   l2=new JLabel("Name");
   l3=new JLabel("Department");
   l4=new JLabel("Designation");
   l5=new JLabel("Seat in Faculty room");
   l6=new JLabel("Building block number");
   l7=new JLabel("Courses Taught");
   l8=new JLabel("Lab Taken");
   l9=new JLabel("CC of ");
   l10=new JLabel("Expertise");
   l11=new JLabel("Qualification/Education");
   l12=new JLabel("Contact Info");
   l13=new JLabel("Mobile number");
   l14=new JLabel("Email ID");
   l15=new JLabel("More(Research done");
   l16=new JLabel(" / Achievement");
   l17=new JLabel("School of");
   l18=new JLabel("Branch");
   l19=new JLabel("Course");
   l20=new JLabel("Day");
   l21=new JLabel("Subject Name");
   l22=new JLabel("Start Time");
   l23=new JLabel("End Time");



   t1=new JTextField("t1");
   t2=new JTextField("t2");
   t3=new JTextField("t3");
   t4=new JTextField("t4");
   t5=new JTextField("t5");
   t6=new JTextField("t6");
   t7=new JTextField("t7");
   t8=new JTextField("t8");
   t9=new JTextField("t9");
   t10=new JTextField("t10");
   t11=new JTextField("t11");
   t12=new JTextField("t12");
   t13=new JTextField("t13");
   t14=new JTextField("t14");
   t15=new JTextField("t15");
   t16=new JTextField("t16");
   t17=new JTextField("t17");
   t18=new JTextField("t18");
   t19=new JTextField("t19");
   t20=new JTextField("t20");
   t21=new JTextField("t21");
   t22=new JTextField("t22");
   t23=new JTextField("t23");

   t40=new JTextField();
   l40=new JLabel("Transaction ID");

   b1=new JButton("Next");
   b2=new JButton("Search");
  

} 

public void setUpOutputForm1()
 {

 

 frm.setSize(600,900);
 frm.setLayout(null);
 l1.setBounds(50,100,100,25);
 l2.setBounds(50,130,100,25);
 l3.setBounds(50,160,100,25);
 l4.setBounds(50,190,100,25);
 l5.setBounds(50,220,100,25);
 l6.setBounds(50,250,100,25);
 l7.setBounds(50,280,100,25);
 l8.setBounds(50,310,100,25);
 l9.setBounds(50,340,100,25);
 l10.setBounds(50,370,100,25);
 l11.setBounds(50,400,100,25);
 l12.setBounds(50,430,100,25);
 l13.setBounds(50,460,100,25);
 l14.setBounds(50,490,100,25);
 l15.setBounds(50,520,100,25);
 l16.setBounds(50,550,100,25);
 l17.setBounds(50,580,100,25);
 l18.setBounds(50,610,100,25);
 l19.setBounds(50,640,100,25);
 
 l20.setBounds(400,100,100,25);
 l21.setBounds(400,130,100,25);
 l22.setBounds(400,160,100,25);
 l23.setBounds(400,190,100,25);


 t1.setBounds(200,100,100,25);
 t2.setBounds(200,130,100,25);
 t3.setBounds(200,160,100,25);
 t4.setBounds(200,190,100,25);
 t5.setBounds(200,220,100,25);
 t6.setBounds(200,250,100,25);
 t7.setBounds(200,280,100,25);
 t8.setBounds(200,310,100,25);
 t9.setBounds(200,340,100,25);
 t10.setBounds(200,370,100,25);
 t11.setBounds(200,400,100,25);
// t12.setBounds(200,430,100,25);
 t13.setBounds(200,460,100,25);
 t14.setBounds(200,490,100,25);
 t15.setBounds(200,520,100,25);
// t16.setBounds(200,550,100,25);
 t17.setBounds(200,580,100,25);
 t18.setBounds(200,610,100,25);
 t19.setBounds(200,640,100,25);

 t20.setBounds(500,100,100,25);
 t21.setBounds(500,130,100,25);
 t22.setBounds(500,160,100,25);
 t23.setBounds(500,190,100,25);
 
 b1.setBounds(500,260,100,25);
 b2.setBounds(300,100,75,25);
 

 t40.setBounds(500,230,100,25);
 l40.setBounds(400,230,100,25);


 frm.add(l1);
 frm.add(l2);
 frm.add(l3);
 frm.add(l4);
 frm.add(l5);
 frm.add(l6);
 frm.add(l7);
 frm.add(l8);
 frm.add(l9);
 frm.add(l10);
 frm.add(l11);
 frm.add(l12);
 frm.add(l13);
 frm.add(l14);
 frm.add(l15);
 frm.add(l16);
 frm.add(l17);
 frm.add(l18);
 frm.add(l19);
 frm.add(l20);
 frm.add(l21);
 frm.add(l22);
 frm.add(l23);

 frm.add(t1);
 frm.add(t2);
 frm.add(t3);
 frm.add(t4);
 frm.add(t5);
 frm.add(t6);
 frm.add(t7);
 frm.add(t8);
 frm.add(t9);
 frm.add(t10);
 frm.add(t11);
 frm.add(t12);
 frm.add(t13);
 frm.add(t14);
 frm.add(t15);
 frm.add(t16);
 frm.add(t17);
 frm.add(t18);
 frm.add(t19);
 frm.add(t20);
 frm.add(t21);
 frm.add(t22);
 frm.add(t23);
 frm.add(t40);
 frm.add(l40);

 frm.add(b1);
 frm.add(b2);

 b1.addActionListener(this);
 b2.addActionListener(this);
 
 
 frm.setVisible(true);
 
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
  String bn=t1.getText();
  rec=st.executeQuery("Select *from timetable where employeecode='"+bn+"'");

  if(rec.next())
  { 

  t2.setText(rec.getString(2));     
  t3.setText(rec.getString(3));
  t4.setText(rec.getString(4));
  t5.setText(rec.getString(5));
  t6.setText(rec.getString(6));
  t7.setText(rec.getString(7));
  t8.setText(rec.getString(8));
  t9.setText(rec.getString(9));
  t10.setText(rec.getString(10));     
  t11.setText(rec.getString(11));
  //t12.setText(rec.getString(12));
  t13.setText(rec.getString(12));
  t14.setText(rec.getString(13));
  t15.setText(rec.getString(14));
  //t16.setText(rec.getString(16));
  t17.setText(rec.getString(15));
  t18.setText(rec.getString(16));
  t19.setText(rec.getString(17));
  t20.setText(rec.getString(18));
  t21.setText(rec.getString(19));
  t22.setText(rec.getString(20));
  t23.setText(rec.getString(21));
  t40.setText(rec.getString(22));

  } 
  else
  {
  	t1.setText("No Data");
  }
}
catch(Exception ex)
  {
  System.out.println("Search error="+ex);
  }

}
public void nextData()
{
  try
  {
  if(rec.next())
  { 

  t2.setText(rec.getString(2));     
  t3.setText(rec.getString(3));
  t4.setText(rec.getString(4));
  t5.setText(rec.getString(5));
  t6.setText(rec.getString(6));
  t7.setText(rec.getString(7));
  t8.setText(rec.getString(8));
  t9.setText(rec.getString(9));
  t10.setText(rec.getString(10));     
  t11.setText(rec.getString(11));
  //t12.setText(rec.getString(12));
  t13.setText(rec.getString(12));
  t14.setText(rec.getString(13));
  t15.setText(rec.getString(14));
  //t16.setText(rec.getString(16));
  t17.setText(rec.getString(15));
  t18.setText(rec.getString(16));
  t19.setText(rec.getString(17));
  t20.setText(rec.getString(18));
  t21.setText(rec.getString(19));
  t22.setText(rec.getString(20));
  t23.setText(rec.getString(21));
  t40.setText(rec.getString(22));

  }
  }
  catch(Exception ex)
  {
    System.out.println("next data error"+ex);
  } 
}

	


public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    { 
nextData();
    }
    if(ae.getSource()==b2)
    { 
      conn();
      SearchData();
    }
    
      
    }
}

