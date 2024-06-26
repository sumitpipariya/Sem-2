public class ThredDemo{
	public static void main(String[] args) {
		
		Runnable r1 = new Abc();
		Runnable r2 = new Abcd();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	}
}

class Abc implements Runnable{
	public void run(){
		try{
			while(true){
				System.out.println("hii");
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Abcd implements Runnable{
	public void run(){
		try{
			while(true){
				System.out.println("hello");
				Thread.sleep(2000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}