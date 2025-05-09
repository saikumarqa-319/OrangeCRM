package webPages;

import org.openqa.selenium.By;

import baseMethods.BaseClass;

public class PimPage extends BaseClass
{
	private static By pimMenuOption = By.xpath(".//*[@class='oxd-main-menu-item active']");
	private static By employeeName =   By.xpath("(.//*[@placeholder='Type for hints...'])[1]");
	private static By supervisorName =  By.xpath("(.//*[@placeholder='Type for hints...'])[2]");
    private static By employeeId     = By.xpath(".//*[text()='Employee Id']//following::div//input[@class='oxd-input oxd-input--active']");
    private static By noRecordsFoundMsg = By.xpath(".//*[@class='oxd-text oxd-text--span']");
    private static By searchBtn      = By.xpath(".//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");   
    
    public void leaveRequest()
    {
    	clickTheElement(pimMenuOption);
    	enterInput(employeeName, "RajkumarHirani");
    	enterInput(employeeId, "316");
    	enterInput(supervisorName, "Dayasagar");
    	clickTheElement(searchBtn);
    }
}
