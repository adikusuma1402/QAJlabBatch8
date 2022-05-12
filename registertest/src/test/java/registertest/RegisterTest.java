package registertest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import utils.DataUlitity;

public class RegisterTest extends BaseApiRegister {

	@Test
	public void registerTest() {

		String requestBody = DataUlitity.getData().toString();

		Response responseRegister = given().spec(commonJsonSpec).body(requestBody).when().post("/register");

		assertEquals(responseRegister.getStatusCode(), 201);

	}

}
