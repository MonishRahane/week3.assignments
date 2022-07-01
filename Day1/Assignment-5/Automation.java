package week3.day1.assignments;

public class Automation extends MultipleLanguage {

	//Implementing interface methods
	public void java() {
		System.out.println("Java");
		
	}
	public void selenium() {
		System.out.println("Selenium");
		
	}
	
	//Implementing method ruby
	public void ruby() {
		System.out.println("Ruby");
	}
	
	public static void main(String[] args) {
		//Creating object for class automation
		Automation obj = new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
	}
}
