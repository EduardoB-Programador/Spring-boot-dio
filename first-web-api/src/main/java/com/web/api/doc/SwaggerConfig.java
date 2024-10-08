/*
package com.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

import java.util.HashSet;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    private Contact contact() {
        return new Contact("Eduardo", "https://github.com/EduardoB-Programador", "eduardobraga.contato@gmail.com");
    }

    private ApiInfoBuilder apiInfo() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("My First Web API");
        apiInfoBuilder.description("A simple Web API I made using Springboot based on a DIO course");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Terms of service: Open Source");
        apiInfoBuilder.license("License");
        apiInfoBuilder.licenseUrl("url");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;
    }

    @Bean
    public Docket apiDetails() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.web.api.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfo().build())
                .consumes(new HashSet<>(List.of("application/json")))
                .produces(new HashSet<>(List.of("application/json")));


                return docket;
    }

}
*/
