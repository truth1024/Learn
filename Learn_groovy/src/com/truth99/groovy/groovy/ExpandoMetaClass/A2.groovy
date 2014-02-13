package com.truth99.groovy.groovy.ExpandoMetaClass

/**
 *
* @ClassName: A2
* @Description: 教程自带的类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880 或有道笔记，“示例9”）
* @author xuehan.li
* @date 2014年2月12日 下午4:51:51
*
 */
class A2 {

	static void main(args){
		A2.metaClass.character = 'Cat in the Hat'
		
		def a1 = new A2()
		assert a1.character == 'Cat in the Hat'
		
		def ourProperties = Collections.synchronizedMap([:])
		A2.metaClass.setType = {String value -> ourProperties["${delegate}Type"] = value }
		A2.metaClass.getType = { -> ourProperties["${delegate}Type"]}
		
		a1.type = 'Hatted Cat'
		assert a1.type == 'Hatted Cat'
		
		def a2 = new A2()
		A2.metaClass.constructor = { -> new A2()}
		try{
			a2 = new A2()
		}catch(Error e){
		  	assert e in StackOverflowError
		}
		
		A2.metaClass.constructor = {String s -> new A2(character :s)}
		a2 = new A2("Thing One")
		
		A2.metaClass.'changeCharacterToThingTwo'= {-> delegate.character = 'Thing Two' }
		a2.character= 'Cat in the Hat'
		a2.changeCharacterToThingTwo()
		assert a2.character == 'Thing Two'
		
		['Hatted Cat', 'Thing', 'Boy', 'Girl', 'Mother'].each{p->
			A2.metaClass."changeTypeTo${p}"= {-> delegate.type= p}
		}
		a2.changeTypeToBoy()
		assert a2.type == 'Boy'
		
		a2.'changeTypeToHatted Cat'()
		assert a2.type == 'Hatted Cat'
	}
}
