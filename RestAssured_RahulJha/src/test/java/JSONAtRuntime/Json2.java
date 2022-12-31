package JSONAtRuntime;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json2 {

	public static void main(String[] args) {
		JSONObject rootJson=new JSONObject();
		rootJson.put("name", "Valmiki");
		rootJson.put("email", "valmikivishwakarma223@gmail.com");
		rootJson.put("age", 30);
		System.out.println(rootJson);
		
		JSONObject address = new JSONObject();
		address.put("House No", 150);
		address.put("Village", "Baliyari");
		address.put("PS", "Waziganj");
		address.put("city", "Gaya");
		System.out.println(address);
		
		JSONArray mobile = new JSONArray();
		mobile.put(2838283);
		mobile.put(982362392920328336L);
		address.put("mobile", mobile);
		
		rootJson.put("address", address);
		System.out.println("===========================");
		System.out.println(rootJson);
		
		
	}
}
