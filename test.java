class test
{
 int z=50;
    public void m1()
	{
	 
		class  testinner
			{
			
			   public void m()
				{
   
				
	                   System.out.println(z);
				}
				
			}
			testinner i=new testinner()
				i.m();
				
	}

public static void main(String [] args)
{

test t=new  test();
 t.m1();

}

}
