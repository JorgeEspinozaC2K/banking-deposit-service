package com.banking.deposit.service.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.banking.deposit.service.app.model.Deposit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepositRepository extends ReactiveMongoRepository<Deposit, String> {

	
	/**
	 * EN: This method finds the account to deposit
	 * ES: Este metodo encuentra la cuenta a depositar
	 * @param numberaccount Long
	 * @return Mono type Deposit
	 */
	public Mono<Deposit> findByNumberAccount(Long numberaccount);
	
	/**
	 * EN: This method find the accounts assiociated to id
	 * ES: Este metodo encuentra las cuentas asociadas a un número de identificación
	 * @param personalIdentifier
	 * @return
	 */
	public Flux<Deposit> findbyPersonalIdentifier(Integer personalIdentifier);
}
