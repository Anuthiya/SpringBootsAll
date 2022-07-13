package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	private int loanAmount;
	private String loanerName;
	private int emiMonths;
	private int interestAmount;

	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
		
	}
	
	public void setLoanAmount(int loanAmount) {
		this.loanAmount=loanAmount;
	}
	public void setLoanerName(String loanerName) {
		this.loanerName=loanerName;
	}
	public void setEmiMonths(int emiMonths) {
		this.emiMonths=emiMonths;
	}
	public void setInterestAmount(int interestAmount) {
		this.interestAmount=interestAmount;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public String getLoanerName() {
		return loanerName;
	}
	public int getEmiMonths() {
		return emiMonths;
	}
	public int getInterestAmount() {
		return interestAmount;
	}
	
	


		
	}


