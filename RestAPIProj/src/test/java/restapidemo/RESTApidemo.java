package restapidemo;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.jayway.jsonpath.JsonPath;

import net.javacrumbs.jsonunit.JsonAssert;

public class RESTApidemo {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		getExample();
		putExample();
		postExample();
		deleteExample();
	}

	public static void getExample() throws ClientProtocolException, IOException {

		HttpClient httpclient = HttpClients.createDefault();

		HttpGet getmethod = new HttpGet("https://reqres.in/api/users/2");

		HttpResponse response = httpclient.execute(getmethod);

		// my first check
		System.out.println("Status code:" + response.getStatusLine().getStatusCode());

		// second check

		String responsebody = EntityUtils.toString(response.getEntity());
		System.out.println("Repsonse body" + responsebody);

		// json path can be used to pick individual fields
		System.out.println(JsonPath.read(responsebody, "$.data.email"));

		// json assert can be used for complete json comparison

		try {
			JsonAssert.assertJsonEquals(
					"{\"data\":{\"id\":3,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Jet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstn/128.jpg\"},\"ad\":{\"company\":\"StatusCode Weekly\",\"url\":\"http://statuscode.org/\",\"text\":\"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"}}",
					responsebody);
		} catch (AssertionError e) {
			System.out.println("Mismatch in document: "
					+ e.toString().replace("org.opentest4j.AssertionFailedError: JSON documents are different:", ""));
		}
	}

	public static void postExample() throws ClientProtocolException, IOException {

		HttpClient httpclient = HttpClients.createDefault();

		HttpPost postmethod = new HttpPost("https://reqres.in/api/users");

		postmethod.setEntity(
				new StringEntity("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}"));

		postmethod.addHeader("Content-Type", "application/json; charset=utf-8");
		HttpResponse response = httpclient.execute(postmethod);

		// my first check
		System.out.println("Status code:" + response.getStatusLine().getStatusCode());

		// second check

		String responsebody = EntityUtils.toString(response.getEntity());
		System.out.println("Repsonse body" + responsebody);

		System.out.println(JsonPath.read(responsebody, "$.name"));

		try {
			JsonAssert.assertJsonEquals(
					"{\"data\":{\"id\":3,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Jet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstn/128.jpg\"},\"ad\":{\"company\":\"StatusCode Weekly\",\"url\":\"http://statuscode.org/\",\"text\":\"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"}}",
					responsebody);
		} catch (AssertionError e) {
			System.out.println("Mismatch in document: "
					+ e.toString().replace("org.opentest4j.AssertionFailedError: JSON documents are different:", ""));
		}
	}

	public static void putExample() throws ClientProtocolException, IOException {

		HttpClient httpclient = HttpClients.createDefault();

		HttpPut putmethod = new HttpPut("https://reqres.in/api/users/2");

		putmethod.setEntity(
				new StringEntity("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}"));

		putmethod.addHeader("Content-Type", "application/json; charset=utf-8");
		HttpResponse response = httpclient.execute(putmethod);

		// my first check
		System.out.println("Status code:" + response.getStatusLine().getStatusCode());

		// second check

		String responsebody = EntityUtils.toString(response.getEntity());
		System.out.println("Repsonse body" + responsebody);

		System.out.println(JsonPath.read(responsebody, "$.name"));

		try {
			JsonAssert.assertJsonEquals(
					"{\"data\":{\"id\":3,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Jet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstn/128.jpg\"},\"ad\":{\"company\":\"StatusCode Weekly\",\"url\":\"http://statuscode.org/\",\"text\":\"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"}}",
					responsebody);
		} catch (AssertionError e) {
			System.out.println("Mismatch in document: "
					+ e.toString().replace("org.opentest4j.AssertionFailedError: JSON documents are different:", ""));
		}
	}

	public static void deleteExample() throws ClientProtocolException, IOException {

		HttpClient httpclient = HttpClients.createDefault();

		HttpDelete delmethod = new HttpDelete("https://reqres.in/api/users");

		HttpResponse response = httpclient.execute(delmethod);

		// my first check
		System.out.println("Status code:" + response.getStatusLine().getStatusCode());

		// second check

	}

}
