package encapsulation;

public class Client {

	private String firstName;
	private String lastName;
	private BankAccount account;

	public Client(String firstName, String lastName, BankAccount account) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}

	public void showInfo() {
		System.out.println("Client : " + firstName + ", " + lastName + " " + "has " + account.getBalance() + " grn.");
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

}
