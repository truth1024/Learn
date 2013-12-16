package com.truth99.webservice.axis;

public class AxisTest {

	public static void main(String[] args) throws Exception {
		String url = "http://localhost:8080/services/HelloWorldWSDD";
		AxisUtils.call(url,"李学瀚");
	}

}
