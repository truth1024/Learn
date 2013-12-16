package com.truth99.webservice.axis;

public class HelloWorldWSDD {
	public String getName(String name) {
        return "your name : " + name;
    }
    
    public int getAge(int age) {
        return age + 10;
    }

}
