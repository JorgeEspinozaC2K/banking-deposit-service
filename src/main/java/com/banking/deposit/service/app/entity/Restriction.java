package com.banking.deposit.service.app.entity;

import java.util.Date;

import lombok.Data;


@Data
public class Restriction {
	
	private String id;
	
	private String name;
	
	private int knownAs;
	
	private Boolean offer;
	
	private Double maintCommission;
	
	private Boolean hasMaxMove;
	
	private int maxMovements;
	
	private Boolean hasSpecificDay;
	
	private Boolean haveExpirationDate;
	
	private Date expirationDay = null;
	
	private Date createAt;
}
