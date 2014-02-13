package com.truth99.groovy.groovy.ExpandoMetaClass

/**
 * 
* @ClassName: A1Test
* @Description: 自己学习示例8的测试类
* @author xuehan.li
* @date 2014年2月12日 下午4:51:24
*
 */
class A1Test {

	String text = "love"
	
	static void main(args){
		A1Test.metaClass.upCase = {String str ->
			println str.toUpperCase()
		}
		A1Test.metaClass.upCase = {->
			println text.toUpperCase()
		}
		def a1 = new A1Test()
		println a1.metaClass.adaptee.class
		assert a1.metaClass.adaptee.class == ExpandoMetaClass
		a1.upCase("truth lee")
		a1.upCase()
		A1Test.metaClass.lowerCase = {String str ->
			println str.toLowerCase()
		}
		a1.lowerCase("Dudu");
	}
	
}
