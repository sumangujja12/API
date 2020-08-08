package org.testing.responsevalidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate {
public static void responseStatusCode(Response res,int ExpectedStatuscode)
{
	if(res.getStatusCode()==ExpectedStatuscode)
	{
		System.out.println("Statuscode is Matching");
	}
	else
	{
		System.out.println("Statuscode is not matching");
	}
}

}
