package com.org.theatre.onboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;*/

@SpringBootApplication
//@EnableSwagger2
@EnableJpaRepositories("com.org.theatre.onboard.*")
/*
 * @ComponentScan(basePackages = { "com.org.ticket.booking.*" })
 * 
 * @EntityScan("com.org.ticket.booking.*")
 */
public class TheatreOnboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheatreOnboardApplication.class, args);
	}
	
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.org.ticket.booking")).build();
	 * }
	 */

}
