package com.capgemini.epayment.dao;

import com.capgemini.epayment.bean.Atm;
import com.capgemini.epayment.bean.WalletUser;

public interface IEPaymentDAO {
	boolean CreateAccount(Atm card1, WalletUser account);

	void viewAccounts();

}
