package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responsevalidation.ResponseDataValidation;
import org.testing.responsevalidation.ResponseStatusCodeValidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.Jsonvariablereplacement;
import org.testing.utilities.PropertiesFileload;
import org.testing.utilities.Responseextractionusingjsonpath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PostRequestTC {

	public static String id;
	public static String firstname;

	//Bodydata ready---taking from json
	//Random number generation-Variable value replacement
	//properties file load
	@Test
	public void TC1() throws IOException 
	{
		
		 
		String body=JsonFileRead.bodyDataRead("../APIFramework/src/test/java/org/testing/payloaddata/body.json");
		Random r=new Random();
		Integer v=r.nextInt();
		 body=Jsonvariablereplacement.jsonvariable(body,"id",v.toString());
		 //body=Jsonvariablereplacement.jsonvariable(body,"firstname","suma");

		 //System.out.println(body);
		 Properties pr=PropertiesFileload.propertiesfile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(body, "QA_URI");
		System.out.println("Status code" + res.statusCode());
		System.out.println("bodyData");
		System.out.println(res.asString());
		ResponseStatusCodeValidate.responseStatusCode(res, 201);
		ResponseDataValidation.responsedata(res, "suma","firstname");
		id=Responseextractionusingjsonpath.responseextract("id", res);
		firstname=Responseextractionusingjsonpath.responseextract("firstname", res);
	}

}
