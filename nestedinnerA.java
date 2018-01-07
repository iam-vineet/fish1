class nestedinnerA
{


	class  nestedinnerB
	{
			class  nestedinnerC
			{
			public void m1()
				{
   
					System.out.println("hi,vineet");
	  
				}
			}
	}

public static void main(String [] args)
{

(new  nestedinnerA().new  nestedinnerB().new  nestedinnerC()).m1();

}

}