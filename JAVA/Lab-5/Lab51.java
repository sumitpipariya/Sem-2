public class Lab51{

	public static void main(String[] args) {
		Area obj  = new Area();
		double a1 = obj.Circle(10);
		double a2 = areaofCircle(10);
		System.out.println(a1);
		System.out.println(a2);
	}
	static double areaofCircle(int r){
		double ans;
		ans = Math.PI*r*r;
		return ans;
	}
}

class Area {
	double Circle(int r){
		double ans;
		ans = Math.PI*r*r;
		return ans;
	}
}