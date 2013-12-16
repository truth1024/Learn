package com.truth99.webservice;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;


public class HttpClientTest {
	
	
	public static void main(String[] args) throws Exception {
		String url = "http://www.idoido.cn/index.php?c=clientapi&a=login";
		Map<String,String> map = new HashMap<String, String>();
		map.put("username","truth99");
		map.put("password","4534599");
		String jsonObject = HttpClientUtils.doPost(url, map);
		JSONObject jsonobject = JSONObject.fromObject(jsonObject);
		System.out.println(jsonobject);
		JSONObject array = jsonobject.getJSONObject("info");
		System.out.println(array);
		User u = (User) JSONObject.toBean(array,User.class);
		System.out.println(User.class);
		System.out.println(u);
		
		String getUrl = "http://localhost:8082/ido/task/alls?uid=9";
		System.out.println(HttpClientUtils.doGet(getUrl,"gb2312"));
		
	}
}
