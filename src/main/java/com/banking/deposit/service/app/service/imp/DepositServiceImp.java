package com.banking.deposit.service.app.service.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.deposit.service.app.model.Deposit;
import com.banking.deposit.service.app.repository.DepositRepository;
import com.banking.deposit.service.app.service.DepositService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DepositServiceImp implements DepositService {

	private static final Logger log = LoggerFactory.getLogger(DepositServiceImp.class);

	@Autowired
	private DepositRepository despositRepository;

	@Override
	public Flux<Deposit> findAll() {
		return despositRepository.findAll();
	}

	@Override
	public Mono<Deposit> findById(String id) {
		return despositRepository.findById(id).defaultIfEmpty(new Deposit()).flatMap(_deposit -> {
			if (_deposit.getId() == null) {
				return Mono.error(new InterruptedException("Not found"));
			} else {
				return Mono.just(_deposit);
			}
		}).onErrorResume(_ex -> {
			log.error(_ex.getMessage());
			return Mono.empty();
		});
	}

	@Override
	public Mono<Deposit> save(Deposit deposit) {
		return despositRepository.save(deposit);
	}

	@Override
	public Mono<Void> delete(Deposit deposit) {
		return despositRepository.delete(deposit);
	}

}
