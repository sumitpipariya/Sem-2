import java.util.Scanner;

 class variable{

	int a = 0;
	int b = 0;

	public variable(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr the value of a :");
		a = sc.nextInt();
		System.out.println("Entee the value of b :");
		b = sc.nextInt();
	} 

	public void Sum(variable c, variable d){

		int s1 = c.a + d.a;		//5+10=15
		int s2 = c.b * d.b;		//5*10=50

		System.out.println("Ans is : " +s1 +s2);
	}
}

public class P1{

	public static void main(String[] args) {
		
		variable c= new variable();
		variable d= new variable();

		c.Sum(c,d);
	}
}