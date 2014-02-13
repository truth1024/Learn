package com.truth99.webservice.fetion;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;


public class Fetion {
	public static void sendMsg(String _phone,String _pwd,String _to,String _msg) throws HttpException, IOException{  
        HttpClient client = new HttpClient();  
        PostMethod post = new PostMethod("http://3.ibtf.sinaapp.com/f.php");  
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");//在头文件中设置转码  
        NameValuePair[] data ={   
                new NameValuePair("phone", _phone),  
                new NameValuePair("pwd", _pwd),  
                new NameValuePair("to",_to),  
                new NameValuePair("msg",_msg),  
                new NameValuePair("type","0")  
                };  
        post.setRequestBody(data);  
      
        client.executeMethod(post);  
        Header[] headers = post.getResponseHeaders();
        System.out.println(post.getResponseBodyAsString());
        int statusCode = post.getStatusCode();  
        System.out.println("statusCode:"+statusCode);  
        for(Header h : headers){  
            System.out.println(h.toString());  
        }  
        //String result = new String(post.getResponseBodyAsString().getBytes("utf-8"));  
        //System.out.println(result);  
        System.out.println("ok!");  
        post.releaseConnection();  
    }
}
