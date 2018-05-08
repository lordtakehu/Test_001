package javaTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.*;
//
public class Test_002 {
	@Test
	public void checkTitle() {
		System.setProperty("webdriver.gecko.driver","/home/fedora/Downloads/eclipse/geckodriver");
		System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");
		WebDriver driver = new FirefoxDriver();
		String link = TestAppEnv.getUrl();
		driver.get (link);
		WebElement a = driver.findElement(By.id("search_form_input_homepage"));
		String key=TestAppEnv.getKey();
		a.sendKeys(key+Keys.RETURN);
		assertEquals("Title should matched",key+" at "+link,driver.getTitle());
		driver.close();
	}
}