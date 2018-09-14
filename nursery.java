public class nursery {
	public static void main(String[] args)
	{
		int N=99;
		for(int i=N;i>1;i--)
		{
			System.out.print(i+" bottles of beer on the wall,"+i+" bottles of beer.");
			System.out.print("Take one down.");
			System.out.print("Pass it around.");
			if(i==2)
				System.out.println(i-1+" bottle of beer on the wall.");
			else
				System.out.println(i-1+" bottles of beer on the wall.");
		}
		System.out.println("1 bottle of beer on the wall,1 bottle of beer.Take one down.Pass it around.No more bottles of beer on the wall!");
	}
}
