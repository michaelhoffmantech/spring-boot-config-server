package com.scmc.bootdemo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoConfigServerApplication.class, args);
	}
}
