package com.lance.rocketMQ.RocketMQ;

import com.alibaba.rocketmq.common.message.Message;  

/** 
 * Created by lance on 2017/2/10. 
 */  
public class RocketMQProducerTest {  
  
    public static void main(String[] args) {  
  
        String mqNameServer = "192.168.8.30:9876";  
        String mqTopics = "MQ-MSG-TOPICS-TEST";  
  
        String producerMqGroupName = "PRODUCER-MQ-GROUP";  
        RocketMQProducer mqProducer = new RocketMQProducer(mqNameServer, producerMqGroupName, mqTopics);  
        mqProducer.init();  
  
  
        for (int i = 0; i < 20; i++) {  
  
            Message message = new Message();  
            message.setBody(("I send message to RocketMQ " + i).getBytes());  
            mqProducer.send(message);  
        }  
  
  
  
    }  
  
}  