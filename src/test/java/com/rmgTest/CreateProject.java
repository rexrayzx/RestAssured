package com.rmgTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	public void createProject() {
		JSONObject jObject=new JSONObject();
		jObject.put("createdBy", "Rajiv");
		jObject.put("projectName", "ClassPlus");
		jObject.put("status", "Created");
		jObject.put("teamSize", 8);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObject);
		Response respo = req.post("http://localhost:8084/addProject");
		respo.prettyPrint();
		System.out.println(respo.statusCode());
		System.out.println(respo.contentType());
	}
}
