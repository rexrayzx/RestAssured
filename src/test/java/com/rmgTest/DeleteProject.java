package com.rmgTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	@Test
	public void deleteProject() {
		Response respo = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_602");
		respo.prettyPrint();
		System.out.println(respo.contentType());
		System.out.println(respo.statusCode());
	}
}
