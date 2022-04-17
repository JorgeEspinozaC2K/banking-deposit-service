package com.banking.deposit.service.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.deposit.service.app.model.Deposit;
import com.banking.deposit.service.app.repository.DepositRepository;
import com.banking.deposit.service.app.service.DepositService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DepositServiceImpl implements DepositService{
	
	@Autowired
	private DepositRepository despositRepository;
	
	@Override
	public Flux<Deposit> findAll() {
		return despositRepository.findAll();
	}

	@Override
	public Mono<Deposit> findById(String id) {
		return despositRepository.findById(id);
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
