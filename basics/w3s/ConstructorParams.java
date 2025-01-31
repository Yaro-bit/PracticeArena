package w3s;


public class ConstructorParams {
	  int x;
	  int z;
	  String name;
	  
	  int modelYear;
	  String modelName;
	  
	  
	  public ConstructorParams(int y, String input, int year) {
	    x = y; //y - parameter 
	    z = y;
	    name = input; 
	    
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
		ConstructorParams myObj = new ConstructorParams(5,"Name input", 1995); //we pass a parameter to the constructor (5)
		ConstructorParams myCar = new ConstructorParams(1,"Mustang", 1995); //we pass a parameter to the constructor (5)

		System.out.println(myObj.x +" "+myObj.z+" "+myObj.name);
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}