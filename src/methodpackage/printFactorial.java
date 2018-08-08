package methodpackage;

public class printFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactorialData(5);
	}
	
	/*public static void printFactorialData(int n)
	{
		int i, fact=1;
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("Sub-factorial: "+fact);
		}
		System.out.println("Final factorial: "+fact);
	}*/
	
	public static void printFactorialData(int n)
	{
		int i, fact=1;
		for (i=n;i>0;i--)
		{
			fact=fact*i;
			System.out.println("Sub-factorial: "+fact);
		}
		System.out.println("Final factorial: "+fact);
	}

}
