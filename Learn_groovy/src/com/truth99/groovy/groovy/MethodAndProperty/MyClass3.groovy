package com.truth99.groovy.groovy.MethodAndProperty

/**
 * 
* @ClassName: MyClass3
* @Description: 教程自带类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880或有道笔记，“示例3”）
* @author xuehan.li
* @date 2014年2月12日 下午5:29:08
*
 */
class MyClass3 {
	def greeting = 'accessed greeting directly'
	Object getProperty(String property){
		println property
		"read from property $property"
	}
  
	void setProperty(String property, Object newVlaue){
		throw new Exception("wrote to property $property")
	}
	
	static void main(args){
		def mine = new MyClass3()
		/**
		 * 该示例描述了属性的获取特性，默认的通过Gpath(见Gpath具体概念)来处理属性的值，
		 * 都是通过调用getProperty和SetProperty来代劳的
		 */
		assert mine.greeting == 'read from property greeting'
		try{
			mine.greeting = 'hi'
		}catch(e){
			assert e.message == 'wrote to property greeting'
		}
		
		/**
		 * 如果希望直接访问参数的值，可以变通的使用'.@'操作符来达成
		 */
		assert mine.@greeting == 'accessed greeting directly'
	}
}
