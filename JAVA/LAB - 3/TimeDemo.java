class Time{
	int hour;
	int minute;
	int second;

	public Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	void addTime(Time t){
		this.second += t.second; 
		if(this.second>=59){
			this.minute++;
			this.second-=60;
		}
		this.minute +=t.minute;
		if(this.minute>=59){
			this.hour++;
			this.minute-=60;
		}
		this.hour += t.hour;
	}
}

public class TimeDemo {
	public static void main(String[] args) {
		Time t1 = new Time(01,20,00);
		Time t2 = new Time(01,40,00);

		t1.addTime(t2);

		System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second);
	}
}