public class TrdOdd {

	public static void main(String[] args) {
		
		Thread t1 = new even();
		Thread t2 = new odd();

		t1.start();
		t2.start();
	}
	
}

class even extends Thread{

	public void run(){

		try{
			int i=1;

			if(i%2==0){
				for(i=1;i<=20;i++){
					System.out.println(i);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}

class odd extends Thread{

	public void run(){	
		int j=1;
		try{
			if(j%2!=0){
				for(j=1;j<=20;j++){
					System.out.println(j);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}
