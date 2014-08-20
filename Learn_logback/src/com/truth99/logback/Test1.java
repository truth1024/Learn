/**   
* @Title: Test.java
* @Package com.tenddata.appcpa.webservice
* @Description: 
* @author Xuehan.Li
* @date 2014年8月20日 上午10:03:01
* @version V1.0
*/ 
package com.truth99.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: Test
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年8月20日 上午10:03:01
 * 
 */
public class Test1 {

	private static Logger log = LoggerFactory.getLogger("timerollinglog");
	
	/** 
	 * @Title: main
	 * @Description: 
	 * @param args void
	 * @author Xuehan.Li
	 * @date 2014年8月20日 上午10:03:01
	 */
	public static void main(String[] args) {
		int i = 0;
		while(true){
			log.debug("loginfo : {}",i++);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
