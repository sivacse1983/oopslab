import java.awt.*;
import java.awt.event.*;
public class AwtExample 
{  
	public AwtExample()  
	{  
		Frame f = new Frame();  
		Button btn1=new Button("Hello World");  
		Button btn2=new Button("Welcome");  
		btn1.setBounds(80, 80, 100, 50); 
		btn2.setBounds(80, 80, 100, 50);  
		f.add(btn1); 
		f.add(btn2);
		f.setSize(300, 250);        
		f.setTitle("AWT Example");
		f.setLayout(new FlowLayout());  
		f.setVisible(true); 
		f.setBackground(Color.blue);
		
		//Closing window
		f.addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent we) 
			{
                System.exit(0);
            }
        });		
	}  
	public static void main(String[] args) 
	{  
		AwtExample awt = new AwtExample();  
	}  
}  