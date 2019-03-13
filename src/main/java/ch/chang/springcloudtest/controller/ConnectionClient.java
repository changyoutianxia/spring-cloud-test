package ch.chang.springcloudtest.controller;

import ch.chang.springcloudtest.api.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConnectionClient {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private ServiceApi serviceApi;
    @RequestMapping("/connection")
    public String balance(){
       return serviceApi.hello();
    }
}
