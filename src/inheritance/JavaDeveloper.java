package inheritance;

/*
 *  Відображення типу зв'зку "IS-A"
 *  
 *  Усунення дублювання специфікації класу Developer (поля та методи)
 */

public class JavaDeveloper extends Developer {

	private String position;

	public JavaDeveloper(String name, int age, float salary, String position) {
		super(name, age, salary);
		this.position = position;
	}

	@Override
	public void learn() {
		System.out.println("Java Developer " + getName() + " on position " + position
				+ " has to know a lot about Hibernate, Spring MVC, SQL,  AngularJS, Unit Testing and other");
	}

	public void showInfoAboutLanguage() {
		System.out.println("Java is very cool");
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
