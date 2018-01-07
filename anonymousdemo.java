class pashu

{
 public void pashuname()
 {
    System.out.println("lion");
 }
}

class anonymousdemo
{
    public static void main(String [] args)
	{
	  pashu p=new pashu();
	  p.pashuname();
	  
	  pashu p1=new pashu()
	  {
	       public void pashuname()
			{
				System.out.println("dog");
			}
	  };
	  p1.pashuname();
	  
	  System.out.println(p.getClass().getName());
	   System.out.println(p1.getClass().getName());
	  
	  
	}

}