package com.rmgTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PathParameter {
	@Test
	public void pathParameter() {
		RequestSpecification reqsc=RestAssured.given();
		reqsc.pathParam("ProjectID", "TY_PROJ_607");
		
		Response res = reqsc.get("http://localhost:8084/projects/{ProjectID}");
		System.out.println(res.statusCode());
		System.out.println(res.contentType());
		res.prettyPrint();
	}
}
