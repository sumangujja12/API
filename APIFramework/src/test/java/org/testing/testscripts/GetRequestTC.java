package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.ResponseDataValidation;
import org.testing.responsevalidation.ResponseStatusCodeValidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestTC {
	@Test
public void TC2() throws IOException
{
	 Properties pr=PropertiesFileload.propertiesfile();
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.GetRequest("QA_URI",PostRequestTC.id);
	System.out.println("Get Request data is");
	System.out.println(res.asString());
	ResponseStatusCodeValidate.responseStatusCode(res, 200);
	//ResponseDataValidation.responsedata(res, "rao", "[2].lastname");

}
}
