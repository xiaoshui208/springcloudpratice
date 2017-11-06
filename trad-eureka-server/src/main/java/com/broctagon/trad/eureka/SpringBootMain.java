package com.broctagon.trad.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootMain 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootMain.class, args);
    }
}
