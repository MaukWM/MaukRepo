package ss.week1;

public class Employee {
	private int hours;   // hours worked in the week
	private double rate; // hourly pay rate (dollars)
	
	public double pay () {
		if (hours < 40){
			return (hours * rate);
		}else{
			return (hours * rate) + ((hours - 40) * rate);}
	}
}
