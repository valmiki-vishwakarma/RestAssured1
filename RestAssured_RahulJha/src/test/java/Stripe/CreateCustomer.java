package Stripe;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateCustomer {

	@Test
	public void createCustomer() {

		Response response=
	given().
	auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "")
	.param("email", "user67@yus.com")
	.param("name", "tsi7734")
	//.param("shipping", "jds")
	.post("https://api.stripe.com/v1/customers");
	
	response.prettyPrint();
	Assert.assertEquals(response.getStatusCode(),200);
	
		
	}
}
