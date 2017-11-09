package me.prospect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ProspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProspectApplication.class, args);
	}
}
