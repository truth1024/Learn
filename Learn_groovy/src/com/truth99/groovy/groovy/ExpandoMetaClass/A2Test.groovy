package com.truth99.groovy.groovy.ExpandoMetaClass

class A2Test {

	String charcater = 'charcater'
	
	static void main(args) {
		def ourProperties = Collections.synchronizedMap([:])
		println ourProperties
		A2Test.metaClass.setType2{String value ->
			println delegate.charcater
			println "${delegate}Type2"
			println ourProperties["${delegate}Type2"]
			ourProperties["${delegate}Type2"] = value
		}
		A2Test.metaClass.getType2{ ->
			ourProperties["${delegate}Type2"]
		}
		
		def a2 = new A2Test();
		a2.type2 = 'truth'
		println a2.type2
	}

}
