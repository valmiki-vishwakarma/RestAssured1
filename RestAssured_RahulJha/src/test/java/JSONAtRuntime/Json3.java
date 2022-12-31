package JSONAtRuntime;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json3 {
	
	public static void main(String[] args) {
		
		JSONObject person1 = new JSONObject();
		person1.put("name","Steve Jobs");
		person1.put("address", "USA");
		
		JSONObject person2 = new JSONObject();
		person2.put("name", "VV");
		person2.put("address", "Ghurha Baliyari");
		

		JSONArray voters= new JSONArray();
		//voters.put("person1", person1);
		//voters.put("person2", person2);
		
		voters.put(person1);
		voters.put(person2);
		
	System.out.println(voters);
		
	
		
	}

}
