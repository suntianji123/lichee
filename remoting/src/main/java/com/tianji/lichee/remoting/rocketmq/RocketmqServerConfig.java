package com.tianji.lichee.remoting.rocketmq;

public class RocketmqServerConfig {
    private String cluster;

    private String serverId;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
}
