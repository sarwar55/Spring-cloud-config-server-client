package org.sarwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudM2ConfigserverApplication.class, args);
	}
}
