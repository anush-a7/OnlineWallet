package com.capgemini.epayment.services;

import com.capgemini.epayment.bean.Atm;
import com.capgemini.epayment.bean.WalletUser;

public interface IEPaymentServices {

	boolean CreateAccount(Atm card1, WalletUser account);

	void viewAccounts();

}
