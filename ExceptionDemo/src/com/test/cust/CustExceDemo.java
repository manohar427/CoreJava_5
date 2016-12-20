package com.test.cust;

public class CustExceDemo {

	public static void main(String[] args) {

		BankService bs = new BankService();
		String status = null;
		try
		{
			 status =bs.transferFunds(1000023, 101, 34343);
		}catch(NotEnoughfFunds e){
			System.out.println("No funds are available");
		}
		System.out.println("Status:"+status);
	}

}
