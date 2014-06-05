/**   
* @Title: Producer.java
* @Package com.truth99.Learn_kafka
* @Description: 
* @author Xuehan.Li
* @date 2014年6月4日 下午6:11:56
* @version V1.0
*/ 
package com.truth99.Learn_kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/** 
 * @ClassName: Producer
 * @Description: 
 * @author Xuehan.Li
 * @date 2014年6月4日 下午6:11:56
 * 
 */
public class KafkaProducer {
	public static void main(String[] args) {
        Properties props = new Properties();
        props.put("zk.connect", "192.168.48.64:2181");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", "192.168.48.64:9092");
        ProducerConfig config = new ProducerConfig(props);
        Producer<String, String> producer = new Producer<String, String>(config);
        for (int i = 0; i < 10; i++)
            producer.send(new KeyedMessage<String, String>("test", "test" + i));
    }
}
