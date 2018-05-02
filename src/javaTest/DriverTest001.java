package javaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverTest001{
	public static void main (String [] arg) throws Exception{
		System.setProperty("webdriver.gecko.driver", "/home/fedora/Downloads/eclipse/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String url= String (TestAppEnv.getUrl());
		driver.get(url);
	}

	private static String String(Object url) {
		// TODO Auto-generated method stub
		return null;
	}
}
