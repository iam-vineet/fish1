import java.awt.*;
import java.awt.event.*;
class myframe  
{
     static	int x1=0,y1=0;
     static 	int x2=0,y2=0;
	
	
 
  
  public static void main(String [] args)

{
   
  mylistener1 ml1=new  mylistener1();
  	ml1.addMouseMotionListener(ml1);
	ml1.addComponentListener(ml1);
  ml1.setSize(400,500);
  windowcloser wc=new windowcloser();
		ml1.addWindowListener(wc);
  ml1.setVisible(true);
  
  

}
}


class mylistener1 extends Frame implements MouseMotionListener,ComponentListener 
{

 int xc1=0,yc1=0, xc2=0,yc2=499, xc3=399,yc3=499, xc4=399,yc4=0;
int x2,y2;
public void mouseMoved(MouseEvent e)
{


x2=e.getX();
y2=e.getY();

Graphics g=getGraphics();
  g.setColor(Color.red);
  g.drawLine(x2,y2,xc1,yc1);
  g.setColor(Color.green);
  g.drawLine(x2,y2,xc2,yc2);
  g.setColor(Color.yellow);
  g.drawLine(x2,y2,xc3,yc3);
  g.setColor(Color.blue);
  g.drawLine(x2,y2,xc4,yc4);

}


public void mouseDragged(MouseEvent e)
{}

public void componentResized(ComponentEvent e0)
{
	Dimension newsize=e0.getComponent().getBounds().getSize();
	xc3=xc4=newsize.width;
	yc2=yc3=newsize.height;
	
}
public void componentHidden(ComponentEvent e1)
{}
public void componentMoved(ComponentEvent e2)
{}
public void componentShown(ComponentEvent e3)
{}



}





