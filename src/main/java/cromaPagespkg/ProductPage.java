package cromaPagespkg;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cromaUtilspkg.WaitUtils;

public class ProductPage 
{
	private WebDriver driver;

	// Add to Cart button
	
	@FindBy(xpath = "//button[contains(@class,'buyNowBtn')]")
	private WebElement buyNowBtn;
	
	@FindBy(xpath = "//button[contains(.,'Add') and contains(.,'Cart')]")
    private WebElement addToCartBtn;
	
    // Cart icon (appears after adding product)
    @FindBy(xpath = "//a[contains(@href,'/cart')]")
    private WebElement cartIcon;

    public ProductPage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Validate product page loaded
    public boolean isAddToCartVisible() {
        WaitUtils.waitForVisibility(driver, addToCartBtn);
        return addToCartBtn.isDisplayed();
    }

    // Add product to cart
    public void clickAddToCart() {
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});",addToCartBtn);
    	 
    	 try {
    	
    	WaitUtils.waitForInvisibility(driver, buyNowBtn);
    	 }catch (Exception e) {
    	 }
    	
    	 
        WaitUtils.waitForClickable(driver, addToCartBtn);
        try {
        addToCartBtn.click();
    }catch (ElementClickInterceptedException e) {
    	((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", addToCartBtn);
    }}

    // Navigate to cart
    public void goToCart() {
        WaitUtils.waitForClickable(driver, cartIcon);
        cartIcon.click();
    }
}


