package com.truth99.webservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils {
	
	public static String doPost(String url,Map<String,String> map) throws Exception{
		return doPost(url,map,"utf-8");
	}

	public static String doPost(String url,Map<String,String> map,String charset)throws Exception {
		//HttpPost连接对象
		HttpPost httpRequest = new HttpPost(url);

		//使用NameValuePair来保存要传递的Post参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		String key = null;
		String value = null;
		for (Entry<String, String> entry: map.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();
			//添加要传递的参数
			params.add(new BasicNameValuePair(key,value));
		}
		System.out.println(params);
		//设置字符集
	 	HttpEntity httpentity = new UrlEncodedFormEntity(params, charset);
	 	//请求httpRequest
	 	httpRequest.setEntity(httpentity);
	 	//取得默认的HttpClient
	 	HttpClient httpclient = new DefaultHttpClient();

	 	//取得HttpResponse
	 	HttpResponse httpResponse = httpclient.execute(httpRequest);
		//HttpStatus.SC_OK表示连接成功 
		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
			//取得返回的字符串
			String strResult = EntityUtils.toString(httpResponse.getEntity());
			return strResult;
		}else{
			return "failure";
		}
	}
	
	public static String doGet(String url) throws Exception{
		return doGet(url, "utf-8");
	}
	
	public static String doGet(String url,String charset) throws Exception {  
        BufferedReader in = null;  
  
        String content = null;  
        try {
            // 定义HttpClient
            HttpClient client = new DefaultHttpClient();
            // 实例化HTTP方法  
            HttpGet request = new HttpGet();
            request.setURI(new URI(url));
            request.setHeader("Content-Type","application/x-www-form-urlencoded; charset=" + charset);
            HttpResponse response = client.execute(request);  
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK){
            	in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            	StringBuffer sb = new StringBuffer("");
            	String line = "";  
            	String NL = System.getProperty("line.separator");  
            	while ((line = in.readLine()) != null) {  
            		sb.append(line + NL);
            	}  
            	in.close();  
            	content = sb.toString();
            }else{
            	return String.valueOf(statusCode);
            }
        }finally {
            if (in != null){
                try {
                    in.close();// 最后要关闭BufferedReader  
                } catch (final Exception e) {  
                    e.printStackTrace();  
                }
            }
        }
        return content;
    }
}
