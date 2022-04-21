package com.banking.deposit.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankingDepositServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDepositServiceApplication.class, args);
	}

}
