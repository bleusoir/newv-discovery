package dev.newv.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.springframework.boot.SpringApplication.run;

@EnableEurekaServer
@SpringBootApplication
public class NewvDiscoveryApplication {

    public static void main(String[] args) {

        run(NewvDiscoveryApplication.class, args);
    }
}