import java.awt.*;
public class AwtExample1
{  
	public AwtExample1()  
	{  
		Frame f = new Frame();  
		Button btn=new Button("Hello World");  
		btn.setBounds(80, 80, 100, 50);  
		f.add(btn); 
		f.setSize(300, 250);        
		f.setTitle("AWT Example");
		f.setLayout(null);  
		f.setVisible(true); 
		f.setBackground(Color.blue);		
	}  
	public static void main(String[] args) 
	{  
		AwtExample awt = new AwtExample();  
	}  
} 
