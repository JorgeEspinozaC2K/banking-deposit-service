package com.banking.deposit.service.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.banking.deposit.service.app.model.Deposit;

public interface DepositRepository extends ReactiveMongoRepository<Deposit, String> {

}
