import java.util.Scanner;

	class RealAndImaganary{

		int r = 0;
		int i = 0;

		public RealAndImaganary(){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Real number :");
			r = sc.nextInt();
			System.out.println("Enetr the Imaganary number :");
			i = sc.nextInt();
		}
		public void addComplexNumber(RealAndImaganary c1, RealAndImaganary c2){
			int a = c1.r + c2.r;
			int b = c1.i + c2.i;

			System.out.println("The addition is : "+a+ " + " +b+"i");
		}
	}

	public class Lab55{
		public static void main(String[] args) {
			RealAndImaganary c1 = new RealAndImaganary();
			RealAndImaganary c2 = new RealAndImaganary();
			c1.addComplexNumber(c1,c2);
			
		}
	}