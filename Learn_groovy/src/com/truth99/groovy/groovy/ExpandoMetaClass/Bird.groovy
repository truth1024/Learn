package com.truth99.groovy.groovy.ExpandoMetaClass

/**
 *
* @ClassName: Bird
* @Description: 教程自带的类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880 或有道笔记，“示例11”）
* @author xuehan.li
* @date 2014年2月12日 下午4:51:51
*
 */
class Bird {

	def name = 'Tweety'
	def twirp(okc){ "i taught i saw a puddy cat ${okc}" }
	
	static void main(args) {
		Bird.metaClass.invokeMethod = {name, args2->
			println "name : ${name}, args2 : ${args2}"
			def metaMethod = Bird.metaClass.getMetaMethod(name, args2)
			metaMethod?metaMethod.invoke(delegate,args2): 'no such method'
		}

		def a = new Bird()
		assert a.twirp('ok') == 'i taught i saw a puddy cat ok'
		assert a.bleet() =='no such method'
		
		Bird.metaClass.getProperty = {name->
			def metaProperty = Bird.metaClass.getMetaProperty(name)
			metaProperty?metaProperty.getProperty(delegate): 'no such property'
		}
		def b = new Bird()
		assert b.name == 'Tweety'
		assert b.filling == 'no such property'
	}

}
