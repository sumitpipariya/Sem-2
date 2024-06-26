import java.util.Scanner;

class Member{

	String name;
	int age;
	double phoneno;
	String address;
	double salary;

	void printSalary(){
		System.out.println(salary);
	}
}

class Employee extends Member{

	void employeeDetails(){
		String specialization;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Specialization :");
		specialization = sc.nextLine();
		System.out.println("Name :");
		name = sc.nextLine();
		System.out.println("Age :");
		age = sc.nextInt();
		System.out.println("Phone Number :");
		phoneno = sc.nextDouble();
		System.out.println("Address :");
		address = sc.nextLine();
		System.out.println("Salary :");
		salary = sc.nextDouble();
	}
}

class Manager extends Member{

	void managerDeatils(){
		String department;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Department :");
		department = sc.nextLine();
		System.out.println("Name :");
		name = sc.nextLine();
		System.out.println("Age :");
		age = sc.nextInt();
		System.out.println("Phone Number :");
		phoneno = sc.nextDouble();
		System.out.println("Salary :");
		salary = sc.nextDouble();
		System.out.println("Address :");
		address = sc.nextLine();
	}
}

public class Lab63{

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		Employee e = new Employee();

		m1.managerDeatils();
		e.employeeDetails();
	}
}