import java.util.Scanner;
public class Scanner{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num = sc.nextInt();
	System.out.println("The no. you entered is :"+num);
	sc.close();	
	}
	
}