import java.util.regex.*;
import java.io.*;
class mobileMatch
{
public static void main(String [] args) throws Exception
{
    PrintWriter pw=new PrintWriter("output.txt");
  Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
  
  BufferedReader br=new BufferedReader(new FileReader("input.txt"));
  String str=br.readLine();
  while(str!=null)
  {
	    Matcher m=p.matcher(str);
  while(m.find() )
  {

    pw.println(m.group());
    
     
  }
  
 
  str=br.readLine();
  
  }
  
   pw.flush();
}
}