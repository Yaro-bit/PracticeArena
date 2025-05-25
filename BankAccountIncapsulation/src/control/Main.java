package control;

import model.*;

public class Main {
	public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.printAccountInfo();
        System.out.println();
        
        account.setAccountNumber("UA1234567890");
        account.printAccountInfo();
        System.out.println();
        
        account.deposit(500.0);
        account.printAccountInfo();
        System.out.println();
        
        account.withdraw(150.0);
        account.printAccountInfo();
	}
}
