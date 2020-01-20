package com.nosbielc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 20/01/2020
 * @project Spring-Examples
 */

@SpringBootApplication
@EnableResourceServer
public class SpringBootAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAuthServerApplication.class, args);
    }

}
