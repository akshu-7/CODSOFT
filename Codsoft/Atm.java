package codsoft;
import java.util.Scanner;
public class Atm {
	private static double balance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
            	checkBalance();
                break;
            case 2:
            	deposit(scanner);
                break;
            case 3:
            	withdraw(scanner);
                break;
            case 4:
            	System.out.println("Thank you for using the ATM. Goodbye!");
                scanner.close();
                return;
            default:
            	System.out.println("Invalid option. Please choose again.");
            }
		}

	}
	 private static void checkBalance() {
		 System.out.println("Your current balance is: $" + balance);
	 }
	 private static void deposit(Scanner scanner) {
		 System.out.print("Enter amount to deposit: $");
	     double amount = scanner.nextDouble();
	     if (amount > 0) {
	    	 balance += amount;
	         System.out.println("$" + amount + " deposited successfully.");
	         checkBalance();
	     }
	     else {
	    	 System.out.println("Invalid amount. Please enter a positive value.");
	     }
	 }
	 private static void withdraw(Scanner scanner) {
		 System.out.print("Enter amount to withdraw: $");
	     double amount = scanner.nextDouble();
	     if (amount > 0 && amount <= balance) {
	    	 balance -= amount;
	         System.out.println("$" + amount + " withdrawn successfully.");
	         checkBalance();
	     }
	     else if (amount > balance) {
	    	 System.out.println("Insufficient funds.");
	     }
	     else {
	    	 System.out.println("Invalid amount. Please enter a positive value.");
	     }
	 }

}
