package priv.jjzhai.suitetwotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage(){
		System.out.println("inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}
