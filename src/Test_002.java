import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_002 {
	@Test
	public void checkTitle(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get = (TestAppEnv.getUrl());
		assertEquals("Title should matched","Firefox",driver.getTitle());
	}

}