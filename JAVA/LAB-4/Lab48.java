public class Lab48{

	public static void main(String[] args) {
		int i,j;

		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(i=2;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.print("\n");
		}

	}
}