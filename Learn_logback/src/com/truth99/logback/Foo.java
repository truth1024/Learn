/**   
* @Title: Foo.java
* @Package com.truth99.logback
* @Description: 
* @author Xuehan.Li
* @date 2014年5月14日 下午6:22:39
* @version V1.0
*/ 
package com.truth99.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: Foo
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年5月14日 下午6:22:39
 * 
 */
public class Foo {

	private static final Logger logger = LoggerFactory.getLogger(Foo.class);
	  
	  public void doIt() {
	    logger.debug("Did it again!");
	  }
}
