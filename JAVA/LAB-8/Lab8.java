import java.util.Scanner;
public class Lab8{
	public static void main(String[] args) {
		try{
			int x = Integer.parseint(args[0]);
			int y = Integer.parseint(args[1]);

			if(x==0 && y==0){
				throw new Exception("x and y cannot zero")
			}
			else{
				int ans = 1;
				for(i=1;i<y;i++){
					ans*=x;
				}
				System.out.println("ans");
			}
		}
		catch(Exception e){
			System.out.println("Syntex Error ");
		}
	}
}