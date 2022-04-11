package  com.santander.connector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Spring Fox Configuration
 *
 */
@Configuration
public class SpringFoxConfig {
	
	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CalculatorSCF")
	            .description("Api to operate GQS GetProducts and Calculator")
	            .license("Apache 2.0")
	            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	            .termsOfServiceUrl("")
	            .version("1.0.0")
	            .contact(new Contact("","", "team@gruposantander.com"))
	            .build();
	}
	/**
	 * Docket configuration
	 * @return Docket
	 */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.select()                                  
                .apis(RequestHandlerSelectors.basePackage("com.santander.connector.service.impl"))       
                .paths(PathSelectors.any())                          
                .build();
    }

}
