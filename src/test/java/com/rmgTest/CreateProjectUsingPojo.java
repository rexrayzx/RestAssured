package com.rmgTest;

import java.util.Random;

import org.testng.annotations.Test;

import com.rmg.pojo.PojoClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingPojo {

	@Test
	public void cretaeProjectPojo() {
		int num=new Random().nextInt(1000);
		RequestSpecification reqspc = RestAssured.given();
		reqspc.contentType(ContentType.JSON);
		reqspc.body(new PojoClass("rex", "plus"+num, "On Going", 5));
		Response respo = reqspc.post("http://localhost:8084/addProject");
		respo.prettyPrint();
		System.out.println(respo.contentType());
		System.out.println(respo.statusCode());
	}
}
