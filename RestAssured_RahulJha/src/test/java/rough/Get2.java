package rough;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get2 {

	public static void main(String[] args) {

		// get all users on page 2
		Response response = given().log().all().
				
				queryParam("page", "2")
				.accept(ContentType.JSON)
				.get("https://reqres.in/api/users");
		
		System.out.println("===================");
		response.prettyPrint();

	}

}
