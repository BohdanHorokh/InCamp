package polymorphism;

/*
 *	Наслідування інтерфейсу 
 */
public class Developer implements Employee {

	private String name;
	private int age;
	private float salary;

	public Developer(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public void learn() {
		System.out.println(name + " Developer has to learn a lot!!!");
	}

	@Override
	public void eat() {
		System.out.println(name + " eats three time per day");
	}

	@Override
	public void comunicate() {
		System.out.println(name + " comunicate with other");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
