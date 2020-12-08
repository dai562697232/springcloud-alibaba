package cn.young1996.springcloudalibaba.nacosgateway_9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosGateway9527Application.class, args);
    }

}
