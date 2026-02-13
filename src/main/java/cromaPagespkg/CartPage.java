package cromaPagespkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cromaUtilspkg.WaitUtils;

public class CartPage 
{
	private WebDriver driver;
	
	@FindBy(css = "span.your-cart")
	private WebElement cartTitle;
	
	@FindBy(css = "button.checkout-btn")
	private WebElement checkoutBtn;

	@FindBy(css = "a.logo, a.header-logo")
	private WebElement homeLogo;
	

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isCartTitleVisible() {
        WaitUtils.waitForVisibility(driver, cartTitle);
        return cartTitle.isDisplayed() && cartTitle.getText().equalsIgnoreCase("Your Cart");
    }
    
    public boolean isCheckoutButtonVisible() {
        WaitUtils.waitForVisibility(driver, checkoutBtn);
        return checkoutBtn.isDisplayed();
    }
    
    public void clickLogoAndGoHome() {
        WaitUtils.waitForClickable(driver, homeLogo);
        homeLogo.click();
    }
    
}

    

    

   