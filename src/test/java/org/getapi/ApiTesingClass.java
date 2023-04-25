package org.getapi;

import org.global.GetLinks;
import org.global.LibGlobal;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ApiTesingClass extends LibGlobal {

	@Test
	public void getUser() {
		addHeader("Content-Type", "application/json");
		Response res = addRequestType("GET", GetLinks.getUser);
		System.out.println(getResponseBody(res));
		System.out.println(getResponseCode(res));
	}

	@Test
	public void getListUser() {
		addHeader("Content-Type", "application/json");
		addQueryParam("page", "2");
		Response res = addRequestType("GET", GetLinks.getListUser);
		System.out.println(getResponseBody(res));
		System.out.println(getResponseCode(res));

	}
	@Test
	public void createUser() {
		addHeader("Content-Type", "application/json");
		addBody(PayLoad.createUser());
		Response res = addRequestType("POST", GetLinks.createUser);
		System.out.println(getResponseBody(res));
		System.out.println(getResponseCode(res));
	}
	@Test
	public void updateUser() {
		addHeader("Content-Type", "application/json");
		addBody(PayLoad.updateUser());
		Response res = addRequestType("PUT", GetLinks.updateUser);
		System.out.println(getResponseCode(res));

	}
	@Test
	public void deleteUser() {
		addHeader("Content-Type", "application/json");
		Response res = addRequestType("DELETE", GetLinks.deleteUser);
		System.out.println(getResponseCode(res));
	}
	
	
}
