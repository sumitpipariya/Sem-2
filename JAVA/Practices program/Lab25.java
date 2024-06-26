import java.util.Scanner;
public class Lab25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit :");
		int a= sc.nextInt();	
		double b =((a-32)*(5.0/9.0));
		System.out.println(b);
	}
}
