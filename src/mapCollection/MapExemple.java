package mapCollection;

import java.util.HashMap;

public class MapExemple {
	
	
	
	
	public static void main(String[] args) {
		
		
		HashMap<String , String> data = new HashMap <String, String>();
		
		data.put("firstName", "jack");
		data.put("lastName", "Ma");
		
		data.put("firstName1", "David");
		data.put("age", "25");
		System.out.println(data);
		
		
		// how to get the data 
		System.out.println(data.get("firstName"));
		
		// getting all of the keys
		
		System.out.println(data.keySet());
		
		// getting all the values
		System.out.println(data.values());
		
		// iterate 
		for(String key: data.keySet());
		
	}
	
	

}
