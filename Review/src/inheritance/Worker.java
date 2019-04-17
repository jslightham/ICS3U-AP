package inheritance;

public class Worker {
	protected String test;
	public Worker(String test) {
		this.test = test;
	}
	
	public String setString() {
		test = "a";
		return test;
	}
	
	public String getString() {
		return test;
	}
}
