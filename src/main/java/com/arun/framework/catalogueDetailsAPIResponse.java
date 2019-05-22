package com.arun.framework;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import helper.ReusableMethods;
import helper.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class catalogueDetailsAPIResponse {		
	
	public static Response responseOfCatalogueDetailsAPI() throws IOException {
		
		// Base URL
				
		RestAssured.baseURI =  ReusableMethods.readEnvProperties().getProperty("HOST");
				
		Response response = given().param("catalogue", false).log().all().
							when().get(resources.placeGetData()).
							then().assertThat()
							.statusCode(200).and().contentType(ContentType.JSON).log().all().and().
							extract().response();
		return response;

	}
	
}
