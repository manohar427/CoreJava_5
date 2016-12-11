
public class Sample {
  public static void main(String[] args) {
	System.out.println("Helow world 1");
	
	Sample sample = new Sample();
	int sum = sample.add(10, 15);
	System.out.println("Sum 10,15:"+sum);
}
  
  int add(int x,int y){
	  
	  int z = x+y;
	  //System.out.println("Sum:"+z);
	  return z;
  
  }
  
int add(int x,int y,int p){
	  
	  int z = x+y;
	  System.out.println("Sum:"+z);
	  return z;
  
  }


String name(String x,String y){
	  
	  String  z = x+y;
	  System.out.println("Sum:"+z);
	  return z;

}

 void dataTypeDemo(){
	 int x=1067676988;//32-bits
	 long l =1067676988888845l;//64-bits
	 
	 double y= 12.34;//64-bit
	 float z = 12.34f;//32-bit
	 
	 String name = "xyzsdasdasdasdasdasdsdasdas";
	 char gender = 'm';
	 
	 byte  b = -128;//8 bits 010101010
	 byte bb = 10;
	 System.out.println("ok");
	 
	 String all[] = {"Abc","Pqr","Xyz"};
	 int marks [] = {12,23,12,45,56,6,6,6,6,6};
	 
 }




}
