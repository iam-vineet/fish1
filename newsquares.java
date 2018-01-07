import java.awt.*;
class newsquares
{

public static void main(String [] args)
{
   Frame f=new Frame();
   f.setSize(500,400);
   Button l1=new Button("1");
   Button l2=new Button("2");
   
   f.add(l1,BorderLayout.WEST);
   f.add(l2,BorderLayout.EAST);
   f.setVisible(true);

}

}