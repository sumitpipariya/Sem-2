import java.util.Scanner;
public class Lab43{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a,sum=0;
		int[] arr = new int[4];
		System.out.println("Enter the Element :");
		for(i=0;i<arr.length;i++)
		{	
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg=(Double)(sum/4.0);
		System.out.println("Average is :"+avg);

	}
}
	
