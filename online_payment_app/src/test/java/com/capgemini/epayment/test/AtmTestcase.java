package com.capgemini.epayment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.epayment.bean.WalletUser;
import com.capgemini.epayment.services.EPaymentServices;

class AtmTestcase {

	EPaymentServices service = new EPaymentServices();

	@Test
	public void testisValidPhoneNumber() {

		WalletUser user = new WalletUser();
		user.setPhoneNumber("6300835668");
		boolean flag = service.verifyPhoneNumber("6300835668");
		assertEquals(true, flag);

	}

}
