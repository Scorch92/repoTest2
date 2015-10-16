public class Main
{
	public static void main(String[] args)
	{
		factoI(10);
	}
	
	public static void factoI(int n)
	{
		int i;
		int nbr = 2;
		
		if(n == 0)
		{
			nbr = 1;
		}
		else
		{
			for(i = 1; i < n; i++)
			{
				nbr = nbr * 2;
			}
		}
		
		System.out.println(nbr);
	}
	
	public void factoR(int n)
	{
		
	}
}
