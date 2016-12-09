package polymorphism;

public class TestPolymorphism {

	/*
	 * Робота клієнтського коду з інтерфейсом
	 * 
	 */

	public static void test(Employee employee) {
		employee.learn();
	}

	static void testAll(Employee[] employee) {
		for (Employee employee2 : employee) {
			test(employee2);
		}
	}

	public static void main(String[] args) {

		Developer developer1, developer2, developer3, developer4;

		developer1 = new Developer("Oleg", 22, 300);
		developer2 = new JavaDeveloper("Bohdan", 28, 350, "junior");
		developer3 = new RubyDeveloper("Victor", 27, 1000, 2);
		developer4 = new PHPDeveloper("Irynka", 28, 3000, "ITSolution");

		developer1.eat();
		developer2.eat();
		developer3.eat();
		developer4.eat();

		/*
		 * Демонстрація різної поведінки об'ктів, які підтримують загальний
		 * інтерфейс, в залежності від конкретного реального типу
		 * 
		 */
		developer1.learn();
		developer2.learn();
		developer3.learn();
		developer4.learn();

		System.out.println("-------------------------------------------------------------");

		Employee[] employees = { developer1, developer2, developer3, developer4 };

		testAll(employees);

	}

}
