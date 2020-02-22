package com.capgemini.epayment.user;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.epayment.bean.Atm;
import com.capgemini.epayment.bean.WalletUser;
import com.capgemini.epayment.services.EPaymentServices;
import com.capgemini.epayment.services.IEPaymentServices;

public class User {
	public static void main(String[] args) {

		IEPaymentServices service = new EPaymentServices();
		Scanner in = new Scanner(System.in);
		IEPaymentServices services = new EPaymentServices();
		while (true) {
			System.out.println("************WELCOME TO E-WALLET************");
			System.out.println();
			System.out.println("1.CREATE NEW ACCOUNT");
			System.out.println("2.VIEW ACCOUNTS");
			System.out.println("3. LOGIN TO EXISTING ACCOUNT");
			System.out.println("--ENTER YOUR CHOICE--");
			int choice = in.nextInt();
			switch (choice) {

			case 1:
				boolean valuePhone;

				WalletUser user = new WalletUser();
				Atm card1 = new Atm();
				System.out.println("Creating new E-Wallet account");
				System.out.println("Enter your name:");
				String name = in.next();
				System.out.println("Enter a valid phone number:");
				String phoneNumber = in.next();

				int count = 1;
				do {

					valuePhone = EPaymentServices.verifyPhoneNumber(phoneNumber);
					if (valuePhone == true)
						count = count - 1;
				} while (count != 0);

				valuePhone = EPaymentServices.verifyPhoneNumber(phoneNumber);
				System.out.println("Set your password:");
				String password = in.next();
				System.out.println("Re-enter the password correctly:");
				String password1 = in.next();

				boolean valuePassword = EPaymentServices.isValidPassword(password, password1);

				System.out.println("Enter the valid card details. ");
				System.out.println();
				System.out.println("Enter the valid card number:");
				long atmNumber = in.nextLong();
				System.out.println("Enter the valid cvv number:");
				int cvv = in.nextInt();
				System.out.println();
				card1.setAtmNumber(atmNumber);
				card1.setCvv(cvv);

				user.setUsername(name);
				user.setPassword(password);
				user.setPhoneNumber(phoneNumber);

				if (valuePhone && valuePassword) {

					boolean values = service.CreateAccount(card1, user);

					if (values) {
						System.out.println("Hurray..!" + name + " Your account is created successfully!");
					} else {
						System.out.println("Accoutn not Created");
					}
				} else {
					System.out.println("Enter Valid Details");
				}
				break;
			case 2:
				service.viewAccounts();

			}

		}
	}
}
