package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

//first commit
@SpringBootApplication
@EnableSidecar
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
