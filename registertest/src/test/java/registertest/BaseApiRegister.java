package registertest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApiRegister {

	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();

}
