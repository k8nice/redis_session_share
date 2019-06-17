package com.nice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ningh
 */
@SpringBootApplication
//@ComponentScan(basePackages = "com.nice.config")
public class JedisSessionShareServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(JedisSessionShareServer2Application.class, args);
    }

}
