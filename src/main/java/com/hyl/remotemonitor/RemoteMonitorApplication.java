package com.hyl.remotemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class RemoteMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteMonitorApplication.class, args);
	}

}
