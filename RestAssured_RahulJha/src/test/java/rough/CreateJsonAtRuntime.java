package rough;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import com.google.gson.JsonObject;

public class CreateJsonAtRuntime {
	
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		json.put("name", "Pinga");
		json.put("job", "Leaders");
		
		Response response=
		given()
		.contentType(ContentType.JSON)
		.body(json).post("https://reqres.in/api/users");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		
	}

}
