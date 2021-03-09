package br.com.frbs.desafio.dbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {

	@Bean
	public Docket greetingApi() {
		/*
		 * List<SecurityScheme> schemeList = new ArrayList<>(); schemeList.add(new
		 * ApiKey(HttpHeaders.AUTHORIZATION, "Authorization", "header"));
		 * 
		 * return new
		 * Docket(DocumentationType.SWAGGER_2).produces(Collections.singleton(
		 * "application/json"))
		 * .consumes(Collections.singleton("application/json")).ignoredParameterTypes(
		 * Authentication.class) .securitySchemes(new ArrayList<>(Arrays.asList(new
		 * ApiKey("Bearer %token", "Authorization", "Header"))))
		 * .select().apis(RequestHandlerSelectors.basePackage(
		 * "com.pitang.desafio.ws.controller")).build().apiInfo(metaData());
		 */
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.frbs.desafio.dbc.controllers"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaData());

	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Spring Boot REST API")
				.description("\"Desafio DBC\"")
				.version("1.0.0")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
				.build();
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
			.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**")
			.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
