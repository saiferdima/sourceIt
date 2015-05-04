package HT10;

public class Account {
	
	private int clientId = 0;
	private int accountId = 0;
	private float currentAmount = 0;
	private float creditAmount = 0;
	private String ownerName = "noName";

	public Account(Client client,float amount) {
		this.ownerName=client.getName();
		this.currentAmount=amount;
		this.clientId=client.getId();
		this.accountId=Main.getCurrentAccounttId();
		Main.increaceCurrentAccountId();
		System.out.println("New account on name "+ownerName+" created successful with current amount "+currentAmount);
		
	}
	
	public int getClientId(){
		return clientId;
	}
	public int getAccountId(){
		return accountId;
	}
	
	public float getAccountCurrentAmount(){
		return currentAmount;
	}
	
	public void printAccountCurrentAmount(){
	System.out.println("\naccountid "+accountId+"\nCurrentAmount = "+currentAmount+"("+creditAmount+" credit amount)\n");;
	}


	public void addAmount(float amount) {
		currentAmount=currentAmount+amount;
		
	}
	
	public void addCreditAmount(float amount) {
		creditAmount=creditAmount+amount;
		
	}
	
	

}
