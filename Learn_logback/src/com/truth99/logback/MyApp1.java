/**   
* @Title: MyApp1.java
* @Package com.truth99.logback
* @Description: 
* @author Xuehan.Li
* @date 2014年5月14日 下午6:28:48
* @version V1.0
*/ 
package com.truth99.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: MyApp1
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年5月14日 下午6:28:48
 * 
 */
public class MyApp1 {
	private static final Logger logger = LoggerFactory.getLogger(MyApp1.class);

	  public static void main(String[] args) {
	    logger.info("Entering application.");

	    Foo foo = new Foo();
	    foo.doIt();
	    logger.info("Exiting application.");
	  }
}
