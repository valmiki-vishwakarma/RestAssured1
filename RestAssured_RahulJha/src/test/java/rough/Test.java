package rough;

import static io.restassured.RestAssured.*;


import io.restassured.response.Response;

public class Test {
	public static void main(String[] args) {
	
	Response response=
			given().get("https://reqres.in/api/users");
	
	response.prettyPrint();
	
	String email=response.jsonPath().getString("data[3].email");
	System.out.println(email);
	
	System.out.println(response.jsonPath().getString("data[0].id"));
	
	
	}
}
