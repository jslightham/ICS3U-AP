package inheritance;

public class Roofer extends Worker{
	public Roofer(String test) {
		super(test);
	}
	
	public String setString() {
		test = "b";
		return test;
	}
	
}
