package com.truth99.webservice.axis;

import java.net.URL;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class AxisUtils {
	
	public static String call(String url,String mothed,String param) throws Exception{
		String res = null;
		Service service = new Service();
		Call call;
		call = (Call) service.createCall();
		call.setTargetEndpointAddress(new URL(url) );
		call.addParameter("loginid", org.apache.axis.encoding.XMLType.XSD_DATE,javax.xml.rpc.ParameterMode.IN);
		call.addParameter("loginpwd", org.apache.axis.encoding.XMLType.XSD_DATE,javax.xml.rpc.ParameterMode.IN);
		call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
		call.setOperationName(mothed);// 这是要调用的方法
		res = (String) call.invoke( new Object[] {"zhilingwuxian","zhilingwuxian"} );
		System.out.println(res);
		return res;
	}
}
