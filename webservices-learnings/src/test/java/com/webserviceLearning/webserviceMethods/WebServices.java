package com.webserviceLearning.webserviceMethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebServices {
	
	public static Response post(String uRI, String stringJSON){
		
		RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
// To use above 2 lines of code in same line. Use below code:
		RequestSpecification rs = RestAssured.given().body(stringJSON).contentType(ContentType.JSON);
		Response response = requestSpecification.post(uRI);
		return response;
		
	}
	
	public static Response put(String uRI, String stringJSON){
		
		RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.put(uRI);
		return response;	
	}
	
	public static Response get(String uRI){
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(uRI);
		return response;
	} 

	public static Response delete(String uRI){
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.delete(uRI);
		return response;
	}
}
