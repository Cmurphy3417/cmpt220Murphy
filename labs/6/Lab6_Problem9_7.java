package Lab6;

import java.util.Date;

public class Lab6_Problem9_7 {
	public static class Account{
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		private Date dateCreated;
		
		//no arg constructor
		Account(){
			
		}
		
		Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}
		
		//accessor and mutator methods?
		
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		
		public double getBalance(){
			return balance;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		// Set annualInterestRate
		public void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}
		
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		
		//monthly interest
		public double getMonthlyInterestRate(){
			return annualInterestRate / 12;
			
		}
		//Return monthly interest
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		// Decrease balance by amount
		public void withdraw(double amount) {
			balance -= amount;
		}

		// Increase balance by amount
		public void deposit(double amount) {
			balance += amount;
		}
		
	}

}
