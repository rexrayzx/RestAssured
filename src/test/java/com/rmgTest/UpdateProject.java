package com.rmgTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void updateProject() {
		JSONObject jObject=new JSONObject();
		jObject.put("createdBy", "Rex");
		jObject.put("projectName", "ClassPlus");
		jObject.put("status", "On Going");
		jObject.put("teamSize", 10);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObject);
		Response respo = req.put("http://localhost:8084/projects/TY_PROJ_602");
		respo.prettyPrint();
		System.out.println(respo.statusCode());
		System.out.println(respo.contentType());
	}
}
