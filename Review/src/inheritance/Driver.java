package inheritance;

public class Driver {
	public static void main(String[] args) {
		Worker a = new Roofer("hello");
		Roofer b = new Roofer("bye");
		
		a.setString();
		b.setString();
		
		System.out.println(a.getString() + " " + b.getString());
	}
	
}
