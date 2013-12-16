package com.truth99.webservice.axis;

import java.net.URL;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class AxisUtils {
	
	public static String call(String url,String param) throws Exception{
		String res = null;
		Service service = new Service();
		Call call;
		call = (Call) service.createCall();
		call.setTargetEndpointAddress(new URL(url) );
		call.setOperationName("getName");// 这是要调用的方法
		res = (String) call.invoke( new Object[] {param} );
		System.out.println(res);
		return res;
	}
}
