package inheritance;

public class Employer {

	public static void main(String[] args) {
		Developer developer = new Developer("Oleg", 22, 300);
		JavaDeveloper java = new JavaDeveloper("Bohdan", 28, 350, "junior");
		RubyDeveloper ruby = new RubyDeveloper("Victor", 27, 1000, 2);
		PHPDeveloper php = new PHPDeveloper("Irynka", 28, 3000, "ITSolution");
		
		developer.comunicate();
		developer.eat();
		developer.learn();
		
		java.learn();
		java.comunicate();
		java.eat();
		java.getName();
		ruby.learn();
		php.learn();
	}
}
