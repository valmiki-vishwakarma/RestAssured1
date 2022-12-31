package rough;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Post_Map {
	
	
	public static void main(String[] args) {

		Map<String,Object> body = new HashMap<String,Object>();
		//ObjectMapper body = new ObjectMapper();
		body.put("name", "pinga");
		body.put("job", "dinga Leader");
		
		Response response = given().log().all().body(body).post("https://reqres.in/api/users");

		System.out.println("===========================");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getCookies());
	}

}
