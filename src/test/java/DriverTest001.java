import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverTest001 {
	public WebDriver driver;
	public String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get(
				"http://aws-jt-tt-17.ec2.gbst.net:1518/member-zone.html?error=unsupported_grant_type%20:%20Unsupported%20grant%20type:%20undefined");
		driver.findElement(By.id("preDefinedTokenContext")).click();
		new Select(driver.findElement(By.id("preDefinedTokenContext"))).selectByVisibleText("Adviser - (token001)");
		driver.findElement(By.name("loginButton")).click();
		driver.findElement(By.id("ember770")).click();
		driver.findElement(By.xpath("//a[contains(@href, '/adviser/client/11178')]")).click();
	}
	/*
	 * @After public void tearDown() throws Exception { driver.quit(); String
	 * verificationErrorString = verificationErrors.toString(); if
	 * (!"".equals(verificationErrorString)) { fail(verificationErrorString); } }
	 * 
	 * private boolean isElementPresent(By by) { try { driver.findElement(by);
	 * return true; } catch (NoSuchElementException e) { return false; } }
	 * 
	 * private boolean isAlertPresent() { try { driver.switchTo().alert(); return
	 * true; } catch (NoAlertPresentException e) { return false; } }
	 * 
	 * private String closeAlertAndGetItsText() { try { Alert alert =
	 * driver.switchTo().alert(); String alertText = alert.getText(); if
	 * (acceptNextAlert) { alert.accept(); } else { alert.dismiss(); } return
	 * alertText; } finally { acceptNextAlert = true; } }
	 */
}