
public class ConstDemo extends A{

	
	public static void main(String[] args) {
		
		ConstDemo ce = new ConstDemo();
		ConstDemo ce2 = new ConstDemo(10);
		ConstDemo ce3 = new ConstDemo("Abc");
		int sum = ce.add(10, 20);
		
		System.out.println("Sum:"+sum);
		
		
		//A a = new A(); hhhh
		
		
		String s = ce.add("Abc", "Pqr");
		ce.paint("Yellow");
		
		System.out.println("SUm STRING:"+s);
		
	}
	
	
   /*public String paint(String color){
		System.out.println("Painting is  Done....:"+color);
		return color;
	}*/

	int add(int x,int y){
		int z = x+y;
		return z;
	}
	
	int add(int x,int y,int p){
		int z = x+y+p;
		return z;
	}
	
	int  add(int x,int y,int p,int q){
		int z = x+y+p+q;
		return z;
	}

	public ConstDemo() {
		System.out.println("Constructor");
	}
	public ConstDemo(int x) {
		System.out.println("Constructor int:"+x);
	}
	
	
	public ConstDemo(String  x) {
		System.out.println("Constructor String:"+x);
	}
	
	
}




class A
{
	public String add(String s1,String s2){
		String s = s1+s2;
		return s;
	}
	
	public String paint(String color){
		
		System.out.println("Painting is in  progress....:"+color);
		return color;
	}
	
	
	
	
	
}
