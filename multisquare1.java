import java.awt.*;
class multisquare1
{
	
	public static void main(String [] args)
	{
  Frame f=new Frame();
  f.setSize(300,200);
  f.setLayout(new GridBagLayout());
  //Button b1=new Button("ok,vineet");
  
  GridBagConstraints gbc=new  GridBagConstraints();
  
  
  
  
  
   //gbc.ipadx=6;
  //gbc.ipadx=4;
  
  gbc.weightx=1.0;
  gbc.weighty=1.0;
  gbc.fill=GridBagConstraints.BOTH;
  
  Button l1=new Button("1");
       gbc.gridx=0;
       gbc.gridy=0;
     gbc.gridwidth=2;
     gbc.gridheight=1;
	 gbc.weightx = 2;	gbc.weighty = 1;
	 f.add(l1,gbc);
	
  Button l2=new Button("2");
   gbc.gridx=0;
       gbc.gridy=1;
     gbc.gridwidth=2;
     gbc.gridheight=1;
	 f.add(l2,gbc);   
  
   
  Button l3=new Button("3");
  gbc.gridx=2;
       gbc.gridy=0;
     gbc.gridwidth=1;
     gbc.gridheight=2;
	 gbc.weightx = 1;	gbc.weighty = 2;
	 f.add(l3,gbc);
 
  Button l4=new Button("4");
  gbc.gridx=3;
       gbc.gridy=0;
	   //gbc.fill=GridBagConstraints.VERTICAL;
     gbc.gridwidth=2;
     gbc.gridheight=2;
	 gbc.weightx = 2;	gbc.weighty = 2;
	 f.add(l4,gbc);
  
  Button l5=new Button("5");
		gbc.gridx=5;
       gbc.gridy=0;
    gbc.weightx = 1;	gbc.weighty = 2;
	gbc.gridwidth=1;
     gbc.gridheight=2;;
	 f.add(l5,gbc);               
 /* 
  Button l6=new Button("6");
  gbc.gridx=0;
       gbc.gridy=2;
     gbc.gridwidth=1;
     gbc.gridheight=2;
	 f.add(l6,gbc);
  
  Button l7=new Button("7");
  gbc.gridx=0;
       gbc.gridy=4;
     gbc.gridwidth=1;
     gbc.gridheight=2;
	 f.add(l7,gbc);
  
  
  Button l8=new Button("8");
  gbc.gridx=1;
       gbc.gridy=2;
     gbc.gridwidth=1;
     gbc.gridheight=1;
	 
  f.add(l8,gbc);
  
  Button l9=new Button("9");
  gbc.gridx=1;
       gbc.gridy=3;
     gbc.gridwidth=1;
     gbc.gridheight=2;
	f.add(l9,gbc);
  
  Button l10=new Button("10");
  gbc.gridx=1;
       gbc.gridy=5;
     gbc.gridwidth=1;
     gbc.gridheight=2;
	 f.add(l10,gbc);
  Button l11=new Button("11");
   gbc.gridx=2;
       gbc.gridy=2;
     gbc.gridwidth=2;
     gbc.gridheight=2;
	  f.add(l11,gbc);
  Button l12=new Button("12");
  gbc.gridx=4;
       gbc.gridy=2;
     gbc.gridwidth=2;
     gbc.gridheight=2;
  f.add(l12,gbc);
   Button l13=new Button("13");
  gbc.gridx=2;
       gbc.gridy=4;
     gbc.gridwidth=1;
     gbc.gridheight=2;
  f.add(l13,gbc);
   Button l14=new Button("14");
  gbc.gridx=3;
       gbc.gridy=4;
     gbc.gridwidth=2;
     gbc.gridheight=2;
  f.add(l14,gbc);
   Button l15=new Button("15");
  gbc.gridx=5;
       gbc.gridy=4;
     gbc.gridwidth=1;
     gbc.gridheight=2;
  f.add(l15,gbc);
  
  */
  f.setVisible(true);
  
  
  
	}
  
  


}