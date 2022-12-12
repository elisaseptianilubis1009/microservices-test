package elisa.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ElisaWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElisaWebApiApplication.class, args);
	}

}
