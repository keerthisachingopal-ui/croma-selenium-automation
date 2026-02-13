package cromaUtilspkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {


	// Wait until element is visible and interactable
	public static WebElement waitForVisibility(WebDriver driver, By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement waitForClickable1(WebDriver driver, By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement waitForVisibility(WebDriver driver, WebElement element)
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForClick(WebDriver driver, WebElement element)
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static List<WebElement> waitForAllElements(WebDriver driver, List<WebElement> elements)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

	public static WebElement waitForClickable(WebDriver driver, WebElement locationBtn) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    return wait.until(ExpectedConditions.elementToBeClickable(locationBtn));
		    
		
	}

	public static WebElement waitForPresence(WebDriver driver, By locationBtn) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        return wait.until(ExpectedConditions.presenceOfElementLocated(locationBtn)); 
		
	}
	public static WebElement waitForClickable(WebDriver driver, By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
	public static void waitForInvisibility(WebDriver driver, WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.invisibilityOf(element));
		
	}

	
		
	}
	
	
		
		
	

		
	


