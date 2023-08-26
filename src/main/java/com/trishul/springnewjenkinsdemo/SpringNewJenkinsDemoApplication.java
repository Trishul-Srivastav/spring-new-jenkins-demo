package com.trishul.springnewjenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringNewJenkinsDemoApplication {

    private static final Logger log= LoggerFactory.getLogger(SpringNewJenkinsDemoApplication.class);

    @PostConstruct
    public void init(){
        log.info("initializing the application...............");
    }

    public static void main(String[] args) {
        log.info("application started...............");
        SpringApplication.run(SpringNewJenkinsDemoApplication.class, args);
    }

}
