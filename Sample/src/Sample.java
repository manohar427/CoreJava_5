import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sample {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		/*Address ad = new Address("Line1", 1232);
		Cust c = new Cust("Abc", 120,ad);
		c.name = "PQR";

		System.out.println("Before:" + c);
		FileOutputStream fo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(c);

		oos.close();

		System.out.println("Done");*/

		FileInputStream fip = new FileInputStream("abc.txt");
		ObjectInputStream oip = new ObjectInputStream(fip);

		Cust c11 = (Cust) oip.readObject();

		oip.close();

		System.out.println(c11);
	}

}

class Cust implements Serializable {

	private static final long serialVersionUID = 674960698299761276L;
	String age;
	static String name="A";
	transient int weight=99;
	Address address;
	
	
	public Cust(String age, int weight, Address address) {
		super();
		this.age = age;
		this.weight = weight;
		this.address = address;
	}


	public String toString() {
		return "Cust [age=" + age + ", weight=" + weight + ", address="
				+ address + ", name=" + name+"]";
	}

}