package com.rmgTest;

import org.testng.annotations.Test;

import com.rmg.pojo.PojoClass;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutUsingGherkin {
	@Test
	public void update() {
		given()
			.baseUri("http://localhost:8084").contentType(ContentType.JSON).pathParam("PID", "TY_PROJ_802")
			.body(new PojoClass("Rajiv", "Tuesday", "Completed", 20))
		.when().put("/projects/{PID}")
		.then().log().all();
	}
}
