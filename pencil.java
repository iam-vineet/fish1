import java.awt.*;
import java.awt.event.*;
class pencil extends Frame implements MouseMotionListener,MouseListener
{
	int x1;
	int y1;
	int x2;
	int y2;
	 
	Graphics g;
//pencil p;
pencil()
{
  // p=new pencil();
  this.setSize(800,600);
  // cn=new Canvas();
  //cn.setSize(400,400);
  //this.add(cn);
   this.setTitle("Paint");
    windowcloser wc=new windowcloser();
	this.setIconImage(Toolkit.getDefaultToolkit().getImage("brush.jpg"));
		this.addWindowListener(wc);
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.setVisible(true);		
}
public void mouseDragged(MouseEvent e)
{

g=getGraphics();
 x2=e.getX();
  y2=e.getY();
    
   g.setColor(Color.red);
   g.drawLine(x1,y1,x2,y2);	
   x1=x2;
   y1=y2;
   


}
public void mouseMoved(MouseEvent e)
{
x1=e.getX();
	 y1=e.getY();
}

public  void mouseClicked(MouseEvent e)
{
		g=getGraphics();
	x1=e.getX();
	 y1=e.getY();
	 // g.drawLine(x1,y1,x1,y1);	
}
public  void mouseEntered(MouseEvent e)
{}
public  void mouseExited(MouseEvent e)
{}
public  void mousePressed(MouseEvent e)
{
}
public  void mouseReleased(MouseEvent e)
{	
}

public static void main(String [] args)
{
new pencil();
}
}