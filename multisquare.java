import java.awt.*;
class multisquare
{

public static void main(String [] args)
{
  Frame f=new Frame();
  f.setLayout(new GridLayout(2,1));         //
  f.setSize(300,300);
  Panel p1=new Panel();
  p1.setLayout(new GridLayout(4,1));
 
  
  
  Panel p2=new Panel();
  p2.setLayout(new GridLayout(2,1));
   
    
  
  Button b1=new Button("1");
  Button b2=new Button("2");
  p2.add(b1);
  p2.add(b2);
  p1.add(p2);
  f.add(p1);

  
  f.setVisible(true);
  

}
}