public class Vehical {

	public int getWheels() {
		System.out.println("I am from Vehical-getEheels");
		return 4;
	}

	public String getSteering() {
		System.out.println("I am from Vehical-getSteering");
		return "Circle";
	}
	
	public String getColor() {
		System.out.println("I am from Vehical-getColor");
		return "White";
	}
}

class TwoWhVehical extends Vehical
{
	public int getWheels() {
		System.out.println("I am from TwoWhVehical-getEheels");
		return 2;
	}
	public String getSteering() {
		System.out.println("I am from TwoWhVehical-getSteering");
		return "Bar";
	}
	
	
}

class Auto  extends Vehical
{
	public int getWheels() {
		return 3;
	}
	public String getColor() {
		return "Red";
	}
}