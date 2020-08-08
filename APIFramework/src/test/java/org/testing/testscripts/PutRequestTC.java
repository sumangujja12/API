package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.responsevalidation.ResponseDataValidation;
import org.testing.responsevalidation.ResponseStatusCodeValidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutRequestTC {
	@Test
	
	public void TC4() throws IOException
	{
		JSONObject Putdata=new JSONObject();
		Putdata.put("firstname", "Sumang");
		Putdata.put("lastname", "raom");
		Putdata.put("id","su");
		Putdata.put("designation", "Team lead");
		 Properties pr=PropertiesFileload.propertiesfile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PutRequest(Putdata.toString(),"QA_URI",PostRequestTC.id);
		System.out.println("Status code" + res.statusCode());
		System.out.println(" Put request data is " + res.asString());

		
	}

}
