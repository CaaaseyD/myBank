package com.myBank;

public class Account {

	protected double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt){
		this.balance += amt;
		return true;
	}

	public void withdraw(double amt) {

		if(amt > balance){
			throw new OverdraftException("You dont have sufficient amount", amt - balance);
		}
		
		this.balance -= amt;
	}
	
}
