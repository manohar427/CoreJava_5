public class VehicalManager {

	public static void main(String[] args) {

/*		Vehical tve = new TwoWhVehical();

		System.out.println(tve.getWheels());
		System.out.println(tve.getSteering());
		System.out.println(tve.getColor());*/
		
		
		Vehical tve = new Auto();

		System.out.println(tve.getWheels());//3
		System.out.println(tve.getSteering());//Circle
		System.out.println(tve.getColor());//red
	}

}
