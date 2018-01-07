import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Editor implements ActionListener
{

static  Frame f;
 Frame f1;
TextArea tr1;
windowcloser wc;
 MenuItem ext;
Editor()
{
    f=new Frame();
    f.setSize(800,600);
	f.setTitle("Editor++");
	f.setIconImage(Toolkit.getDefaultToolkit().getImage("edit1.png"));
	wc=new windowcloser();
	f.addWindowListener(wc);
	
	tr1=new TextArea();
		f.add(tr1);
	

	
	Panel p=new Panel();
	p.setLayout(new GridLayout(1,1));
	p.setBackground(Color.blue);
	
	 MenuBar mb=new MenuBar();
	// mb.setBackground(Color.black);
	// mb.setForeground(Color.white);
	 
	 Menu m1=new Menu("File");
	 Menu m2=new Menu("Edit");
	 Menu m3=new Menu("Help");
	 mb.add(m1);
	 mb.add(m2);
	 mb.add(m3);
	 
	 MenuItem nw=new MenuItem("New");
	 MenuItem opn=new MenuItem("Open");
	 MenuItem sv=new MenuItem("Save");
	 MenuItem svas=new MenuItem("Save as");
	  ext=new MenuItem("Exit");
	 
	 
	 MenuItem fnd=new MenuItem("Find");
	 MenuItem fndrplc=new MenuItem("Find & Replace");
	 
	 
	 m1.add(nw);
	 m1.add(opn);
	 m1.add(sv);
	 m1.add(svas);
	 m1.addSeparator();
	 m1.add(ext);
	f.setMenuBar(mb);
	
	m2.add(fnd);
	m2.add(fndrplc);
	
	nw.addActionListener(this);
	opn.addActionListener(this);
	ext.addActionListener(this);
	sv.addActionListener(this);
	
     Panel p2=new Panel();
	 p2.setBackground(Color.black);
	
	f.add(p,BorderLayout.NORTH);
	f.add(p2,BorderLayout.SOUTH);
	f.setVisible(true);
}

	public void actionPerformed(ActionEvent e) 
{
	
	String str=e.getActionCommand();
	if(str.equals("New"))
	{   
        
		tr1=new TextArea();
		f.add(tr1);
	}
	if(str.equals("Open"))
	{   
            FileDialog fdopn=new FileDialog(f,"select",FileDialog.LOAD);
			fdopn.setVisible(true);
			 String path,name;
			 name=fdopn.getFile();
			 path=fdopn.getDirectory();
			 System.out.println("u have selected file name :  "+name+" in folder"+path);
 
 
			   File f1=new File( path, name);



						  /*
							f1=new Frame();
							windowcloser wc1=    new windowcloser();
							f1.addWindowListener(wc1);
							f1.setSize(300,200);
							 f1.setResizable(false);
							f1.setVisible(true);
							*/
		
	}
	if(str.equals("Save"))
	{   
            FileDialog fdsv=new FileDialog(f,"select",FileDialog.SAVE);
			fdsv.setVisible(true);
			 String path,name;
			 name=fdsv.getFile();
			 path=fdsv.getDirectory();
			// System.out.println("u have selected file name :  "+name+" in folder"+path);
 
 
			   File f1=new File( path, name);
			   try{
			     f1.createNewFile();
			   }catch( IOException ec){}
			   
			   String st=tr1.getText();
			   //System.out.println(st);
			   
			 try {
            
            File newTextFile = new File(path,name);

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(st);
            fw.close();

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }



						  /*
							f1=new Frame();
							windowcloser wc1=    new windowcloser();
							f1.addWindowListener(wc1);
							f1.setSize(300,200);
							 f1.setResizable(false);
							f1.setVisible(true);
							*/
		
	}
	if(str.equals("Exit"))
	{   
        //CloseListener cl=new CloseListener();
		//ext.addActionListener(cl);
		//.addWindowListener(wc);
		System.exit(0);
	
	}
	
	
	
}
public static void main(String [] args) throws IOException
	{
		
		Editor ed=new Editor();
		
	}

}
 class CloseListener   implements ActionListener{
    //@Override
    public void actionPerformed(ActionEvent e) {
        //DO SOMETHING
		
	
       
    }
}