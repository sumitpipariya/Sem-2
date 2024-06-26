import java.util.Scanner;

public class a{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n,a=0;
		System.out.println("Enter the number :");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				a++;
			}
		}
		if(a==2){
			System.out.println(n +" is Prime");
		}
		else{
			System.out.println(n +" is Not Prime");
		}


	}
}