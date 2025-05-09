package webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseMethods.BaseClass;

public class AdminPage extends BaseClass 
{
	private static By adminOptn = By.xpath("(.//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
	private static By userName  = By.xpath("(.//*[@class='oxd-input oxd-input--active'])[2]");
	private static By noRecordsFound = By.xpath(".//*[text()='No Records Found']");
	private static By SearchButton = By.xpath(".//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	
	
	public static void admin()
	{
		//waitTime();
		clickTheElement(adminOptn);
		enterInput(userName, "Saojhass");
		clickTheElement(SearchButton);
		boolean truedis = isDisplayed(noRecordsFound);
		Assert.assertEquals(truedis, true);
	}

}
