package com.rmgTest;

import org.testng.annotations.Test;

import com.rmg.pojo.PojoClass;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject1 {
	@Test
	public void cretae() {
		given()
			.baseUri("http://localhost:8084").contentType(ContentType.JSON)
			.body(new PojoClass("Rex", "Tuesday", "Created", 8))
		.when().post("/addProject")
		.then().log().all();
	}
}
