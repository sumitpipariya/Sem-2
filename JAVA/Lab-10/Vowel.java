import java.util.Scanner;

public class Vowel{
	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    char ch = scanner.next().charAt(0);

    ch = Character.toLowerCase(ch); 	

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + " is a vowel");
    } else {
      System.out.println(ch + " is a consonant");
    }

    scanner.close(); // Close the scanner to avoid resource leaks
  }
}


