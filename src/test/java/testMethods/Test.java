package testMethods;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import baseMethods.BaseClass;
import baseMethods.DriverFactory;
import webPages.AdminPage;
import webPages.HomePage;
import webPages.PimPage;

public class Test extends BaseClass
{

private	HomePage hm = new HomePage();
private PimPage pim = new PimPage();
private AdminPage adp = new AdminPage();


	

@org.testng.annotations.Test

@Parameters({"browserName"})
public  void launch(String browserName)
{
	selectBrowser(browserName);
	openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	hm.Login();
	//pim.leaveRequest();
	adp.admin();
	
}
	

	
}
