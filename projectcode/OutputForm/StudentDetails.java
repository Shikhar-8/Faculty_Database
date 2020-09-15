package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
// inserting page for student
public class StudentDetails extends Frame implements ActionListener,ItemListener
{

Connection con;
Statement st;
ResultSet rec;
PreparedStatement pst;
Frame frm;

JButton b2,b3,b4;
Choice ch1,ch2,ch3,ch4;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14; 

public  StudentDetails()
{
   frm=new Frame("My Frame");
   
   b2=new JButton("Close");
   b3=new JButton("Refresh");
   b4=new JButton("Submit");

   l1=new JLabel("SAP ID");
   l2=new JLabel("Enrollment Number");
   l3=new JLabel("Student First Name");
   l4=new JLabel("Student Middle Name");
   l5=new JLabel("Student Last Name");
   l6=new JLabel("Student's Phone Number");
   
   l8=new JLabel("Father's name");
   l9=new JLabel("Emergency Contact number");
   l10=new JLabel("Blood Group");
   l11=new JLabel("Home Address");
   l12=new JLabel("Any medical condition");
   l13=new JLabel("Student email ID");
   
   l14=new JLabel("School of");
   l15=new JLabel("Depatment of");
   l16=new JLabel("Branch");
   l17=new JLabel("Semester ");
   
   l18=new JLabel("Any achievments");

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
   ch1=new Choice();
   ch2=new Choice();
   ch3=new Choice();
   ch1=new Choice();
   t13=new JTextField("t13");
   
  }

  public void setUpStudentDetails()
  {   
    frm.setLayout(null);

	frm.setSize(800,900);

   l1.setBounds(50,100,150,25);
   l2.setBounds(50,130,150,25);
   l3.setBounds(50,160,150,25);
   l4.setBounds(50,190,150,25);
   l5.setBounds(50,220,150,25);
   l6.setBounds(50,250,150,25);

   l8.setBounds(50,310,150,25);
   l9.setBounds(50,340,150,25);
   l10.setBounds(50,370,150,25);
   l11.setBounds(50,400,150,25);
   l12.setBounds(50,430,150,25);
   l13.setBounds(50,460,150,25);
   l14.setBounds(50,490,150,25);
   l15.setBounds(50,520,150,25);
   l16.setBounds(50,550,150,25);
   l17.setBounds(50,580,150,25);


   t1.setBounds(200,100,150,25);
   t2.setBounds(200,130,150,25);
   t3.setBounds(200,160,150,25);
   t4.setBounds(200,190,150,25);
   t5.setBounds(200,220,150,25);
   t6.setBounds(200,250,150,25);
   t7.setBounds(200,280,150,25);
   t8.setBounds(200,310,150,25);
   t9.setBounds(200,340,150,25);
   t10.setBounds(200,370,150,25);
   t11.setBounds(200,400,150,25);
   t12.setBounds(200,430,150,25);
   
   ch1.setBounds(200,460,150,25);
   ch2.setBounds(200,490,150,25);
   ch3.setBounds(200,520,150,25);
   ch4.setBounds(200,550,150,25);
 
   t13.setBounds(200,580,150,25);


 ch1.addItem("School of Computer Science");

 ch2.addItem("Department of Systemics");
 ch2.addItem("Department of Informatics");
 ch2.addItem("Department of Virtualisation");
 ch2.addItem("Department of Cybernetics");
 ch2.addItem("Department of Computer Application");

 //ch3.additem("Branch Details");

 ch4.addItem("1");
 ch4.addItem("2");
 ch4.addItem("3");
 ch4.addItem("4");
 ch4.addItem("5");
 ch4.addItem("6");
 ch4.addItem("7");
 ch4.addItem("8");

 b2.setBounds(270,600,100,25);
 b3.setBounds(160,600,100,25);
 b4.setBounds(50,600,100,25);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);



   frm.add(l1);
   frm.add(l2);
   frm.add(l3);
   frm.add(l4);
   frm.add(l5);
   frm.add(l6);
   
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

   frm.add(ch1);
   frm.add(ch2);
   frm.add(ch3);
   frm.add(ch4);

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


   frm.add(b2);
   frm.add(b3);
   frm.add(b4);


  frm.setVisible(true);




}
public void actionPerformed(ActionEvent ae)
{
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
		
		


	}
	if(ae.getSource()== b4)
	{

	}
}
public void itemStateChanged(ItemEvent ie)
   {

   	}

}
