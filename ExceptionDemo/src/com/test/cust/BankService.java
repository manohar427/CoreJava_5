package com.test.cust;


public class BankService {

	public String transferFunds(int fromAcc,int amount,int toAcc)throws NotEnoughfFunds{
		
		System.out.println("entry ");
		int totalBalance = 100;
		if(amount>totalBalance){
			throw new NotEnoughfFunds("Not Enough funds to transfer");
		}
		//Connect to DB
		//Transfer funds
		System.out.println("exit ");
		return "Success";
	}

}

class NotEnoughfFunds extends Exception{

	public NotEnoughfFunds(String excMessage) {
		super(excMessage);
	}
}