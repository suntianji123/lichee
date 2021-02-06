package com.tianji.lichee.common;

public abstract class UtilAll {

    /**
     * 获取服务器节点订阅的主题
     * @param cluster 集群名
     * @param serverId 节点id
     * @return
     */
    public static String getDefaultServerTopic(String cluster,String serverId){
        return String.format(MixAll.DEFAULT_SERVER_TOPIC,cluster,serverId);
    }
}
