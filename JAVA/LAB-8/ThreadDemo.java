public class ThreadDemo {
	public static void main(String[] args) {
			
			display1 d1 = new display1();
			display2 d2 = new display2();

			d1.start();
			d2.start();

	}
}

class display1 extends Thread{
	public void run(){
		try{
			while(true){
				System.out.println("Good Morning");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}

class display2 extends Thread{
	public void run(){
		try{
			while(true){
				System.out.println("Good Afternoon");
				Thread.sleep(3000);
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}