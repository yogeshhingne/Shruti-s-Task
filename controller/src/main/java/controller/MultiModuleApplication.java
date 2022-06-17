package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import service.ServicePro;

@SpringBootApplication
public class MultiModuleApplication {
@Bean
	ServicePro getServicePro(){
	return  new ServicePro();
}
	public static void main(String[] args) {
		SpringApplication.run(MultiModuleApplication.class, args);
	}
}
