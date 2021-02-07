package com.tianji.lichee.dlicheeger;


import com.tianji.lichee.remoting.rocketmq.RocketmqRemotingClient;
import com.tianji.lichee.remoting.rocketmq.RocketmqRemotingServer;

public class DLicheegerRpcRocketmqService implements DLicheegerRpcService {

    private DLicheegerServer dLicheegerServer;

    private RocketmqRemotingServer rocketmqRemotingServer;

    private RocketmqRemotingClient rocketmqRemotingClient;

    public DLicheegerRpcRocketmqService(DLicheegerServer dLicheegerServer){
        this.dLicheegerServer = dLicheegerServer;
    }
}
