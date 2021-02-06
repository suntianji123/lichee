package com.tianji.lichee.dlicheeger;

import com.tianji.lichee.dlicheeger.remoting.RemotingClient;
import com.tianji.lichee.dlicheeger.remoting.RemotingServer;
import com.tianji.lichee.dlicheeger.remoting.rocketmq.RocketmqRemotingClient;
import com.tianji.lichee.dlicheeger.remoting.rocketmq.RocketmqRemotingServer;

public class DLicheegerRpcRocketmqService implements DLicheegerRpcService {

    private DLicheegerServer dLicheegerServer;

    private RocketmqRemotingServer rocketmqRemotingServer;

    private RocketmqRemotingClient rocketmqRemotingClient;

    public DLicheegerRpcRocketmqService(DLicheegerServer dLicheegerServer){
        this.dLicheegerServer = dLicheegerServer;
    }
}
