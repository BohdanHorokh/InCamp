package polymorphism;

/*
 *  Відображення типу зв'зку "IS-A"
 *  
 *  Усунення дублювання специфікації класу Developer (поля та методи)
 */

public class PHPDeveloper extends Developer {

	private String company;

	public PHPDeveloper(String name, int age, float salary, String comany) {
		super(name, age, salary);
		this.company = comany;
	}

	@Override
	public void learn() {
		System.out.println("PHP Developer who works in : " + company + " has to learn a lot about WEB");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
