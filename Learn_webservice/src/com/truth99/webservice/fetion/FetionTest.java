package com.truth99.webservice.fetion;

public class FetionTest {

	private static String PHONE = "13439401564";  
	private static String PWD = "truth4534599";  
	private static String TO = "18210825801";  
	private static String MSG = "你好：Hello World!";
	public static void main(String[] args) throws Exception{
	    Fetion.sendMsg(PHONE, PWD, TO, MSG);  
	}

}
