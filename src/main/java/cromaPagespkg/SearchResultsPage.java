package cromaPagespkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cromaUtilspkg.WaitUtils;

public class SearchResultsPage
{
	private WebDriver driver;
	
	@FindBy(xpath = "(//h3[contains(@class,'product-title')])[1]")
    private WebElement firstProduct;

	public SearchResultsPage(WebDriver driver)
	{
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	// Validate search results loaded
    public boolean isFirstProductVisible()
    {
        WaitUtils.waitForVisibility(driver, firstProduct);
        return firstProduct.isDisplayed();
    }

    // Click first product
    public void clickFirstProduct() 
    {
        WaitUtils.waitForClickable(driver, firstProduct);
        firstProduct.click();
    }
}