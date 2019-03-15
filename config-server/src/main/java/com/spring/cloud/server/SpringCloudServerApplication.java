package com.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: 程泰恒
 * @date: 2019/3/13 19:34
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class, args);
    }
}
