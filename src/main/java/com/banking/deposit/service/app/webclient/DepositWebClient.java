package com.banking.deposit.service.app.webclient;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.banking.deposit.service.app.entity.Account;

import reactor.core.publisher.Mono;

public class DepositWebClient {

	private Builder depositWebClient = WebClient.builder();
	
	public Mono<Account> findAccount(String id){
		return depositWebClient.build()
				.get()
				.uri("http://localhost:8080/account/{id}",id)
				.retrieve()
				.bodyToMono(Account.class);
	}
}
