package com.broctagon.trad.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableZipkinServer
public class SpringBootMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(SpringBootMain.class, args);
    }
}
