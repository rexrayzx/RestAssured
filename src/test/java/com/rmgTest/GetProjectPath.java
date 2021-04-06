package com.rmgTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class GetProjectPath {
	@Test
	public void getProject() {
		given()
			.baseUri("http://localhost:8084").contentType(ContentType.JSON)
			.pathParam("PID", "TY_PROJ_209")
		.when().get("/projects/{PID}")
		.then().log().all();
	}
}
