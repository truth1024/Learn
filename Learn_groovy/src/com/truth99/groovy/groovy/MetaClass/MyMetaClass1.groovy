package com.truth99.groovy.groovy.MetaClass

import groovy.lang.DelegatingMetaClass

/**
 *
* @ClassName: MyMetaClass1
* @Description: 教程自带类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880或有道笔记，“示例5”）
* @author xuehan.li
* @date 2014年2月12日 下午5:29:08
*
 */
public class MyMetaClass1 extends DelegatingMetaClass {
	MyMetaClass1(Class thisClass){
		super(thisClass)
	}
	  
	Object invokeMethod(Object object, String methodName, Object[] arguments){
		"MyMetaClass: ${super.invokeMethod(object, methodName, arguments)}"
	}
	
	static void main(args){
		def amc = new MyMetaClass1(A)
		amc.initialize()
		def a = new A()
		a.metaClass = amc
		  
		assert a.bark() == 'MyMetaClass: A: invoked bark()'
		  
		Thread.start {
			assert a.bark() == 'MyMetaClass: A: invoked bark()'
		}
		  
		assert new A().bark() == 'A: invoked bark()'
		  
		assert a.bleet() == 'A: missing bleet()'
	}
}

class A{
	def bark(){'A: invoked bark()'}
	def invokeMethod(String name, Object args){
		"A: missing $name(${args.join(', ')})"
	}
}