package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseMethods.BaseClass;

public class HomePage extends BaseClass
{
	
	private static By whyhome = By.xpath("//*[text()='Why OrangeHRM']");
	
	private static By userNameField = By.name("username");
	private static By passwordField = By.name("password");
	private static By loginButton   = By.xpath(".//*[@type='submit']");
	private static By myInfoiCON = By.xpath(".//*[text()='My Info']");
	public static void whyhomeee()
	{
		clickTheElement(whyhome);
	}

 public  static void clickMyInfo()
{
	clickTheElement(myInfoiCON);
}
	public static void Login() {
		enterInput(userNameField, "Admin");
		enterInput(passwordField, "admin123");
		clickTheElement(loginButton);
	}
}
