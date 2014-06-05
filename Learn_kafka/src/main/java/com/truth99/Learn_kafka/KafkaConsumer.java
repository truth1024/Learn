/**   
* @Title: KafkaConsumer.java
* @Package com.truth99.Learn_kafka
* @Description: 
* @author Xuehan.Li
* @date 2014年6月4日 下午7:08:27
* @version V1.0
*/ 
package com.truth99.Learn_kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

/** 
 * @ClassName: KafkaConsumer
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年6月4日 下午7:08:27
 * 
 */
public class KafkaConsumer extends Thread{

	private final ConsumerConnector consumer;
    private final String topic;
    
    public KafkaConsumer(String topic){
    	consumer = kafka.consumer.Consumer  
                .createJavaConsumerConnector(createConsumerConfig());  
        this.topic = topic;
    }
    
    private static ConsumerConfig createConsumerConfig() {  
        Properties props = new Properties();  
        props.put("zookeeper.connect", "192.168.48.64:2181");  
        props.put("group.id", "0");  
        props.put("zookeeper.session.timeout.ms", "400000");  
        props.put("zookeeper.sync.time.ms", "200");  
        props.put("auto.commit.interval.ms", "1000");  
  
        return new ConsumerConfig(props);  
    }
    
    public void run() {  
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();  
        topicCountMap.put(topic, new Integer(1));  
        Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer  
                .createMessageStreams(topicCountMap);  
        KafkaStream<byte[], byte[]> stream = consumerMap.get(topic).get(0);  
        ConsumerIterator<byte[], byte[]> it = stream.iterator();  
        while (it.hasNext())  
            System.out.println(new String(it.next().message()));  
    }
    
    public static void main(String[] args) {  
    	KafkaConsumer consumerThread = new KafkaConsumer("test");  
        consumerThread.start();  
    } 
}
