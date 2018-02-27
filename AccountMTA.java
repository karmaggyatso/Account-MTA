import java.util.*;
public class AccountMTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans; int opt;
		Account obj = new Account (1103415, 400); 
		Scanner input = new Scanner(System.in);
		obj.setID(1301234);
		obj.setBalance(500);
		obj.setAnnualInterestRate(0.04);
		do {
			System.out.println("Press given numbers to proceed. ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Print Account Details");
			System.out.println("4. Exit");
			opt = input.nextInt(); 
			
			switch(opt){
			case 1: 
				obj.deposit();
				break; 
				
			case 2: 
				obj.withDraw();
				break; 
			
			case 3:
				System.out.println("Your ID# " + obj.getID());
				System.out.println("Your account balance: " + obj.getBalance());
				break; 
				
			case 4: 
				System.exit(0);
				break; 
				
			default: 
				System.out.println("Invalid Entry. Please try again. ");
				break; 
			}
			System.out.println("Do you want to continue. Type yes to continue or anything to exit"); 
			ans = input.next();
		}while (ans.equalsIgnoreCase("yes"));
		System.out.println("Annual Interest "+ obj.getAnnualInterestRate() + " monthly interest rate: " + obj.getMonthlyInterestRate());

	}

}
