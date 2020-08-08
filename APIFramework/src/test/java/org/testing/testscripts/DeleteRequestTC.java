package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequestTC {
	@Test
	public void TC5() throws IOException
	{
		 Properties pr=PropertiesFileload.propertiesfile();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.DeleteRequest("QA_URI",PostRequestTC.id);
		System.out.println("Status code" + res.statusCode());
		System.out.println(" delete request data is "  + res.asString());

		
	}

}
