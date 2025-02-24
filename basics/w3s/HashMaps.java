package w3s;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap <String, String> capitalCities = new HashMap <String,String>();
		
		 	capitalCities.put("Kyiv", "Ukraine"); //first entry is key, second is value
		    capitalCities.put("Berlin", "Germany");
		    capitalCities.put("Vienna", "Austria");
		    capitalCities.put("Warsaw", "Poland");
		
		    
		    System.out.println(capitalCities);
		    
		    String city = capitalCities.get("Kyiv");
		    System.out.println(city);
		    
		    capitalCities.remove("Berlin");
		    System.out.println(capitalCities);
		    
		    System.out.println("inträge in hashmap: "+capitalCities.size());
		    

		    
		    //keySet() method if you only want the keys
		    //values() method if you only want the values
		    
		    
		    for(String i: capitalCities.keySet()) {
		    	System.out.println("Key: "+i);		    	
		    }
		    for(String i: capitalCities.values()) {
		    	System.out.println("Values: "+i);		    	
		    }
		    
		    capitalCities.clear();
		    System.out.println(capitalCities);
	
		    HashMap<Integer, String> people = new HashMap<Integer, String>();
		    people.put(0,"Adolf Hitler");
		    people.put(1, "Joseph Stalin");
		    people.put(2, "Vladimir Putin");
		    people.put(3, "Mao Zedong");
		    people.put(4, null);
		    
		    for(Integer i: people.keySet()) {
		    	System.out.println(i);
		    }
		    
		    int j = 0;
		    for(String i: people.values()) {
		    	if (i!=null)
		    	System.out.println(i);
		    }
	
	}	
	

}
