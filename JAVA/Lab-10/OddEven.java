import java.util.Scanner;

public class OddEven{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int no,power;
		no = sc.nextInt();
		power = sc.nextInt();
		int a;
		if(power == 0){
			a = 1;
		}
		else{
			a = no;
				for (int i=1 ;i<power;i++) {
				a *= no;
			}
		}
		
		System.out.print(a);
		


	}
}