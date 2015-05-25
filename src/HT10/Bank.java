package HT10;

public class Bank {
	
	public String bankName;
	
	
public Bank(String name){
	this.bankName= name;
	
}
	
	
	
public	Account openNewAccaunt(Client client, long amount){
		Account accaunt = new Account(client, amount);
		
		return accaunt;
	}

public void addAmount(Client client, Account account,long amount){
	if(accountValidation(client,account)){
		account.addAmount(amount);
		System.out.println(client.getName()+" added  amount: "+amount+" to account "+account.getAccountId());
	}
	else {
		System.out.println("Account not assign to this user");
		
	}
}


	public void addCredit(Client client, Account account,long amount){
		if(accountValidation(client,account)){
			account.addCreditAmount(amount);
			account.addAmount(amount);
			System.out.println(client.getName()+" added credit amount: "+amount+" to account "+account.getAccountId());
		}
		else {
			System.out.println("Account not assign to this user");
			
		}
		
		
		
}
	
	public void transfer(Client clientFrom, Account accountFrom,Account accountTo,long amount){
		if(accountValidation(clientFrom,accountFrom)){
			if(amountValidation(accountFrom,amount)){
			accountFrom.addAmount(-amount);
			accountTo.addAmount(amount);
			System.out.println("Transfer from account "+accountFrom.getAccountId()+" to account "+accountTo.getAccountId()+" on amount = "+amount+" completed successful");
			}
			
		}
		
		
	}
	
	public void withdrawals(Client client , Account account,long amount){
		if(accountValidation(client, account)){
			if(amountValidation(account, amount)){
			account.addAmount(-amount);	
			System.out.println("Withdrawals success");}
			}
		}
		
		

	
	private boolean accountValidation(Client client, Account account){
		
		if(client.getId()==account.getClientId()){
			return true;
		}
		else {
			System.out.println("accountValidation failed");
			return false;
		}
	}
	
	
	
	private boolean amountValidation(Account account, float amount ){
		
		if(account.getAccountCurrentAmount()>=amount){
			return true;
		}
		else {
			System.out.println("amountValidation failed");
			return false;
		}
	}
	
	
	
	

}
