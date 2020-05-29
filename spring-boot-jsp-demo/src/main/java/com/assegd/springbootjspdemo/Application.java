package com.assegd.springbootjspdemo;

import com.assegd.springbootjspdemo.config.BeanConfig;
import com.assegd.springbootjspdemo.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.assegd.springbootjspdemo")
@Import({BeanConfig.class, WebConfig.class})
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

	private static Class applicationClass = Application.class;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

}