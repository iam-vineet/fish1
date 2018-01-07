
import java.awt.*;
import java.awt.event.*;

public class mycalculator implements ActionListener
{
  int x,y;
  TextField tf;
  String btn="";
  int flag=0;
  
				mycalculator()
				{
				  Frame f=new Frame();
				  f.setTitle("Calculator");
				  f.setSize(300,400);
				  f.setResizable(false);
				  f.setLayout(new GridLayout(5,1,5,5));
				  f.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
					windowcloser wc=new windowcloser();
					f.addWindowListener(wc);
				Color c=new Color(23,18,35);
				f.setBackground(c);
				 
				  tf=new TextField();
				  tf.setFont(new Font("arial",Font.ITALIC,20));
				  tf.setBackground(Color.black);
				  tf.setForeground(Color.white);
																// tf.setLayout(new FlowLayout(FlowLayout.RIGHT));
				  f.add(tf);
				  
				  Panel p1=new Panel();
				    p1.setLayout(new GridLayout(1,4,5,5));     // new GridLayout(1,4,5,5)
				     Button l1=new Button("1");
				     l1.addActionListener(this);
				     Button l2=new Button("2");
				     l2.addActionListener(this);
					 Button l3=new Button("3");
					 l3.addActionListener(this);
					 Button l4=new Button("+");
					 l4.addActionListener(this);
				  p1.add(l1);
				  p1.add(l2);
				  p1.add(l3);
				  p1.add(l4);
				  f.add(p1);
				   
				   Panel p2=new Panel();
				   p2.setLayout(new GridLayout(1,4,5,5));
				     Button l5=new Button("4");
				     l5.addActionListener(this);
				     Button l6=new Button("5");
				     l6.addActionListener(this);
					 Button l7=new Button("6");
					 l7.addActionListener(this);
					 Button l8=new Button("-");
					 l8.addActionListener(this);
				  p2.add(l5);
				  p2.add(l6);
				  p2.add(l7);
				  p2.add(l8);
				  f.add(p2);
				   Panel p3=new Panel();
				   p3.setLayout(new GridLayout(1,4,5,5));
				     Button l9=new Button("7");
				     l9.addActionListener(this);
				     Button l10=new Button("8");
				     l10.addActionListener(this);
					 Button l11=new Button("9");
					 l11.addActionListener(this);
					 Button l12=new Button("*");
					 l12.addActionListener(this);
				  p3.add(l9);
				  p3.add(l10);
				  p3.add(l11);
				  p3.add(l12);
				  f.add(p3);
				   Panel p4=new Panel();
				   p4.setLayout(new GridLayout(1,4,5,5));
				     Button l13=new Button("c");
				     l13.addActionListener(this);
				     Button l14=new Button("0");
				     l14.addActionListener(this);
					 Button l15=new Button("/");
					 l15.addActionListener(this);
					 Button l16=new Button("=");
					 l16.addActionListener(this);
				  p4.add(l13);
				  p4.add(l14);
				  p4.add(l15);
				  p4.add(l16);
				  f.add(p4);
				  
				 
			f.setVisible(true);
			  
				}
  
   public void actionPerformed(ActionEvent e)
   {
	   
	   
	  String str=e.getActionCommand();
	  
            if(str.equals("1"))
             {
				 flag=0;
				 tf.setText(tf.getText()+str);
			 }	
			if(str.equals("2"))
             {
				 flag=0;
				 tf.setText(tf.getText()+str);
			 }
			 
			if(str.equals("3"))
             {
				 flag=0;
				 tf.setText(tf.getText()+str);
			 }
			if(str.equals("4"))
						 {
							 flag=0;
							 tf.setText(tf.getText()+str);
						 }
			if(str.equals("5"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }
			if(str.equals("6"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }
			if(str.equals("7"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }
			if(str.equals("8"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }
			if(str.equals("9"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }	
			if(str.equals("0"))
						 {flag=0;
							 tf.setText(tf.getText()+str);
						 }	

       						 
				 		 
		 if(str.equals("+"))
             {
				 flag++;
				 if(flag>1)
				 {
					 btn=str;
					 if (str.equals("+"))
					 {
					 tf.setText(0+"");
					 }

					 if (str.equals("*"))
					 {
					 tf.setText(1+"");
					 }
					 if (str.equals("-"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("/"))
					 {
					 tf.setText(1+"");
					 } 
				 }
				 if(btn.equals("+"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x+y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("-"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x-y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("*"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x*y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("/"))
				{
					y= Integer.parseInt(tf.getText());
						try
						{						
						int z=x/y;
						 x=z;
						}catch(Exception ee)
						{
						tf.setText(0+"");
						}
						btn="";
				}
				if(btn.equals(""))
				{
				 btn=str;
				x= Integer.parseInt(tf.getText());
				tf.setText("");
				}
			 }
		if(str.equals("-"))
             {
				 flag++;
				 if(flag>1)
				 {
					 btn=str;
					 if (str.equals("+"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("*"))
					 {
					 tf.setText(1+"");
					 }
					 if (str.equals("-"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("/"))
					 {
					 tf.setText(1+"");
					 } 
				 }
				 if(btn.equals("+"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x+y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("-"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x-y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("*"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x*y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("/"))
				{
					y= Integer.parseInt(tf.getText());
						try
						{						
						int z=x/y;
						 x=z;
						}catch(Exception ee)
						{
						tf.setText(0+"");
						}
						btn="";
				}
				 if(btn.equals(""))
				{
				 btn=str;
				x= Integer.parseInt(tf.getText());
				tf.setText("");
				}
			 }
		if(str.equals("*"))
             {
				 flag++;
				 if(flag>1)
				 {
					 btn=str;
					 if (str.equals("+"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("*"))
					 {
					 tf.setText(1+"");
					 }
					 if (str.equals("-"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("/"))
					 {
					 tf.setText(1+"");
					 } 
				 }
				 if(btn.equals("+"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x+y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("-"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x-y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("*"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x*y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("/"))
				{
					y= Integer.parseInt(tf.getText());
						try
						{						
						int z=x/y;
						 x=z;
						}catch(Exception ee)
						{
						tf.setText(0+"");
						}
						btn="";
				}
				if(btn.equals(""))
				{
				 btn=str;
				x= Integer.parseInt(tf.getText());
				tf.setText("");
				}
			 }
		if(str.equals("/"))
             {
				 flag++;
				 if(flag>1)
				 {
					 btn=str;
					 if (str.equals("+"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("*"))
					 {
					 tf.setText(1+"");
					 }
					 if (str.equals("-"))
					 {
					 tf.setText(0+"");
					 }
					 if (str.equals("/"))
					 {
					 tf.setText(1+"");
					 } 
				 } 
				 if(btn.equals("+"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x+y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("-"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x-y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("*"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x*y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("/"))
				{
					y= Integer.parseInt(tf.getText());
						try
						{						
						int z=x/y;
						 x=z;
						}catch(Exception ee)
						{
						tf.setText(0+"");
						}
						btn="";
				}
				 if(btn.equals(""))
				{
				 btn=str;
				x= Integer.parseInt(tf.getText());
				tf.setText("");
				}
			 }
		    if(str.equals("="))
             {
				if(btn.equals("+"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x+y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("-"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x-y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("*"))
				{
					y= Integer.parseInt(tf.getText());
					int z=x*y;
					tf.setText(z+"");
					x=z;
					btn="";
				}
				if(btn.equals("/"))
				{
					y= Integer.parseInt(tf.getText());
						try
						{						
						int z=x/y;
						 x=z;
						}catch(Exception ee)
						{
						tf.setText(0+"");
						}
						btn="";
				}  
			 }
			 if(str.equals("c"))
				{
					x=y=0;
					btn="";
					tf.setText("");
				}
			 
   }
  public static void main(String [] args)
  {
	  mycalculator cd=new mycalculator();
  }
                    
}

                