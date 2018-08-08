package methodpackage;

public class printArrayBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignData(7);
		/*printData();*/
	}


	public static synchronized void assignData( int s) //synchronized is used if access to this method needs to be restricted to just 1 thread at a time
	{
		int a[];
		a= new int [s];
		for (int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		printData(a);
	}

	public static void printData(int a[])
	{

		for (int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]);
			System.out.print("\t");
		}
	}

}
