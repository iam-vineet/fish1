import java.util.regex.*;
class Regex
{
public static void main(String [] args)
{
int count=0;
  Pattern p=Pattern.compile("java");
  Matcher m=p.matcher("sdfjavasdfghjjavartyuijava");
  while(m.find())
  {
  count++;
    System.out.print(m.start()+"  ");
    System.out.println(m.group()+"  ");

  }
  
  System.out.println(count);
}
}