package org.testing.teststeps;

import java.util.Properties;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
Properties pr;
public HTTPMethods(Properties pr)
{
	this.pr=pr;
	
}
public Response PostRequest(String bodyData,String urikey)
{
	Response res=
	  given()
	.contentType(ContentType.JSON)
	.body(bodyData)
	.when()
	.post(pr.getProperty(urikey));
	return res;
}
public Response GetRequest(String urikey,String EndPoint)
{
	String uri=pr.getProperty(urikey)+"/"+EndPoint;
	Response res=
			  given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
			return res;
	
}
public Response GetRequestwithquery(String urikey,String QueryParameter,String Queryvalue)
{
	String uri=pr.getProperty(urikey)+"?"+QueryParameter+"="+Queryvalue;
	Response res=
			  given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
			return res;
	
}
public Response PutRequest(String body,String urikey,String EndPoint)
{
	String uri=pr.getProperty(urikey)+"/"+EndPoint;
	Response res=
			  given()
			.contentType(ContentType.JSON)
			.body(body)
			.when()
			.put(uri);
			return res;
	
}
public Response PatchRequest(String body,String urikey,String Endpoint)
{
	String uri=pr.getProperty(urikey)+"/"+Endpoint;
	Response res=
			  given()
			.contentType(ContentType.JSON)
			.body(body)
			.when()
			.put(uri);
			return res;
	
}
public Response DeleteRequest(String urikey,String Endpoint )
{
	String uri=pr.getProperty(urikey)+"/"+Endpoint;
	Response res=
			  given()
			.contentType(ContentType.JSON)
			.when()
			.delete(uri);
			return res;
	
}




}
