package cn.young1996.springcloudalibaba.serviceprovider_8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProvider8090Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider8090Application.class, args);
    }

}
