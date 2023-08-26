package com.trishul.springnewjenkinsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringNewJenkinsDemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(SpringNewJenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        log.info("Executing test case.........");
        Assertions.assertEquals(true, true);
    }

}
