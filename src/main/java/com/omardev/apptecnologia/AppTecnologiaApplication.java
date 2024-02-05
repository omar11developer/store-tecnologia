package com.omardev.apptecnologia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class AppTecnologiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTecnologiaApplication.class, args).getBeanDefinitionNames();
	}

}
