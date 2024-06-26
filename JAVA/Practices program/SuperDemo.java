
class vehical{
	int noOfGears = 5;

	void start(){
		System.out.println("Vehical :Key to start");
		System.out.println("No of Gears is :" +noOfGears);
	}

}
class car extends vehical{
	int noOfGears = 10;

	void start(){
		System.out.println("Car :Auto start");
		System.out.println("No of Gears is :" +noOfGears);
	}
}

class bike extends vehical{
	int noOfGears = 15;

	void start(){
		int noOfGears = 20;
		System.out.println("Bike :Kick to start");
		System.out.println("No of Gears is :" +noOfGears);
	}
	bike(){
		super();
		System.out.println(noOfGears + ": super");
	}
}

public class SuperDemo{
	public static void main(String[] args) {
		
		vehical vh = new bike();
		vh.start();

	}
}