package baseMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseClass 


{
	static BrowserManager bgm = new BrowserManager();
	protected  static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
	
	public static void getDriver()
	{
		try {
			threadDriver.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void selectBrowser(String browserName)
	{
		WebDriver driver;

	    switch(browserName.toLowerCase()) {
	        case "chrome":
	            driver = bgm.getchromeDriver();
	            break;

	        case "edge":
	            driver = bgm.getedgeDriver();
	            break;

	        case "firefox":
	            driver = bgm.getfirefoxDriver();
	            break;

	        default:
	            throw new IllegalArgumentException("Browser not supported: " + browserName);
	    }

	    // Set it in ThreadLocal
	    threadDriver.set(driver);

	    // Now it's safe to use .get()
	    threadDriver.get().manage().window().maximize();
	    threadDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	 public static void openUrl(String url) 
	 {
	       threadDriver.get().get(url);
	    }
	 
	 public static void clickTheElement(By locator)
	 {


		 WebDriverWait wait = new WebDriverWait(threadDriver.get(), Duration.ofSeconds(10));
		 WebElement element = threadDriver.get().findElement(locator);
		 wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

		 
	 }

	 
	 public static void enterInput(By locator , String input)
	 {
		 try {
			WebElement element = threadDriver.get().findElement(locator);
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 public static String getTitle()

	 {
		 String title = threadDriver.get().getTitle();
		 
		 return title;
	 }
	 
	 public static void waitTime()
	 {
		
			/*
			 * WebDriverWait wait = new WebDriverWait(threadDriver.get(),
			 * Duration.ofSeconds(10)); wait.until(ExpectedConditions.visibilityOf(locator))
			 */
		 
		 threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static boolean isDisplayed(By locator)
	 {
		 try {
			 WebElement element = threadDriver.get().findElement(locator);
			 WebDriverWait wait = new WebDriverWait(threadDriver.get(), Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return true;
	 }
	@AfterTest
	 public static void closeTheBrowser()
	 {
		 if(threadDriver.get()!=null)
		 {
			 threadDriver.get().quit();
		 }
	 }
	   
	}
	
	


