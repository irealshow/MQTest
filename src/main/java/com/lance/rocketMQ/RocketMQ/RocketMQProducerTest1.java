package com.lance.rocketMQ.RocketMQ;

import com.alibaba.rocketmq.common.message.Message;  

/** 
 * Created by lance on 2017/2/10. 
 */  
public class RocketMQProducerTest1 {  
  
    public static void main(String[] args) {  
  
        String mqNameServer = "127.0.0.1:9876";  
        String mqTopics = "rs-topic-handon-uat";  
  
        String producerMqGroupName = "PRODUCER-MQ-GROUP";  
        RocketMQProducer mqProducer = new RocketMQProducer(mqNameServer, producerMqGroupName, mqTopics);  
        mqProducer.init();  
  
        
        Message message = new Message();  
//        String str = "{\"auxOpCode\":\"NEW\",\"createOrgCode\":\"719820\",\"createTime\":\"2018-10-28 16:04:55.000\",\"createUserCode\":\"00063160\",\"dataId\":151,\"deliverySeq\":1,\"empCode\":\"00063160\",\"empName\":\"陈磊磊\",\"errorTimes\":\"0\",\"expType\":\"10\",\"id\":\"stpYi710268dd-3b88-46ec-8fc1-0c5f08e15876\",\"modifyTime\":\"2018-10-28 16:04:55.000\",\"occStatus\":\"140\",\"opCode\":710,\"operateTime\":\"2018-10-28 16:07:04.060\",\"orderid\":589172618,\"orgCode\":\"719820\",\"snNo\":\"259\",\"status\":\"1\",\"traceStatus\":\"1\",\"transferStatus\":\"1\",\"uploadTime\":\"2018-10-28 16:04:55.000\",\"volumeWeight\":0.000,\"waybillNo\":\"804638532449802151\",\"weighWeight\":0.000}";
        String str = "{\"auxOpCode\":\"NEW\",\"createOrgCode\":\"719820\",\"createTime\":\"2018-10-28 17:04:55.000\",\"createUserCode\":\"00063160\",\"dataId\":151,\"deliverySeq\":1,\"empCode\":\"00063160\",\"empName\":\"陈磊磊\",\"errorTimes\":\"0\",\"expType\":\"10\",\"id\":\"stpYi710268dd-3b88-46ec-8fc1-0c5f08e15878\",\"modifyTime\":\"2018-10-28 17:04:55.000\",\"occStatus\":\"140\",\"opCode\":710,\"operateTime\":\"2018-10-28 17:07:04.060\",\"orderid\":589172618,\"orgCode\":\"719820\",\"snNo\":\"259\",\"status\":\"1\",\"traceStatus\":\"1\",\"transferStatus\":\"1\",\"uploadTime\":\"2018-10-28 17:04:55.000\",\"volumeWeight\":0.000,\"waybillNo\":\"804638532449802152\",\"weighWeight\":0.000}";
        message.setBody(str.getBytes());  
        mqProducer.send(message);  
        
       /* for (int i = 0; i < 100; i++) {  
  
            Message message = new Message();  
            message.setBody(("MY NAME IS  " + i).getBytes());  
            mqProducer.send(message);  
        }  */
  
  
  
    }  
  
}  