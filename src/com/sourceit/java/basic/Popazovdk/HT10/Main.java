package com.sourceit.java.basic.Popazovdk.HT10;

public class Main {
    private static int currentClientId = 1;
    private static int currentAccountId = 1;
    

	public static void main(String[] args) {
		
		Client client1 = new Client("Ivanov Ivan Ivanovich");
		Client client2 = new Client("Petrov Petr Petrovich");
		Bank bank = new Bank("JSC Horns & Hooves");
		Account account1 = bank.openNewAccaunt(client1, 0);
		Account account2 = bank.openNewAccaunt(client2, 0);		
		bank.addCredit(client1, account1, 1000);
		account1.printAccountCurrentAmount();
		bank.addAmount(client1, account1, 2000);
		account1.printAccountCurrentAmount();
		bank.transfer(client1, account1, account2, 500);
		account1.printAccountCurrentAmount();
		account2.printAccountCurrentAmount();

	}
	
	public static int getCurrentClientId(){		
		return currentClientId;
	}
	
	public static void increaceCurrentClientId(){		
		currentClientId=currentClientId+1;
	}
	
	public static int getCurrentAccounttId(){		
		return currentAccountId;
	}
	
	public static void increaceCurrentAccountId(){		
		currentAccountId=currentAccountId+1;
	}

	


}
