package com.rmgTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ProjectTest {
	
	@Test
	public void getProjects() {
		Response respo = RestAssured.get("http://localhost:8084/projects/TY_PROJ_006");
		//String completeBody = respo.toString();
		//System.out.println(completeBody);
		respo.prettyPrint();
		//int acSC=respo.getStatusCode();
		//System.out.println(acSC);
		System.out.println(respo.getStatusCode());
		//String type=respo.getContentType();
		//System.out.println(type);
		System.out.println(respo.getContentType());
	}
}
