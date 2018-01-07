import java.awt.*;
import java.applet.*;
class  awt1demo
{
public static void main(String [] args) throws Exception
{
  Frame f=new Frame();
  f.setForeground(Color.cyan);
  f.setSize(400,300);
  f.setTitle("demo program");
  f.setLayout(new FlowLayout());
  
  
   
  Label l=new Label("name",2);
  Font fnt=new Font("Arial",Font.BOLD,30);
  l.setFont(fnt);
  f.add(l);
  /*
  Scrollbar sb=new Scrollbar(Scrollbar.HORIZONTAL,5,5,5,600);
   f.add(sb);
  TextField t=new TextField(20);
  f.add(t);
  Button b1=new Button("ok");
  f.add(b1);
   Button b2=new Button("cancel");
  f.add(b2);
  
  
   
   
  Checkbox c1=new Checkbox("java",true);
  Checkbox c2=new Checkbox("pythan",false);
  Checkbox c3=new Checkbox("php",false);
  f.add(c1);
  f.add(c2);
  f.add(c3);
  
  CheckboxGroup cg=new CheckboxGroup();
   Checkbox c4=new Checkbox("java",true,cg);
  Checkbox c5=new Checkbox("pythan",false,cg);
  Checkbox c6=new Checkbox("php",false,cg);
  f.add(c4);
  f.add(c5);
  f.add(c6);
  
  Choice ch=new Choice();
  ch.add("php");
  ch.add("java");
  ch.add("BigData");
  f.add(ch);
  
  
  List ls=new List(5,true);
  ls.add("java");
   ls.add("php");
    ls.add("BigData");
	f.add(ls);
	
Canvas cs=new Canvas();
cs.setSize(100,100);
cs.setBackground(Color.red);
f.add(cs); 


  
 */
  
  
  f.setVisible(true);
 
  }

}