package com.nice;

import com.nice.config.SessionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author ningh
 */
@SpringBootApplication
//@ComponentScan(basePackages = "com.nice.config")
public class JedisSessionShareServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(JedisSessionShareServer1Application.class, args);
    }

}
