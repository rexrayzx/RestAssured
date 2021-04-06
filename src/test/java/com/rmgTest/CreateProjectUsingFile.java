package com.rmgTest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingFile {
	@Test
	public void createProjectFile() {
		RequestSpecification reqspc = RestAssured.given();
		reqspc.contentType(ContentType.JSON);
		reqspc.body(new File("C:\\Users\\Rajiv\\Desktop\\cretae.json"));
		Response respo = reqspc.post("http://localhost:8084/addProject");
		//respo.prettyPrint();
		System.out.println(respo.asString());
		System.out.println(respo.contentType());
		System.out.println(respo.statusCode());
	}
}
