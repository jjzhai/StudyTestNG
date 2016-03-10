package priv.jjzhai.test4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		System.out.println("inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
