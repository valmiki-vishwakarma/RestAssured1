package JSONAtRuntime;

import java.util.HashMap;

public class JsonUsingHashMap {

	public static void main(String[] args) {
		
		HashMap root= new HashMap();
		root.put("name", "VV");
		root.put("email", "valmikivishwakarma223@gmail.com");
		root.put("age", 28);
		
		//System.out.println(root);
		
		HashMap address = new HashMap();
		address.put("Village", "Baliyari");
		address.put("City","Gaya");
		
		
		//HashMap details =new HashMap();
		root.put("root", address);
		//details.put("address", address);
		
		System.out.println(root);
		
		
		
	}
}
