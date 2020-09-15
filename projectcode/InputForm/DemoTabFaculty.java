package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;


public class DemoTabFaculty extends Frame
{
JTabbedPane jtp;
Frame frm;

public DemoTabFaculty()
	{
	 frm=new Frame("MY Frame");
     jtp=new JTabbedPane();
	}


	public void setUpDemoTabFaculty()
	{
     jtp.addTab("Insert Details",new FacultyDetails());// syntax to add Tab in panel
    /* jtp.addTab("Update Details",new FacultyDetailsUpdate());
     jtp.addTab("Delete Details",new FacultyDetailsDelete());
*/

     frm.setSize(1100,800);
     frm.add(jtp);
     frm.setVisible(true);
    }
}



class FacultyDetails extends JPanel implements ActionListener,ItemListener 
{

JPanel frm; 
Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;

String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",a10="",a11="",a12="",a13="",a14="",a15="",a16="",a17="";
JButton b1,b2,b3,b4;
ImageIcon ic;
Choice ch1,ch2,ch3,ch4,ch5;

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
JTextField t1,t2,t4,t5,t7,t8,t9,t10,t11,t12,t13,t14,t16;

 public FacultyDetails()
 {  
   frm=new JPanel();
   ic=new ImageIcon("a8.jpg");

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
   l15=new JLabel("Time-Table");
   l16=new JLabel("More(Research done");
   l17=new JLabel(" / Achievement");
   l19=new JLabel("School of");
   l20=new JLabel("Branch");
   l21=new JLabel("Course");
   
   l18=new JLabel("",ic,JLabel.CENTER);// for image of time table.

   t1=new JTextField("t1");
   t2=new JTextField("t2");

   t4=new JTextField("t4");
   t5=new JTextField("t5");
  
   t7=new JTextField("t7");
   t8=new JTextField("t8");
   t9=new JTextField("t9");
   t10=new JTextField("t10");
   t11=new JTextField("t11");
   t12=new JTextField("t12");
   t13=new JTextField("t13");
   t14=new JTextField("t14");

   t16=new JTextField("t16");
   


   b1=new JButton("Open");
   b2=new JButton("Close");
   b3=new JButton("Refresh");
   b4=new JButton("Submit");

   ch1=new Choice();
   ch2=new Choice();
   ch3=new Choice();
   ch4=new Choice();
   ch5=new Choice();
 /*}
 public void setUpFacultyDetails()
 {
 frm.setSize(600,900);
 */
 frm.setLayout(null);
 l1.setBounds(50,100,150,25);
 l2.setBounds(50,130,150,25);
 l3.setBounds(50,430,150,25);
 l4.setBounds(50,190,150,25);
 l5.setBounds(50,220,150,25);
 l6.setBounds(400,100,150,25);
 l7.setBounds(400,130,150,25);
 l8.setBounds(400,160,150,25);
 l9.setBounds(50,250,150,25);
 l12.setBounds(400,190,150,25);
 l11.setBounds(50,280,150,25);
 l10.setBounds(50,310,150,25);
 l13.setBounds(400,220,150,25);
 l14.setBounds(400,250,150,25);
 l15.setBounds(400,280,150,25);
 l16.setBounds(50,340,200,25);
 l17.setBounds(50,370,200,25);
 l19.setBounds(50,400,150,25);
 l20.setBounds(50,460,150,25);
 ch4.setBounds(200,460,150,25);
 l21.setBounds(50,490,150,25);
 ch5.setBounds(200,490,150,25);

 l18.setBounds(700,100,500,500);

 t1.setBounds(200,100,150,25);
 t2.setBounds(200,130,150,25);
 
 t4.setBounds(200,190,150,25);
 t5.setBounds(200,220,150,25);
 ch2.setBounds(550,100,150,25);
 t7.setBounds(550,130,150,25);
 t8.setBounds(550,220,150,25);
 t9.setBounds(200,250,150,25);
 t10.setBounds(200,310,150,25);
 t11.setBounds(200,280,150,25);
 t13.setBounds(550,160,150,25);
 t14.setBounds(550,250,150,25);
 t16.setBounds(200,340,150,50);


 b1.setBounds(550,280,150,25);
 b2.setBounds(270,600,100,25);
 b3.setBounds(160,600,100,25);
 b4.setBounds(50,600,100,25);

 ch1.addItem("ch1");
 ch2.addItem("ch2");
 ch3.addItem("ch3");
 ch4.addItem("ch4");
 ch5.addItem("ch5");


 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);

 ch1.setBounds(200,430,170,25);
 ch3.setBounds(200,400,150,25);
 ch1.addItemListener(this);
 ch2.addItemListener(this);
 ch3.addItemListener(this);
 ch4.addItemListener(this);
 ch5.addItemListener(this); 





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

 frm.add(t1);
 frm.add(t2);
 frm.add(t4);
  frm.add(t5);
 frm.add(t7);
 frm.add(t8);
  frm.add(t9);
 frm.add(t10);
 frm.add(t11);
 frm.add(t12);
 frm.add(t13);
 frm.add(t14);
 frm.add(t16);

 frm.add(b1);
 frm.add(b2);
 frm.add(b3);
 frm.add(b4);


 frm.add(ch1);
 frm.add(ch2);
 frm.add(ch3);
 frm.add(ch4);
 frm.add(ch5);

 frm.setVisible(true);


 addSchool();


 }

	
  

    public void getData() 
	{
		a1=t1.getText();
		a2=t2.getText();
		a3=t4.getText();
		a4=t5.getText();
		a5=t9.getText();
		a6=t11.getText();
		a7=t10.getText();
		a8=t16.getText();
		a9=ch3.getSelectedItem();
		a10=ch1.getSelectedItem();
		a11=ch4.getSelectedItem();
		a12=ch5.getSelectedItem();
		a13=ch2.getSelectedItem();
		a14=t7.getText();
		a15=t13.getText();
		a16=t8.getText();
		a17=t14.getText();

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
    
	pst = con.prepareStatement("Insert into facultydetails values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"','"+a11+"','"+a12+"','"+a13+"','"+a14+"','"+a15+"','"+a16+"','"+a17+"')");
	pst.executeUpdate();
	
	}
	catch(SQLException se)
	{
	System.out.println(se);
	}
}

  public void addSchool()
  {
  	try
	{
	conn(); 
	st=con.createStatement();
	
	rec=st.executeQuery("Select DISTINCT schoolname from school");
	while(rec.next())
	{    
	ch3.addItem(rec.getString(1));// here i have to write in getString (1) one because i have mentioned column name in query of distinct.
                                  // so always write 1. othrwise error will be INVALID DESCRIPTOR ERROR
	}
	}
	catch(Exception ex)
	{
	System.out.println(ex);
	}

   }

   public void addDepar()
   {
   	try
	{
	conn(); 
	st=con.createStatement();  
	String bn=ch3.getSelectedItem();
	rec=st.executeQuery("Select DISTINCT department from school where schoolname='"+bn+"'"); // here schoolname is coming because ch3 mei school name hai.// and this is query of distinct query where same type ke values database mei repeat nahi hoti.
	
	while(rec.next())
	{      
	
	ch1.addItem(rec.getString(1));// here 1 will always come because we are already mentioning column name in above distinct query.
	
	}
	}
	catch(Exception ex)
	{
	
	System.out.println("addDepar error="+ex);
	}


    }
   public void addCourse()
   {
   	try
	{
	conn(); 
	st=con.createStatement();  
	String cn=ch1.getSelectedItem();
	rec=st.executeQuery("Select DISTINCT course from school where department='"+cn+"'");
	while(rec.next())
	{      
	ch2.addItem(rec.getString(1));
	}
	}
	catch(Exception ex)
	{
	System.out.println("addCourse error="+ex);
	}


   }
  public void addBranch()
   {
   	try
	{
	conn(); 
	st=con.createStatement();  
	String dn=ch2.getSelectedItem();
	rec=st.executeQuery("Select DISTINCT branch from school where department='"+dn+"'");
	while(rec.next())
	{

	ch3.addItem(rec.getString(3));
	
	}
	}
	catch(Exception ex)
	{

	System.out.println("addBranch error="+ex);
	
	}


   }



    public void actionPerformed(ActionEvent ae)
  {
	if(ae.getSource()== b1)
	{

	}
	if(ae.getSource()== b2)
	{
		frm.setVisible(false);

	}
	if(ae.getSource()== b3)
	{
		t1.setText("");                   
		t2.setText("");
		t4.setText("");
		t5.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText(""); 
		t10.setText("");		
		t11.setText("");
		t12.setText("");
		t13.setText("");
		t14.setText("");
		t16.setText("");
		

	}

	if(ae.getSource()==b4)

	{
		conn();
		getData();
		putData();

	}
	
   }

    public void itemStateChanged(ItemEvent ie)
   {
     if(ie.getSource()==ch3)
      {
      	addDepar();
      }
      if(ie.getSource()==ch1)
      {
      	addCourse();
      }
      if(ie.getSource()==ch2)
      {
      	addBranch();
      }

    }



}
