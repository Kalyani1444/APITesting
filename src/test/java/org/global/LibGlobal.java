package org.global;

import Getters.PostInfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LibGlobal {

	RequestSpecification req;
	Response res;

	public void addHeader(String key, String value) {
		req = RestAssured.given().header(key, value);
	}

	public void addQueryParam(String key, String value) {

		req = req.given().queryParam(key, value);
	}

	public void addPathParam(String paramaterName, String paramaterValue) {
		req = req.given().pathParam(paramaterName, paramaterValue);
	}

	public void addBasicAuth(String username, String password) {
		req = req.given().auth().preemptive().basic(username, password);
	}

	public void addBody(Object body) {
		req = req.given().body(body);
	}

	public Response addRequestType(String type, String endpoints) {

		if (type.equals("GET")) {
			res = req.when().get(endpoints);
		} else if (type.equals("POST")) {
			res = req.when().post(endpoints);
		} else if (type.equals("PUT")) {
			res = req.when().put(endpoints);
		} else if (type.equals("DELETE")) {
			res = req.when().delete(endpoints);
		} else {
			System.out.println("invalid request type");
		}
		return res;
	}

	public String getResponseBody(Response res) {
		String string = res.getBody().asString();
		return string;
	}

	public int getResponseCode(Response res) {
		int code = res.getStatusCode();
		return code;

	}
}