import java.util.Scanner;

class Student{
	String name = "Arjun";
	int percentage;
	public Student(int i){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of " +i+ " Student :");
		name = sc.nextLine();
		System.out.print("Enetr percentage of no Student " + i +" is : ");
		percentage = sc.nextInt();
	}
	public void printStudentDetails(){
		System.out.println(name + " got " + percentage + " in the board Exam ");
	}
}
public class ArrayOfObjectDemo{

	public static void main(String[] args) {
		Student[] stu = new Student[3];

		for(int i=0;i<stu.length;i++)
		{
			stu[i] = new Student(i+1);
		}
		for(int i=0;i<stu.length;i++){
			if(stu[i].percentage>80){
				stu[i].printStudentDetails();
			}
		}
	}
}