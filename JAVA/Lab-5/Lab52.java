import java.util.Scanner;

	class Time{

	int h;
	int m;

	public Time(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Hour :");
		h = sc.nextInt();
		System.out.println("Enter the minute :");
		m = sc.nextInt();
	}

	void addTime(Time t1 , Time t2){
		int hr = t1.h + t2.h;
		int mi = t1.m + t2.m;
		if(mi>59){
			hr++;
			mi-=60;
		}
		System.out.println("The Time is :"+hr+" :" +mi);
	}
}
public class Lab52{
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		t1.addTime(t1,t2);

		
	}
}