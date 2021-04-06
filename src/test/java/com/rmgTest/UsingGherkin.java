package com.rmgTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingGherkin {
	@Test
	public void getAllProjects() {
		RestAssured.given().contentType(ContentType.JSON).baseUri("http://localhost:8084")
		.when().get("/projects")
		.then().log().all();
		
	}
	
	@Test
	public void getProject() {
		RestAssured.given().contentType(ContentType.JSON).baseUri("http://localhost:8084").pathParam("PID", "TY_PROJ_006")
		.when().get("/projects/{PID}")
		.then().log().all();
	}
}
