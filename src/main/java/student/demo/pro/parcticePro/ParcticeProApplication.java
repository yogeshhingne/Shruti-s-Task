package student.demo.pro.parcticePro;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import student.demo.pro.parcticePro.ioccontainer.demo.Car;


@SpringBootApplication
@EntityScan
public class ParcticeProApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ParcticeProApplication.class, args);
		Car bean = context.getBean(Car.class);
		System.out.println(bean.getEngineName());
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}