import java.util.*;
import java.lang.*;

class Points{
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	public Points(int x1, int y1,int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}


	public double Distance(Points p1){

		double distance = (double)(Math.sqrt(Math.pow(p1.x2-p1.x1,2)+Math.pow(p1.y2-p1.y1,2)));
		return distance;
	}
}

public class Demo{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x1 :");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of y1:");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of x2 :");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of y2:");
		int y2 = sc.nextInt();

		Points p1 = new Points(x1,y1,x2,y2);
		
		double a = p1.Distance(p1);
		System.out.println(a);
	}
}