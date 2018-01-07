import java.awt.*;
class javaquiz
{
  public static void main(String [] args)
  {
  
   Frame f=new Frame();
   f.setSize(300,400);
   f.setLayout(new GridLayout(6,1,0,5));
   Label l=new Label("Q.1  Capital Of Rajasthan");
   f.add(l);
   Panel p1=new Panel();
   p1.setLayout(new FlowLayout(FlowLayout.LEFT));
   Label l1=new Label("a.");
   Checkbox c1=new Checkbox("ajmer");
   p1.add(l1);
   p1.add(c1);
   f.add(p1);
   
   
   Panel p2=new Panel();
   p2.setLayout(new FlowLayout(FlowLayout.LEFT));
   Label l2=new Label("b.");
   Checkbox c2=new Checkbox("kota");
   p2.add(l2);
   p2.add(c2);
   f.add(p2);
   
   Panel p3=new Panel();
   p3.setLayout(new FlowLayout(FlowLayout.LEFT));
   Label l3=new Label("c.");
   Checkbox c3=new Checkbox("jaipur");
   p3.add(l3);
   p3.add(c3);
   f.add(p3);
   
   
   Panel p4=new Panel();
   p4.setLayout(new FlowLayout(FlowLayout.LEFT));
   Label l4=new Label("d.");
   Checkbox c4=new Checkbox("alwar");
   p4.add(l4);
   p4.add(c4);
   f.add(p4);
   
   Panel p5=new Panel();
   p5.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
   Button b1=new Button("prev");
   Button b2=new Button("next");
   p5.add(b1);
   p5.add(b2);
   f.add(p5);
   f.setVisible(true);
  
  }
}