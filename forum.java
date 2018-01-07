import java.awt.*;
class forum
{
	
	public static void main(String [] args)
	{
			Frame f=new Frame();
			f.setSize(500,300);
			f.setLayout(new GridBagLayout());
			
			GridBagConstraints gbc=new  GridBagConstraints();
			  gbc.gridx=0;
				gbc.gridy=0;
  
				
				gbc.ipadx=80;
				gbc.ipadx=40;
  
				gbc.weightx=1.0;
				gbc.weighty=1.0;
			Label l1=new Label("Name");
			gbc.gridx=0;
			gbc.gridy=0;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			f.add(l1,gbc);
			
			TextField tf1=new TextField();
			gbc.gridx=1;
			gbc.gridy=0;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			f.add(tf1,gbc);
			
			Label l2=new Label("Password");
			gbc.gridx=0;
			gbc.gridy=1;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			f.add(l2,gbc);
			
			TextField tf2=new TextField();
			gbc.gridx=1;
			gbc.gridy=1;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			f.add(tf2,gbc);
			
			Button et1=new Button("ok");
			gbc.gridx=0;
			gbc.gridy=2;
			gbc.gridwidth=2;
			gbc.gridheight=1;
			f.add(et1,gbc);
	
	
	    f.setVisible(true);
	}

	
}