import java.awt.*;

class cardlayoutdemo 
{
	public static void main(String [] args)
	{
  Frame f=new Frame();
  f.setLayout(new GridBagLayout());
   GridBagConstraints gbc1=new  GridBagConstraints();
   gbc1.fill=GridBagConstraints.BOTH;
  gbc1.weightx=1.0;
  gbc1.weighty=1.0;
  f.setSize(400,600);
  
  
  Panel p1=new Panel();
  p1.setBackground(Color.green);
  gbc1.gridx=0;
       gbc1.gridy=0;
     gbc1.gridwidth=1;
     gbc1.gridheight=2;
	 f.add(p1,gbc1);
  
  Panel p2=new Panel();
    gbc1.gridx=0;
       gbc1.gridy=2;
     gbc1.gridwidth=1;
     gbc1.gridheight=10;
	 f.add(p2,gbc1);

  f.setVisible(true);
	}

}