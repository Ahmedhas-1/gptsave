package GPTsave.registerymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaServer
@SpringBootApplication
public class RegisteryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisteryMicroserviceApplication.class, args);
	}

}
