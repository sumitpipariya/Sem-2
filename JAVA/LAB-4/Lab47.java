import java.util.Scanner;

public class Lab47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String a = sc.nextLine();
        int i,j;

        for(i=0;i<a.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.print("\n");
        }
    }
}
