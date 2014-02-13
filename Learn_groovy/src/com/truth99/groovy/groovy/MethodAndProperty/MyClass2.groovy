package com.truth99.groovy.groovy.MethodAndProperty

/**
 * 
* @ClassName: MyClass2
* @Description: 教程自带类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880或有道笔记，“示例2”）
* @author xuehan.li
* @date 2014年2月12日 下午5:19:51
*
 */
class MyClass2 implements GroovyInterceptable{
	def hello(){
		'invoked hello() directly'
	}
	def invokeMethod(String name, Object args){
		"invoked method $name(${args.join(', ')})"
	}
	static void main(args){
		def mine = new MyClass2()
		assert mine.hello() == 'invoked method hello()'
		assert mine.foo('Mark',19) == 'invoked method foo(Mark, 19)'
		  
		assert mine.&hello() == 'invoked hello() directly'
	}
}