package com.audichya.SimpleMart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class SimpleMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMartApplication.class, args);
	}

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.audichya.SimpleMart.Controller"))
//				.paths(PathSelectors.ant("/api/*"))
//				.build();
//	}

}
