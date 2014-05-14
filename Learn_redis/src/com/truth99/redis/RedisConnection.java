/**   
* @Title: ConnectionRedis.java
* @Package com.truth99.redis
* @Description: 
* @author Xuehan.Li
* @date 2014年4月24日 下午4:21:11
* @version V1.0
*/ 
package com.truth99.redis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/** 
 * @ClassName: ConnectionRedis
 * @Description: 获取reids链接
 * @author Xuehan.Li
 * @date 2014年4月24日 下午4:21:11
 * 
 */
public class RedisConnection {

	
	private String host;
	private int port;
	private  static Map<String,Jedis> redisMap;
	
	static{
		redisMap = new HashMap<String,Jedis>();
	}
	
	private RedisConnection(){
		
	}
	
	private RedisConnection(String host,int port){
		this.host = host;
		this.port = port;
	}

	public static synchronized Jedis getInstance(String host,int port){
		String redisKey = host+port;
		Jedis j = redisMap.get(redisKey);
		if(j == null){
			j = new Jedis(host, port);
			if(j.isConnected()){
				redisMap.put(redisKey, j);
			}else{
//				throw new RuntimeException("链接失败");
			}
		}
		return j;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
