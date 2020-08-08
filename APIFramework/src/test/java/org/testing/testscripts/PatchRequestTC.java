package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PatchRequestTC {
	@Test
	public void TC6() throws IOException
	{
		JSONObject Patchdata=new JSONObject();
		Patchdata.put("lastname","Sumang5");
		 Properties pr=PropertiesFileload.propertiesfile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PatchRequest(Patchdata.toString(),"QA_URI",PostRequestTC.id);
		System.out.println("Status code" + res.statusCode());
		System.out.println(" Patch request data is " + res.asString());

		
	}

}
