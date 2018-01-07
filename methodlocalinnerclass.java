


class methodlocalinnerclass
{

    public void m1()
	{
	   int z=50;
		class  inner
			{
			
			   public void sum(int x,int y)
				{
   
					System.out.println(x+y);
	                   System.out.println(z);
				}
				
			}
			inner i=new inner();
				i.sum(10,10);
				i.sum(20,20);
				i.sum(30,30);
	}

public static void main(String [] args)
{

 methodlocalinnerclass m=new  methodlocalinnerclass();
 m.m1();

}

}
