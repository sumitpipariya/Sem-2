public class Lab54{

		static int count = 0;
		Lab54(){
			count++;
		}

	public static void main(String[] args) {
		Lab54 d1 = new Lab54();
		Lab54 d2 = new Lab54();
		Lab54 d3 = new Lab54();
		Lab54 d4 = new Lab54();
		System.out.println(count);
	}
}