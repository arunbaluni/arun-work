package com.arun.framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import java.io.IOException;
import java.net.MalformedURLException;
import com.arun.framework.catalogueDetailsAPIResponse;
import helper.ReusableMethods;

public class catalogueDetailsAPITests{

	Response response = null;

	@BeforeMethod
	public void getData() throws IOException {
		// Extract the API response from the API
		 response = catalogueDetailsAPIResponse.responseOfCatalogueDetailsAPI();
	}

	@Test
	public void verifyCarbonCreditsTest() throws MalformedURLException {
		JsonPath jsPath = ReusableMethods.rawToJSON(response);

		// Assert to check if "Name" field has value "Carbon credits" or not
		String verifyName = jsPath.get("Name");
		Assert.assertEquals("Carbon credits", verifyName);
	}

	@Test
	public void verifyCanRelistTest() throws MalformedURLException {

		JsonPath jsPath = ReusableMethods.rawToJSON(response);

		// Check canRelist response from API
		boolean canRelist = jsPath.getBoolean("CanRelist");	
		
		//Assert to check CanRelist or not
		Assert.assertEquals(true, canRelist);
	}

	@Test
	public void verifyGalleryPromotionTextTest() throws MalformedURLException {

		JsonPath jsPath = ReusableMethods.rawToJSON(response);
		
		String promotionDescriptionText = "";
		
		int count = jsPath.get("Promotions.size()");
		
		for(int i=0; i<count; i++) {
			if(jsPath.get("Promotions["+i+"].Name").toString().contains("Gallery")) {
				promotionDescriptionText = jsPath.getString("Promotions["+i+"].Description");
				break;
			}
		}
		
		// Assert to check the Promotions with name "Gallery" has Description text that contains text "2x larger image"
		Assert.assertTrue(promotionDescriptionText.contains("2x larger image"));
	}

}
