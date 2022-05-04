package com.banking.deposit.service.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.deposit.service.app.model.Deposit;
import com.banking.deposit.service.app.service.DepositService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/deposit")
public class DepositController {
	
	//dependency injection required for the class work
	@Autowired
	private DepositService depositService;
	
	//This method displays all the information 
	@GetMapping
	public Flux<Deposit> index() {
		return depositService.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Deposit> searchDepositId(@PathVariable String id){
		return depositService.findById(id);
	}
	
	@GetMapping("/lastTen/{cardNumber}")
	public Flux<Deposit> searchLastTen(@PathVariable Long cardNumber){
		return depositService.findAllTenLast(cardNumber);
	}
	
	//This method save or update a record
	@PostMapping("/save")
	public Mono<Deposit> save(@RequestBody Deposit deposit){
		return depositService.save(deposit);
	}
	@DeleteMapping("/delete")
	public Mono<Void> deleteDeposit(@RequestBody Deposit deposit){
		return depositService.delete(deposit);
	}
}
