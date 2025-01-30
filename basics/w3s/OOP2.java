package w3s;

public class OOP2 {
	int x = 5; //arguments or fields
	int y;
	final int z = -10;
	
	//You can specify as many attributes as you want
	  String fname = "John";
	  String lname = "Doe";
	  int age = 24;
	
	
	
	public static void main(String[] args) {
		
		//output attributes
		OOP2 myObj = new OOP2();
		System.out.println(myObj.x + " " + myObj.y+" "+ myObj.z);
		
		//modify attributes
		OOP2 myObjM = new OOP2();
		myObjM.y= 7;
		System.out.println(myObjM.x + " " + myObjM.y+" "+ myObjM.z);
		
		//override attributes
		OOP2 myObjO = new OOP2();
		myObjO.x=2;
		System.out.println(myObjO.x + " " + myObjO.y +" "+myObjO.z);
		
		//block ovverride
		OOP2 myObjB = new OOP2();
		//myObjB.z=25;
		System.out.println(myObjB.x + " " + myObjB.y+" "+myObjB.z);
		
		
		//multiple obj
		System.out.println();
		System.out.println();
	    OOP2 myObj1 = new OOP2();  // Object 1
	    OOP2 myObj2 = new OOP2();  // Object 2
	    
	    myObj2.x = 25;
	    System.out.println("obj1.x : "+myObj1.x);  
	    System.out.println("obj2.x : "+myObj2.x);  

	    System.out.println();
		System.out.println();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Age: " + myObj.age);
	}
}
