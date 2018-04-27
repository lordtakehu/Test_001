import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_002 {
	@Test
	public void checkTitle(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get = ("http://firefox.com");
		assertEquals("Title should matched","Firefox",driver.getTitle());
	}

}