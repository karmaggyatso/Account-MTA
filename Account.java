import java.io.InputStream;
import java.util.*;

public class Account {
	private int id;
	private double balance; 
	private double annualInterestRate;
	private double  monthlyInterestRate;
	public Account () {
		id = 0; 
		balance = 0;
		annualInterestRate = 0;
	}
	
	public Account (int newID, double newBalance) {
		setID(newID);
		setBalance(newBalance);
	}
	
	public void setID(int newID) {
		id = newID; 
	}
	
	public void setBalance( double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double NewAnnualInterestRate) {
		annualInterestRate = NewAnnualInterestRate;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate; 
	}
	
	public void setMonthlyInterestRate(double newMonthlyInterestRate) {
		newMonthlyInterestRate = (getAnnualInterestRate()*100)/12.0; //sets monthly interest rate
		monthlyInterestRate = newMonthlyInterestRate; 
	}
	
	public double getMonthlyInterestRate() { //returns monthly interest rate
		return monthlyInterestRate; 
	}
	
	public int getID() {
		return id; 
	}
	
		
	public void withDraw() {
		double amount;
		System.out.println("Enter amount you wish to withdraw. "); 
		Scanner input = new Scanner(System.in);
		amount = input.nextDouble(); 
		if (getBalance() > amount) {
			balance = balance - amount; 
			System.out.println("Withdraw succesful.");
		}
		else {
			System.out.println("Error: The withdraw amount is less than the balance. ");
		}
	}
	public void deposit() {
		double amount; 
		System.out.println("Enter amount you wish to deposit. ");
		Scanner input = new Scanner (System.in); 
		amount = input.nextDouble(); 
		if (amount > 0) {
			balance = balance + amount; 
			System.out.println("Your deposit has been accepted. ");
		}
		else {
			System.out.println("Error: The deposit amount should be greater than 0. ");
		}
	}
	
	public double getBalance() {
		return balance; 
	}

}
