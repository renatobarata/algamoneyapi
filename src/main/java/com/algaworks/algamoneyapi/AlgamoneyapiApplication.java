package com.algaworks.algamoneyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.algaworks.algamoneyapi.config.property.AlgamoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AlgamoneyapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyapiApplication.class, args);
	}

}
