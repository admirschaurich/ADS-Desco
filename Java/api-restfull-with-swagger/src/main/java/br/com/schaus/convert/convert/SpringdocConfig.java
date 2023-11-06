package br.com.schaus.convert.convert;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
    @Bean
    public OpenAPI springShopOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("API Restful para conversões de valores")
                .description("Com essa API é possível efetuar algumas convesões de valores.")
                .version("1.0.0")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("GitHub da aplicação")
                .url("https://github.com/endereco-repositorio-api"));
    }
}
