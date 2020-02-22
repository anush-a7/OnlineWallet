package com.capgemini.epayment.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.capgemini.epayment.bean.Atm;
import com.capgemini.epayment.bean.WalletUser;

public class EPaymentDAO implements IEPaymentDAO {
	Map<Atm, WalletUser> map = new HashMap<Atm, WalletUser>();

	public boolean CreateAccount(Atm card1, WalletUser account) {

		Random random = new Random();
		int idNumber = random.nextInt(1000) + 1000;
		account.setUserId(idNumber);
		boolean number = false;

		WalletUser value = map.put(card1, account);
		System.out.println(map);

		if (value == null) {
			number = true;
		}

		return number;
	}

	public void viewAccounts() {

		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Atm key = (Atm) it.next();
			System.out.println(key + " " + map.get(key));
		}

	}

}
