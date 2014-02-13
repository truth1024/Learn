package com.truth99.groovy.groovy.ExpandoMetaClass

/**
 *
* @ClassName: A3
* @Description: 教程自带的类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880 或有道笔记，“示例10”）
* @author xuehan.li
* @date 2014年2月12日 下午4:51:51
*
 */
class A3 {

	static void main(args) {
//		ExpandoMetaClass.enableGlobally()
		//call 'enableGlobally' method before adding to supplied class（在给类添加自定义方法之前，调用enableGlobally方法，可以为非自定义类动态添加方法和属性，使用1.8.1版的groovy如果去掉了该声明也是可以工作）
		List.metaClass.sizeDoubled = {-> delegate.size() * 2 }
		//add method to an interface
		def list = [] << 1 << 2
		list << 3
		println "sizeDouble : ${list.sizeDoubled()}"
		println "list first element : ${list.get(0)}"
		
		assert list.sizeDoubled() == 6
	}

}