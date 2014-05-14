/**   
* @Title: RedisTest.java
* @Package com.truth99.redis
* @Description: 
* @author Xuehan.Li
* @date 2014年4月24日 下午4:43:41
* @version V1.0
*/ 
package com.truth99.redis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/** 
 * @ClassName: RedisTest
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年4月24日 下午4:43:41
 * 
 */
public class RedisTest {

	/** 
	 * @Title: main
	 * @Description: 
	 * @param args void
	 * @author Xuehan.Li
	 * @date 2014年4月24日 下午4:43:41
	 */
	public static void main(String[] args) {
//		Jedis j = RedisConnection.getInstance("10.10.33.7", 6381);
		Jedis j = RedisConnection.getInstance("localhost", 6379);
//		j.set("xu", "dudu");
//		System.out.println(j.get("15425appkey"));
//		System.out.println(j.keys("*").size());
//		System.out.println(j.exists("key"));
//		System.out.println(j.set("key2", "value2"));
//		System.out.println(j.type("key3"));
//		System.out.println(j.hset("hashkey1", "field_a", "value_a"));
//		j.expire("hashkey1", 30);
//		Map<String,String> hash = new HashMap<String, String>();
//		hash.put("field_a", "value_a1");
//		hash.put("field_b", "value_b1");
//		hash.put("field_c", "value_c1");
//		System.out.println(j.hmset("hashkey_hm", hash));
		System.out.println(j.get("kkk"));
	}

}
