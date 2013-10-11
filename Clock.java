import java.util.*;
class Clock 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter your hours: ");
		int h = ss.nextInt();

		System.out.println("Enter your minits: ");
		int m = ss.nextInt();

		System.out.println("Enter your seconds: ");
		int s = ss.nextInt();
		
		for( ;h<=23;h++)
		{
				
			
				for( ;m<=59;m++)
				{
				
					for( ;s<=59;s++)
						{
				
							System.out.println(h+":"+m+":"+s);
							Thread.sleep(1000);
					
						}
						if(s==60) s=0;
				}
		
				if(m==60) m=0;

				if(h==23) h=-1;
		  }
		
		
		
	  }
}
