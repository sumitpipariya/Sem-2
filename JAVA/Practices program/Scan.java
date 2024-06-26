import java.util.Scanner;
public class Scan{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num1 = sc.nextInt();
	System.out.println("You entered is :"+num1);
	int num2 = sc.nextInt();
	System.out.println("Enter next number :"+num2);
	sc.close();	
	}
	
}