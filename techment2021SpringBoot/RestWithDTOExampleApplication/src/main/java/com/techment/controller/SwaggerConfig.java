package com.techment.controller;

import org.hibernate.boot.Metadata;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket myApis()
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.techment")).build().apiInfo(Metadata());
		
	}

	private ApiInfo Metadata() {
		// TODO Auto-generated method stub
		
		ApiInfo apiInfo = new ApiInfo("my customer controller", "this is provided all the methods for customer", "1.5v", "www.myblog.htm", "Hemashree", "Apache", "http:hello.com");  
				 return apiInfo;
	
	}
}
