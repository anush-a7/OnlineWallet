package com.capgemini.epayment.storage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.capgemini.epayment.bean.WalletUser;

public class Storage {
	static Map<String,WalletUser> createUserList = new HashMap<String,WalletUser>();
	static Set<String> phoneNumberList = new HashSet<String>();

		

	public static boolean verifyPhoneNumber(String phoneNumber) {
		boolean flag=false;
		if(phoneNumberList.contains(phoneNumber)==false) {
			flag = true;
		}
		return flag;
	}

}
