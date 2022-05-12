package com.banking.deposit.service.app.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.banking.deposit.service.app.entity.Account;

import reactor.core.publisher.Mono;

@Service
public class DepositWebClient {

	@SuppressWarnings("rawtypes")
	@Autowired
	private ReactiveCircuitBreakerFactory reactiveCircuitBreakerFactory;
	
	public Mono<Account> findAccount(String id){
		return WebClient
				.create("http://localhost:8080")
				.get()
				.uri("/account/{id}",id)
				.retrieve()
				.bodyToMono(Account.class)
				.transformDeferred(it -> {
                    ReactiveCircuitBreaker rcb = reactiveCircuitBreakerFactory.create("customDefaultCB");
                    return rcb.run(it, throwable -> Mono.empty());
                });
	}
}
