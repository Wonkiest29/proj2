package dev.coffeedev.second_project;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product Management API", version = "1.0", description = "REST API for managing products"))
public class SecondProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondProjectApplication.class, args);
	}

}
