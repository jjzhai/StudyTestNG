//http://www.yiibai.com/html/testng/2013/0915298.html
//TestNGÌ×¼ş²âÊÔ

package priv.jjzhai.test4;

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
	
	//add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
}
