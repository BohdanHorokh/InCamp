package encapsulation;

public class BankAccount {

	/*
	 * оголошуючи модифікатори доступу до полів класу як private, ми приховуємо
	 * деталі реалізації класу тим самим користувачі класу не зможуть змінити
	 * поведінку об'єкта, в даному випадку користувач має можливість лише взнати
	 * баланс рахунку через гетер, але не змінити його напряму лише через методи
	 * користуванням разунку , тобто він не може порушити правильну логіку
	 * роботи програми.
	 */
	private int id;
	private float balance;

	public BankAccount(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public void putMoney(float amount) {
		balance += amount;
	}

	public void getMoney(float amount) {
		if (balance > amount) {
			balance -= amount;
		} else {
			System.out.println("You don`t have enough money");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBalance() {
		return balance;
	}

}
