class outerclass
{

int x=10;
static int y=20;

class  inner
{
   public void m1()
   {
   
      System.out.println(x);
	  System.out.println(y);
   }
}

public static void main(String [] args)
{
outerclass o=new outerclass();
outerclass.inner i=o.new inner();
i.m1();

}

}