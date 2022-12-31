package rough;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
public class Delete {
	
	public static void main(String[] args) {
	
	Response resp =
	given()
	.log()
	.all()
	.delete("https://reqres.in/api/users/2");
	
	resp.prettyPrint();
	
	System.out.println(resp.getStatusCode());
	
	
	
	}

}
