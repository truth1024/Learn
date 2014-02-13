package com.truth99.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.truth99.webservice.HttpClientUtils;

public class CallServlet extends HttpServlet{

	private static final long serialVersionUID = 1350154753848223018L;

	public CallServlet() {
		super();
	}
	public void destroy() {
		super.destroy();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String getUrl = "http://localhost:8081/servlet/ApiTestServlet";
		try {
			String remoteUrl = HttpClientUtils.doGet(getUrl);
			System.out.println(remoteUrl);
			response.sendRedirect("http://localhost:8081"+remoteUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init() throws ServletException {
	}
	
}
