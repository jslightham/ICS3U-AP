package com.bayviewglen.thinkingcap;

public class ThinkingCap {

	/* private instance variable/member
	 * every instance of the class (each object)
	 * gets its own instance variables
	 * 
	 * They also get their own instance methods.
	 * The instance methods belong to the object.
	 */
	
	// Member variables
	// Non static members belong to the Object
	// Define state if the object
	private String m_redWords;
	private String m_greenWords;
	
	// Static members belong to the class
	private static String m_blueWords;
	
	// methods describe the behavior of the object
	
	public ThinkingCap(String redWords, String greenWords) {
		this.m_redWords = redWords;
		this.m_greenWords = greenWords;
	}
	// this refers to an instance of this class
	// if code elsewhere was called cap1 = ThinkingCap("a", "b");
	// then "this" is another way to represent cap1
	public ThinkingCap(String redWords, String greenWords, String blueMsg) {
		this.m_redWords = redWords;
		this.m_greenWords = greenWords;
		m_blueWords = blueMsg;
	}
	
	
	public String pushRed() {
		return m_redWords;
	}
	
	public String pushGreen() {
		return m_greenWords;
	}
	
	public static String pushBlue() {
		return m_blueWords;
	}
	
	public void insertGreen(String msg) {
		m_greenWords = msg;
	}
	
	public void insertRed(String msg) {
		m_redWords = msg;
	}
	
	public static void insertBlue(String msg) {
		m_blueWords = msg;
	}
}
