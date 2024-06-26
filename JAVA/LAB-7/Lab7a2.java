interface Transport{
	void deliver();
}
class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal{

}
class Deer extends Animal{

}
class Donkey extends Animal{

}
class Camel extends Animal implements Transport{
	void deliver(){
		System.out.println("Camel is delivered");
	}
}
class Tiger extends Animal implements Transport{
	void deliver(){
		System.out.println("Tiger is delivered");
	}
}

class Tiger extends Animal{

}
public class Lab7a2{

	public static void main(String[] args) {
			Animal[] a = {new Tiger(),
			new Deer(),
			new Donkey(),
			new Camel()
		};

	for(Animal animal: a) {
			if(a instanceof Transport){
				Transport t = (Transport)a;
				t.deliver();
			}
		
		}
	}
}

