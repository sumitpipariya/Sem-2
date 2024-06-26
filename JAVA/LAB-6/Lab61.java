import java.util.Scanner;

 class student{

	int id_no;
	String name[] = {"MATHS","C","PHY","DF","ES","IC"};
	String subject_code[] = {1223,5432,6545,9870,7656,8765};
	String subject_credits = {6,6,5,5,2,2};
	String grade[] = {"A+","A","B","A+","B+","A+"};
	double spi;


	void calculate_spi(){
		int i;
		for(i=0;i<6;i++)
		{
			switch(grade[i]){
				case ("A+"):{
					double credits = 10*subject_credits[i];
					break;
				}
				case ("A"):{
					double credits = 9*subject_credits[i];
					break;
				}
				case ("B+"):{
					double credits = 8*subject_credits[i];
					break;
				}
				case ("B"):{
					double credits = 7*subject_credits[i];
					break;
				}
				default:{
					System.out.println("Backlog");
				}
			}
		}
		System.out.println("Spi = " +credits);
	}
}

public static void main(String[] args) {
	
	System.out.println();
}