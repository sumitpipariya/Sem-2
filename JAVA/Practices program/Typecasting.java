import.java.util.Scanner
public class Typecasting
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mark:");
		int num1 = sc.nextInt();
		System.out.println("Enter the mark :"+num1);
		int num2 = sc.nextInt();
		System.out.println("Enter the mark:"+num2);
		int num3 = sc.nextInt();
		System.out.println("Enter the mark :"+num3);
		double avg = ((double(num1)+num2+num3)/300)*100;
		System.out.println("Averge is :"+avg);
		sc.close();	
	}
}