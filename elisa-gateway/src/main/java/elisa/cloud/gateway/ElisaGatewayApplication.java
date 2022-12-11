package elisa.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ElisaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElisaGatewayApplication.class, args);
	}

}
