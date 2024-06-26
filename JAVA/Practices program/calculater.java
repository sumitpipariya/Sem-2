import java.util.Scanner;

public class calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        System.out.println("Enter  Two number what you want");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int div=0;
        if (op == '+') {
            int sum = 0;
            sum = a + b;
            System.out.println(sum);
        } else if (op == '-') {
            float sub = a - b;
            System.out.println(sub);
        } else if (op == '*') {
            float mult = a * b;
            System.out.println(mult);
        } else if (op == '/') {
            if(b==0){
            while (b == 0) {
                int c;
                System.out.println("Enter another tum");
                c = sc.nextInt();
            if(c!=0){
                   div=a/c;
                    System.out.println(div);
                   break;
                }
                }
            }
            else{
                div=a/b;
                 System.out.println(div);
            }

           
        }
    }
}