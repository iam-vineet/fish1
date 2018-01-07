import java.awt.*;
import java.awt.event.*;
class eventhandlingdemo implements ActionListener
{
	Button b;
	Frame f;
	TextField t;
	eventhandlingdemo()
	{
		
		 f=new Frame();
		f.setLayout(new FlowLayout());
	  f.setSize(400,400);
	   b=new Button("click");
	   t=new TextField(20);
	   f.add(t);
	  b.addActionListener(this);
	  f.add(b);
	  f.setVisible(true);
		
	}
	
	
	
	 public void actionPerformed(ActionEvent e)
   {
       t.setText("hi,vineet");
   }

    public static void main(String [] args)
	{
	   eventhandlingdemo em=new eventhandlingdemo(); 
	}
}

