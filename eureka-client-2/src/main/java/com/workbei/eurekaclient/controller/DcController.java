package com.workbei.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Da Shuai
 * @since 2019-10-14 11:26
 */
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        List<String> services = discoveryClient.getServices();
        StringBuilder servicesStr=new StringBuilder();
        for (String service : services) {
            servicesStr.append(service);
        }
        System.out.println("eureka-client-2");
        return servicesStr.toString();
    }
}
