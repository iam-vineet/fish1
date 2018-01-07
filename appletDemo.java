import java.awt.*;
import java.applet.*;
//<applet code="appletDemo.class" width="600" height="600"></applet> 
public class appletDemo extends Applet
{
  public void init()
  
  {
  Label l=new Label("Enter Name",Label.LEFT);
    add(l);
	TextField tf=new TextField();
	add(tf);
	Button bt=new Button("click");
	add(bt);
	TextArea ta=new TextArea("enter your  comments",10,10,TextArea.SCROLLBARS_BOTH);
	add(ta);
  
  }

}




