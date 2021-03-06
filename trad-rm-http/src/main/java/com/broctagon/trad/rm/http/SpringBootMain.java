package com.broctagon.trad.rm.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMain 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootMain.class, args);
    }
}
