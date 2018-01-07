import java.awt.*;
import java.awt.event.*;
class multiscroll
{

static int i,j,k;
static TextField t1,t2,t3;
static Scrollbar s1,s2,s3;
static Frame f;
static Color cl;

public static void main(String [] args)
{
    f=new Frame();
             
     f.setSize(300,300);
	
 // 
	 Panel p1=new Panel();
	 p1.setLayout(new BorderLayout()); 
	
	 scrolladjustment sl=new scrolladjustment();
	 
	  s1=new Scrollbar(Scrollbar.VERTICAL,180,0,0,256);
	  s2=new Scrollbar(Scrollbar.VERTICAL,50,0,0,256);
	  s3=new Scrollbar(Scrollbar.VERTICAL,150,0,0,256);
	    i=s1.getValue();
		j=s2.getValue();
		k=s3.getValue();
		cl=new Color(i,j,k);
		f.setBackground(cl);
			
	 //s1.setUnitIncrement(2);
	// s1.setBlockIncrement(15);
	 s1.addAdjustmentListener(sl);
	 // s2.setUnitIncrement(2);
	 //s2.setBlockIncrement(15);
	 s2.addAdjustmentListener(sl);
	 // s3.setUnitIncrement(2);
	 //s3.setBlockIncrement(15);
	 s3.addAdjustmentListener(sl);
	 
	 p1.setLayout(new GridLayout(1,3,2,2));
	 p1.add(s1);
	 p1.add(s2);
	 p1.add(s3);
	 
	 f.add(p1,BorderLayout.EAST);
	 
	 
	 
	 //System.out.println("First scrollValue = "+s1.getValue()+"\n Second scrollValue ="+s2.getValue()+"\n Third scrollValue ="+s3.getValue());
	 
	 /*f.add(p0,BorderLayout.EAST);
	 f.add(p1,BorderLayout.EAST);
	 
	 //f.add(s2);
	 //f.add(s3);   */
	 
	Panel p2=new Panel();
		  p2.setLayout(new GridLayout(1,6));
		  p2.setBackground(Color.yellow);
		  f.add(p2,BorderLayout.SOUTH);
		  
		Label l1=new Label("FIRST");
		 t1=new TextField();
		Label l2=new Label("SECOND");
		 t2=new TextField();
		Label l3=new Label("THIRD");
		 t3=new TextField();
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		
		t1.setText(i+"");
		t2.setText(j+"");
		t3.setText(k+"");

		
	 	 
	 f.setVisible(true);
}

}


class scrolladjustment implements AdjustmentListener
{
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		multiscroll.i=multiscroll.s1.getValue();
		multiscroll.j=multiscroll.s2.getValue();
		multiscroll.k=multiscroll.s3.getValue();
		
		multiscroll.t1.setText(multiscroll.i+"");
		multiscroll.t2.setText(multiscroll.j+"");
		multiscroll.t3.setText(multiscroll.k+"");
		multiscroll.f.setBackground(multiscroll.cl); 
		
		multiscroll.cl=new Color(multiscroll.i,multiscroll.j,multiscroll.k);
		multiscroll.f.setBackground(multiscroll.cl);
		
		
	}
}

