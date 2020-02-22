package com.capgemini.epayment.services;

import java.util.Random;

import com.capgemini.epayment.bean.Atm;
import com.capgemini.epayment.bean.WalletUser;
import com.capgemini.epayment.dao.EPaymentDAO;
import com.capgemini.epayment.dao.IEPaymentDAO;
import com.capgemini.epayment.exception.InValidPasswordException;
import com.capgemini.epayment.exception.PhoneNumberException;
import com.capgemini.epayment.storage.Storage;

public class EPaymentServices implements IEPaymentServices {
	IEPaymentDAO doaObject = new EPaymentDAO();

	public boolean CreateAccount(Atm card1, WalletUser account) {

		return doaObject.CreateAccount(card1, account);
	}

	public static boolean verifyPhoneNumber(String phoneNumber) {
		boolean flag = false;
		if (phoneNumber.matches("[6-9][0-9]{9}")) {
			flag = Storage.verifyPhoneNumber(phoneNumber);
		} else {
			try {
				throw new PhoneNumberException("Enter a valid phone number");
			} catch (PhoneNumberException e) {

			}
		}
		System.out.println(flag);
		return flag;
	}

	public static boolean isValidPassword(String password, String password1) {
		boolean flag = false;

		if (password.equals(password1)) {

			flag = true;
		} else {
			try {
				throw new InValidPasswordException("Incorrect Password");
			} catch (InValidPasswordException e) {

			}
		}
		return flag;
	}

	public void viewAccounts() {

		doaObject.viewAccounts();
	}

	public void isValiduserId(WalletUser user) {

		String id = String.valueOf(user.getUserId());
		boolean flag = id.matches("[0-9]{4}");

	}
}
