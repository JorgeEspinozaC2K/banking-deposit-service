package com.banking.deposit.service.app.service;

import com.banking.deposit.service.app.model.Deposit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepositService {

	/**
	 * This method bring all the information from the Deposit database 
	 * @return Flux type Deposit
	 */
	public Flux<Deposit> findAll();
	
	/**
	 *This method bring a record from the Deposit database  
	 * @return Mono type Deposit
	 */
	public Mono<Deposit> findById(String id);
	
	/**
	 * This method save or update a record
	 * @return Mono type Deposit
	 */
	public Mono<Deposit> save(Deposit deposit);
	
	/**
	 * This method delete a record 
	 * @return Mono type void
	 */
	public Mono<Void> delete(Deposit deposit);

}
