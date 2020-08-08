package org.testing.responsevalidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {

	public static void responsedata(Response res,String expectedresult,String jsonPath)
	{
		String actualdata=res.jsonPath().get(jsonPath);
		if(actualdata.equals(expectedresult))
		{
			System.out.println("Data is Matching");
		}
		else {
			System.out.println("Data is not Matching");
		}
	}
}

