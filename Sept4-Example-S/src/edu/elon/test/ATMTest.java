package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATMTest {
	
	ATM atm=new ATM();

	@Test()
	public void testDeposit() {
		double deposit=5;
		assertEquals("Balance should be 5",5.0,atm.deposit(deposit),0.0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void textDepositException(){
		atm.deposit(-3);
	}
	
	@Test
	public void testWithdraw(){
		double withdrawl=5;
		atm.deposit(15);
		assertEquals("Balance should be 10",10.0,atm.withdraw(withdrawl),0.0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testWithdrawException(){
		atm.deposit(5);
		atm.withdraw(10);
	}
	
	@Test
	public void testToString(){
		String expected="Amount balance is $10.00";
		atm.deposit(10);
		assertEquals(expected,atm.toString());
	}

}
