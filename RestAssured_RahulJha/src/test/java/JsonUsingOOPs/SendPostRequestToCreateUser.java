package JsonUsingOOPs;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequestToCreateUser {

	public static void main(String[] args) {
		
		Person body=new Person("ttrs","23",28);
		body.addMobileNumber(123832);
		body.addMobileNumber(824383);
	System.out.println(body);
		System.out.println(body.toString());
		/*
		 * Response response= given() .contentType(ContentType.JSON) .body(body) .log()
		 * .all() .post("https://reqres.in/api/users");
		 */
	
//	response.prettyPrint();
		
		
	}
}
