package com.truth99.webservice.axis;

public class AxisTest {

	public static void main(String[] args) throws Exception {
//		String url = "http://localhost:8080/services/HelloWorldWSDD";
//		AxisUtils.call(url,"getName","李学瀚");
		
		String mmsUrl = "http://wx360.bjfzq.com:8080/CXFCxTest/service/MmsServices?wsdl=";
		
		AxisUtils.call(mmsUrl,"queryBalance",null);
	}

}
