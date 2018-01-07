import java.util.regex.*;
class RegexReplace
{
public static void main(String [] args)
{
    String Result=null, str="hfgd php sdhsd phph  oshf php";
  Pattern p=Pattern.compile("php");
  Matcher m=p.matcher(str);
  if(m.find())
  {
     Result = m.replaceAll("java");
 System.out.println(Result);
  }
  
 
}
}