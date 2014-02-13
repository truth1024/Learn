package com.truth99.webservice;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;


public class HttpClientTest {
	
	
	public static void main(String[] args) throws Exception {
//		String url = "http://www.idoido.cn/index.php?c=clientapi&a=login";
//		Map<String,String> map = new HashMap<String, String>();
//		map.put("username","truth99");
//		map.put("password","4534599");
//		String jsonObject = HttpClientUtils.doPost(url, map);
//		JSONObject jsonobject = JSONObject.fromObject(jsonObject);
//		System.out.println(jsonobject);
//		JSONObject array = jsonobject.getJSONObject("info");
//		System.out.println(array);
//		User u = (User) JSONObject.toBean(array,User.class);
//		System.out.println(User.class);
//		System.out.println(u);
		
//		String getUrl = "http://localhost:8081/servlet/ApiTestServlet";
//		System.out.println(HttpClientUtils.doGet(getUrl));
		
		String fetionUrl = "http://w.ibtf.net/f.php?phone=13439401564&pwd=truth4534599&to=18210825801&msg=ddddd&type=0";
		Map<String,String> fetionParam = new HashMap<String,String>();
		fetionParam.put("phone","13439401564");
		fetionParam.put("pwd","truth4534599");
		fetionParam.put("to","18210825801");
		fetionParam.put("msg","收到请回复");
		fetionParam.put("type","0");
		System.out.println(HttpClientUtils.doGet(fetionUrl));
	}
}
