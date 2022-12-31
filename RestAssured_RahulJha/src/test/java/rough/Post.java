package rough;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Post {
	
	
	public static void main(String[] args) {
		String body= "\r\n" + "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

		Response response = given().log().all().accept(ContentType.JSON).body(body).post("https://reqres.in/api/users");

		System.out.println("================");
		response.prettyPrint();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getCookies());
	}

}
