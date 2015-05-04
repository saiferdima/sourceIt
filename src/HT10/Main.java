package HT10;

public class Main {
    private static int currentClientId = 1;
    private static int currentAccountId = 1;
    

	public static void main(String[] args) {
		
		Client client1 = new Client("Ivanov Ivan Ivanovich");
		Client client2 = new Client("Petrov Petr Petrovich");
		Bank bank = new Bank("JSC Horns & Hooves");
		Account account1 = bank.openNewAccaunt(client1, 0);
		Account account2 = bank.openNewAccaunt(client2, 0);
		System.out.println(client1.getName()+"\nid= "+client1.getId());
		System.out.println(client2.getName()+"\nid= "+client2.getId());
		bank.addCredit(client1, account1, 1000);
		System.out.println("account 1 after 1000 credit:");
		System.out.println(account1.getAccountCurrentAmount());
		bank.addAmount(client1, account1, 2000);
		System.out.println("account 1 after 2000 amount");
		System.out.println(account1.getAccountCurrentAmount());
		bank.transfer(client1, account1, account2, 500);
		System.out.println("account 1 after transfer 500");
		System.out.println(account1.getAccountCurrentAmount());
		System.out.println("account 2 after transfer 500");
		System.out.println(account2.getAccountCurrentAmount());



		
		
		
		
		
		
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
