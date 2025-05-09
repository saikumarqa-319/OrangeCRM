package webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseMethods.BaseClass;

public class LoginPage extends BaseClass
{

	private static By ProfilePicture = By.xpath("(.//*[@alt='profile picture'])[1]");
	
	public static void verifyLogin()
	{
		Assert.assertEquals(getTitle(), "OrangeHRM");
		isDisplayed(ProfilePicture);
	}
	
}
