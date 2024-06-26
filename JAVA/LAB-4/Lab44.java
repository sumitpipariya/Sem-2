import java.util.Scanner;
public class Lab44{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int[] a=new int[4];
		System.out.println("Enter the Element : ");

		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Revers Array is :");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}