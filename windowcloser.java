import java.awt.*;
import java.awt.event.*;


class colordemo  
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(400,300);
		Color c=new Color(150,0,245);
		f.setBackground(c);
		f.setVisible(true);	
		
		windowcloser wc=new windowcloser();
		f.addWindowListener(wc);
	}	
}


public class windowcloser extends WindowAdapter 
{
	

public void windowClosing(WindowEvent e1)
{
    //Window w=e1.getWindow();
	//w.setVisible(false);
	//w.dispose();
	System.exit(1);

}	

}
 