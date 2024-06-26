import java.util.Scanner;
 class book{
	private String author_name;

	void book(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Author Name :");
		author_name = sc.nextLine();
	}

}
 
class book_publication extends book{
	private String title;
	String bookPublication;
	String author_name;

	void book_publication(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter book publication :");
		bookPublication = sc.nextLine();
		System.out.println("Enter title of book publication :");
		title = sc.nextLine();

	}
}

class paper_publication extends book{
	private String title;

	void paper_publication(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr paper Publication :");
		title = sc.nextLine();
	}
}

public class Lab62 {
	public static void main(String[] args) {
		book_publication b1 = new book_publication();
		paper_publication p1 = new paper_publication();

		p1.paper_publication();
		b1.book_publication();
	}
}