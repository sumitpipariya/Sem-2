import java.util.Scanner;

public class Lab45 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        int length = inputString.length();

       
        if (length % 2 == 0) {
           
            int mid = length / 2;
            String secondHalf = inputString.substring(mid);
            System.out.println("Length of the string: " + length);
            System.out.println("Second half of the string: " + secondHalf);
        } else {
            
            int mid = length / 2;
            String secondHalf = inputString.substring(mid);
            System.out.println("Length of the string: " + length);
            System.out.println("Second half of the string: " + secondHalf);
        }
    }
}
