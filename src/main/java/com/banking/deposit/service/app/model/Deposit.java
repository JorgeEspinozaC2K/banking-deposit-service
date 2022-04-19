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
	private Integer personalIdentifier;
	//Amount to deposit
	private Integer amountDeposit;
	private Integer status;
	//Operation date
	private Date operationDate;
}
