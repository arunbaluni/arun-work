package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {

	public static JsonPath rawToJSON(Response response) {
		String responseOutput = response.asString();
		JsonPath x = new JsonPath(responseOutput);
		return x;
	}

	public static Properties readEnvProperties() throws IOException {
		Properties getProperties = new Properties();
		String filePath = System.getProperty("user.dir") + "/src/main/java/helper/env.properties";
		FileInputStream fis = new FileInputStream(filePath);
		getProperties.load(fis);
		return getProperties;
	}

}
