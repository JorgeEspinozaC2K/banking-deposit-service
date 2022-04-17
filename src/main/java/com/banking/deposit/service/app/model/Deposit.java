package com.banking.deposit.service.app.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "deposits")
public class Deposit {

	@Id
	private String id;
	//Count to deposit 
	private long numberAccount;
	//Personal identification
	private int personalIdentifier;
	//Amount to deposit
	private int amountDeposit;
	private int status;
	//Operation date
	private Date operationDate;
}
