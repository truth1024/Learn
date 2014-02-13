package com.truth99.groovy.groovy.ExpandoMetaClass

/**
 * 
* @ClassName: A1
* @Description: 教程自带的类（详情访问：http://attis-wong-163-com.iteye.com/blog/1235880 或有道笔记，“示例8”）
* @author xuehan.li
* @date 2014年2月12日 下午4:51:51
*
 */
class A1{
	String text
	
	static void main(args){
		
		def a1= new A1(text: 'aBCdefG')
		assert a1.metaClass.adaptee.class == MetaClassImpl
		
		A1.metaClass.inSameCase = {-> text.toUpperCase()}
		//triggers  conversion of MetaClass of A to ExpandoMetaClass	（触发器将MetaClass类型的A类转换成ExpandoMetaClass类型）
		//then adds new instance method 'inUpperCase' to class	（然后添加新方法“inUpperCase”到A类中）
		//A.metaClass {  } （执行“A.metaClass {}”也是将MetaClass转换成ExpandoMetaClass）
				
		def a2 = new A1(text:'hiJKLmnOp')
		assert a2.metaClass.adaptee.class == ExpandoMetaClass
		//MetaClass of A changed for instances created after conversion trigger only	（只有转换成ExpandoMetaClass后的实例才可以执行添加的方法）
		assert a2.inSameCase() == 'HIJKLMNOP'
		
		//new method not available（在转换成ExpandoMetaClass之前的实例不可以执行新方法）
		assert a1.metaClass.adaptee.class == MetaClassImpl
		try{ println a1.inSameCase();}
		catch(e){assert e in MissingMethodException}
		
		A1.metaClass.inLowerCase = {-> text.toLowerCase()}
		assert a2.inLowerCase() == 'hijklmnop'
		
		//replace the method definition with another（可以重写之前定义的方法）
		A1.metaClass.inSameCase = {-> text.toLowerCase()}
		assert a2.inSameCase() == 'hijklmnop'
				
		//add static methods（添加静态方法）
		A1.metaClass.'static'.inSameCase = {it.toLowerCase()}
		assert A1.inSameCase('qRStuVwXyz') == 'qrstuvwxyz'
	}
  }
