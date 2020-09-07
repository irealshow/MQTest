package com.lance.rocketMQ.RocketMQ;

/** 
 * Created by lance on 2017/2/10. 
 */  

//dev97 test 11
public class RocketMQConsumerTest {  
  
  
    public static void main(String[] args) {  
  
  
        String mqNameServer = "127.0.0.1:9876";  
        String mqTopics = "rs-topic-handon-uat";  
  
        String consumerMqGroupName = "CONSUMER-MQ-GROUP";  
        RocketMQListener mqListener = new RocketMQListener();  
        RocketMQConsumer mqConsumer = new RocketMQConsumer(mqListener, mqNameServer, consumerMqGroupName, mqTopics);  
        mqConsumer.init();  
  
  
        try {  
            Thread.sleep(1000 * 60L);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  
