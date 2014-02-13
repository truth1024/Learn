package com.truth99.groovy.groovy.MethodAndProperty

/**
 * 
* @ClassName: MyClass
* @Description: 教程自带类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880或有道笔记，“示例1”）
* @author xuehan.li
* @date 2014年2月12日 下午4:59:49
*
 */
class MyClass1{
	def hello(){
		'invoked hello directly'
	}
	def invokeMethod(String name, Object args){
		return "unknown method $name(${args.join(', ')})"
	}
	
	static void main(args){		
		def mine= new MyClass1()
		println mine.hello()
		assert mine.hello() == 'invoked hello directly'
		println mine.foo("Mark", 19)
		assert mine.foo("Mark", 19) == 'unknown method foo(Mark, 19)'
	}
}
