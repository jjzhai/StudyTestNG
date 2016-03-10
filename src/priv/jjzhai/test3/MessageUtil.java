//http://www.yiibai.com/html/testng/2013/0915297.html
//TestNG÷¥––≤‚ ‘

package priv.jjzhai.test3;

public class MessageUtil {
	private String message;
	
	//Constructor
	//@param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}
	
	//print the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
