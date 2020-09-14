package br.kenor.inpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InpeInfoReqApplication {

	public static void main(String[] args) {
		SpringApplication.run(InpeInfoReqApplication.class, args);
	}

}
