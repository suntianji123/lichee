package com.tianji.lichee.remoting.rocketmq;

import com.tianji.lichee.common.MixAll;
import com.tianji.lichee.common.UtilAll;
import com.tianji.lichee.remoting.RemotingServer;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;

public class RocketmqRemotingServer implements RemotingServer {

    private final RocketmqServerConfig rocketmqServerConfig;

    private DefaultMQPushConsumer consumer;

    public RocketmqRemotingServer(RocketmqServerConfig rocketmqServerConfig){
        this.rocketmqServerConfig = rocketmqServerConfig;
        consumer = new DefaultMQPushConsumer(rocketmqServerConfig.getCluster());
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
    }

    public void start() {
        //添加订阅



        try{
            consumer.subscribe(UtilAll.getDefaultServerTopic(rocketmqServerConfig.getCluster(),rocketmqServerConfig.getServerId()),"*");
            consumer.start();


        }catch (MQClientException e){
            //todo:记录日志
            System.out.println("error:"+e);
        }

    }

    public void shutdown() {
        if(consumer != null){
            consumer.unsubscribe(UtilAll.getDefaultServerTopic(rocketmqServerConfig.getCluster(),rocketmqServerConfig.getServerId()));
        }

    }
}
