package com.rmgTest;

import org.apache.http.protocol.ResponseDate;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

public class DeleteGherkins {
	@Test
	public void deleteProject() {
		System.out.println(given()
			.baseUri("http://localhost:8084").contentType(ContentType.JSON)
			.pathParam("PID", "TY_PROJ_607")
		.when().delete("/projects/{PID}").statusCode());
		
		
	}
}
