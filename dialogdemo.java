import java.awt.*;
import java.io.*;


class dialogdemo
{

 public static void main(String [] args) throws IOException
 {
 Frame f=new Frame();
 f.setSize(200,300);
 //f.setVisible(true);
 
 FileDialog fd=new FileDialog(f,"select",FileDialog.LOAD);
 fd.setVisible(true);
 String path,name;
 name=fd.getFile();
 path=fd.getDirectory();
 System.out.println("u have selected file name :  "+name+" in folder"+path);
 
 
 File f1=new File( path, name);
 
 //f1.createNewFile();
 
 }

}