package com.testes.spring.mongodb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.testes.spring.maven.simples")
public class WebConfig {
	{
		System.out.println("WebConfig - Iniciado");
	}

}

