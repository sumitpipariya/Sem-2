import java.util.Scanner;
public class Lab23{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c =sc.next().charAt(0);
		switch(c)
		{
		case '+':
			System.out.println("a+b :"+(a+b));
			break;
		case '-':
			System.out.println("a-b :"+(a-b));
			break;

		case '*':
			System.out.println("a*b :"+(a*b));
			break;

		case '/':
			System.out.println("a/b :"+(a/b));
			break;

		}

	}
}