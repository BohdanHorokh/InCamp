package encapsulation;

public class BankSystem {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(31, 10_000);
		Client client = new Client("Bohdan", "Horokh", account);

		client.showInfo();

		client.getAccount().getMoney(3500);
		client.showInfo();

		client.getAccount().getMoney(2000);
		client.showInfo();

		client.getAccount().getMoney(3500);
		client.showInfo();
		
		client.getAccount().getMoney(3500);
		client.showInfo();
	}
}
