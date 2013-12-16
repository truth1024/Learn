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
//		try {
//			URL yahoo = new URL("http://localhost:8082/ido/task/all?uid=9");
//		    BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
//		    String inputLine;
//		    while ((inputLine = in.readLine()) != null){
//		    	System.out.println(inputLine);
//		    }
//		    in.close();
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String getUrl = "http://localhost:8082/ido/task/alls?uid=9";
		System.out.println(HttpClientUtils.doGet(getUrl,"gb2312"));
		
	}
}
