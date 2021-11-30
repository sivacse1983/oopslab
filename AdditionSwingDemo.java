//Java Swing Application for addition of two numbers
import java.util.*;
import java.awt.*;//Abstract Window Toolkit
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class AdditionSwing extends JFrame implements ActionListener
{
	//1.Declare Components
	JTextField t1,t2;
	JButton btn;
	JLabel lb;
	AdditionSwing()
	{
		//2.Initialize Components
		t1=new JTextField();
		t2=new JTextField();
        btn=new JButton("Add");
		lb=new JLabel();
		
		//3.Add Components
		add(t1);
		add(t2);
		add(btn);
		add(lb);
		
		//4.Position the components
		t1.setBounds(30,40,50,30);//(x,y,width,height)
		t2.setBounds(100,40,50,30);
		btn.setBounds(30,80,100,30);
		lb.setBounds(30,120,200,30);
		
		//5.Initialize Frame
		setLayout(null);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);		
		
		//6.Add action
		btn.addActionListener(this);
	}
	//7.Define action
	public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==btn)
        {
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			int res=n1+n2;
			String res1=""+res;
			lb.setText("Result:"+res1);
        }
	}
}
class AdditionSwingDemo
{
    public static void main(String[] args) 
	{
        new AdditionSwing();
	}
}