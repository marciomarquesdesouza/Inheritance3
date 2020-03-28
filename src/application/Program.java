package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingAccount(1001, "Maria", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Vanessa", 1000.0, 400.0));
		list.add(new SavingAccount(1003, "Marcio", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Ian", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}