package priv.jjzhai.suitetwotest;

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
