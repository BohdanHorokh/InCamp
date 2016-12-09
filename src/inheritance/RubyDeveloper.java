package inheritance;

/*
 *  Відображення типу зв'зку "IS-A"
 *  
 *  Усунення дублювання специфікації класу Developer (поля та методи) 
 */
public class RubyDeveloper extends Developer {

	private float experience;

	public RubyDeveloper(String name, int age, float salary, float experience) {
		super(name, age, salary);
		this.experience = experience;
	}

	@Override
	public void learn() {
		System.out.println(
				"Ruby Developer " + getName() + " with " + experience + " work experience is clever enough :)");

	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

}
