package com.banking.deposit.service.app.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Account {

	private String id;

	//Number account
	private Long accountNumber;
	//Dollar or soles
	private Integer moneyType;
	// verification pin
	private String password;
	//encrypted pin
	private String hashedpassword;
	
	//Account owners, titled
	private List<String> owners;
	private List<String> authorities;
	
	//Maximum amount
	private Double maxAuthAmount;
	//Amount left
	private Date amountLeftReload;
	
	//Type account
	private Integer productType;
	//Dependency injection
	private Restriction restrictions;
	//Temporary promotion
	private Boolean offer = false;
	//Number monthly movements
	private Integer monthMoves;
	//Record withdrawal date 
	private Date witdrawalDay;
	//Record deposit date
	private Date depositDay;
	//Current Balance
	private Double amountLeft = 0.00;
	//Date modify
	private Date modify;
	//Date of creation
	private Date createAt;
}
