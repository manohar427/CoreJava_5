package com.test.cust;

public class CustExceDemo {

	public static void main(String[] args) {

		BankService bs = new BankService();
		String status = null;
		try
		{
			System.out.println("Connect DB");
			 status =bs.transferFunds(1000023, 99, 34343);
			// System.out.println("Close DB connection 1");
		}catch(NotEnoughfFunds e){
			System.out.println("No funds are available");
		}finally{
			System.out.println("Close DB connection 2");
		}
		System.out.println("Status:"+status);
	}

}
