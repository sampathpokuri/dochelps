package ts.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="ts.dao")
@EntityScan(basePackages="ts.model")
@SpringBootApplication(scanBasePackages="ts")
public class DochelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DochelpApplication.class, args);
	}

}
