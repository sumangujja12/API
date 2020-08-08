package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class Responseextractionusingjsonpath {
public static String responseextract(String jsonPath,Response res)
{
	return res.jsonPath().getString(jsonPath);
}
}
