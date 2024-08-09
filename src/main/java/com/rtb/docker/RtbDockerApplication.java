package com.rtb.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.rtb.docker")
public class RtbDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtbDockerApplication.class, args);
		System.out.println("__________________ Welecome _________________________");
	}

}
