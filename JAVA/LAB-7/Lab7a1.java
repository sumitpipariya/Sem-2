abstract class vegetable{
	String color;
	public abstract String toString();

	vegetable(String color){
		this.color = color;
	}
}
class Potato extends vegetable{
	 Potato(String color){
	 	super.color = color;

	 }
	 public String toString(){	
	 	return super.color;
	 }
}

public class Lab7a1 {
	public static void main(String[] args) {
	 	Potato p = new Potato("yellow");
	 	System.out.println(p.toString());
	 } 
}
