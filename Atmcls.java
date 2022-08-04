package Atmprojects;

import java.util.Scanner;

public class Atmcls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 100000, withdraw, deposit;
		System.out.println("Welcome to ATM Banking");
		int account_no = 54321;
		int pin_no = 2580;
		System.out.println("Please enter Account NO");
		int Account_No = sc.nextInt();
		if (Account_No == account_no) {
			System.out.println("Please enter PIN Number");
			int Ping_No = sc.nextInt();
			if (Ping_No == pin_no) {
				while (true) {
					System.out.println("Automated Teller Machine");
					System.out.println("Choose 1 for Withdraw");
					System.out.println("Choose 2 for Deposit");
					System.out.println("Choose 3 for Check Balance");
					System.out.println("Choose 4 for EXIT");
					System.out.print("Choose the operation you want to perform:");
					int opertion = sc.nextInt();
					switch (opertion) {
					case 1:
						System.out.print("Enter money to be withdrawn:");
						withdraw = sc.nextInt();
						if (balance >= withdraw) {
							balance = balance - withdraw;
							System.out.println("Please collect your money");
						} else {
							System.out.println("Insufficient Balance");
						}
						System.out.println("");
						break;
					case 2:
						System.out.print("Enter money to be deposited:");
						deposit = sc.nextInt();
						balance = balance + deposit;
						System.out.println("Your Money has been successfully depsited");
						System.out.println("");
						break;
					case 3:
						System.out.println("Balance : " + balance);
						System.out.println("");
						break;

					case 4:
						System.exit(0);
						break;
					}
				}
			} else {
				System.out.println("Your entered Wrong Pin Number Please Enter Correct Pin Number");
			}
		} else {
			System.out.println("wrong account Number please enter correct account Number");
		}

	}

}
