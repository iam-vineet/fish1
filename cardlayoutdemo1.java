import java.awt.*;
import java.awt.event.*;

class cardlayoutdemo1  implements ActionListener
{
	
	Frame f;
	CardLayout cl;
	Panel p1;
	Panel p2;
	
	cardlayoutdemo1()
	{
	
		  f=new Frame();
		  //f.setLayout(new GridBagLayout());
		  //f.setLayout(new GridBagLayout());
		  f.setSize(400,500);
			   //GridBagConstraints gbc1=new  GridBagConstraints();
			   //gbc1.fill=GridBagConstraints.BOTH;
				//gbc1.weightx=1.0;
				//gbc1.weighty=1.0;
				
				
		  
		  
		  
		  p1=new Panel();
		  cl=new CardLayout();
		  p1.setLayout(cl);
		  p1.setBackground(Color.yellow);
		 

			 
			  Panel p01=new Panel();
			  
			  p01.setLayout(new GridBagLayout());
					
					GridBagConstraints gbc=new  GridBagConstraints();
					  gbc.gridx=0;
						gbc.gridy=0;
		  
						
						gbc.ipadx=80;
						gbc.ipadx=40;
		  
						gbc.weightx=1.0;
						gbc.weighty=1.0;
					Label l1p01=new Label("Name");
					gbc.gridx=0;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p01.add(l1p01,gbc);
					
					TextField tf1p01=new TextField();
					gbc.gridx=1;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p01.add(tf1p01,gbc);
					
					Label l2p01=new Label("Password");
					gbc.gridx=0;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p01.add(l2p01,gbc);
					
					TextField tf2p01=new TextField();
					gbc.gridx=1;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p01.add(tf2p01,gbc);
					
				p1.add(p01);
				
					
			   Panel p02=new Panel();
				 p02.setLayout(new GridBagLayout());
					
					
					Label l1p02=new Label("pin code");
					gbc.gridx=0;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p02.add(l1p02,gbc);
					
					TextField tf1p02=new TextField();
					gbc.gridx=1;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p02.add(tf1p02,gbc);
					
					Label l2p02=new Label("address");
					gbc.gridx=0;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p02.add(l2p02,gbc);
					
					TextField tf2p02=new TextField();
					gbc.gridx=1;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p02.add(tf2p02,gbc);
			 
			 
			 p1.add(p02);
			 
			   Panel p03=new Panel();
			       p03.setLayout(new GridBagLayout());
					
					
					Label l1p03=new Label("phone");
					gbc.gridx=0;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p03.add(l1p03,gbc);
					
					TextField tf1p03=new TextField();
					gbc.gridx=1;
					gbc.gridy=0;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p03.add(tf1p03,gbc);
					
					Label l2p03=new Label("e-mail");
					gbc.gridx=0;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p03.add(l2p03,gbc);
					
					TextField tf2p03=new TextField();
					gbc.gridx=1;
					gbc.gridy=1;
					gbc.gridwidth=1;
					gbc.gridheight=1;
					p03.add(tf2p03,gbc);
			 
			  p1.add(p03);
			  
			 f.add(p1);

			 
		   p2=new Panel();
		  p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
			//gbc1.gridx=0;
			//   gbc1.gridy=2;
			// gbc1.gridwidth=1;
			// gbc1.gridheight=1;
			 f.add(p2,BorderLayout.SOUTH);
			 
			 Button b1=new Button("Back");
			 Button b2=new Button("Next");
			 
			 b1.addActionListener(this);
			  b2.addActionListener(this);
			 
			 p2.add(b1);
			 p2.add(b2);
			
		  f.setVisible(true);


  }
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		String str=e.getActionCommand();
		if(str.equals("Back"))
		{
			cl.previous(p1);
		}
		else
		{
			cl.next(p1);
		}
	}
	
	public static void main(String [] args)
	{
		
		cardlayoutdemo1  cd=new cardlayoutdemo1();
	}

}
