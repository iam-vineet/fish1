import java.awt.*;
import java.awt.event.*;


class mousedemo implements MouseMotionListener  
{
     Frame f;
	 Panel p;
	 Label l1,l2;
	 TextField t1,t2;


   mousedemo()
   {
     f=new Frame();
	f.setSize(400,300);
	f.setBackground(Color.red);
	f.addMouseMotionListener(this);
	
	 p=new Panel();
	
	 l1=new Label("x");
	 t1=new TextField();	
	 l2=new Label("y");
	 t2=new TextField();
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);

  f.add(p,BorderLayout.SOUTH);
  f.setVisible(true);
  windowcloser wc=new windowcloser();
		f.addWindowListener(wc);
}


public void mouseMoved(MouseEvent e)
{
int x,y;
x=e.getX();
y=e.getY();
t1.setText(x+"");
t2.setText(y+"");

}

public void mouseDragged(MouseEvent e)
{}

public static void main(String [] args)
{
    mousedemo md=new mousedemo();
}


  
	}
	
	

