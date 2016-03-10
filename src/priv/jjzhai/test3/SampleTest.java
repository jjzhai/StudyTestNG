package priv.jjzhai.test3;

import org.testng.Assert;
import org.testng.annotations.Test;

class SampleTest {
	
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
