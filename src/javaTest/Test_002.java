package javaTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Test_002 {
	@Test
	public void checkTitle(){
		System.setProperty("webdriver.gecko.driver","/home/fedora/Downloads/eclipse/geckodriver");
		System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");
		WebDriver driver = new FirefoxDriver();
		driver.get ((String) TestAppEnv.getUrl());
		assertEquals("Title should matched","Download Firefox — Free Web Browser",driver.getTitle());
	}
}