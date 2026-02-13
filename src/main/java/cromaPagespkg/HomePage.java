package cromaPagespkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cromaUtilspkg.WaitUtils;


public class HomePage
{
	private WebDriver driver;
	
//....... Search box( Static Elements ).........//
	
	@FindBy(css = "a.user-link")
	private WebElement accountIcon;
	
	// My Profile icon
	@FindBy(css = "a[href*='my-account']")
	private WebElement myProfileIcon;

	// Login popup container
	@FindBy(xpath = "//div[contains(@class,'login') or contains(text(),'OTP')]")
	private WebElement loginPopup;
	
	// Phone number input in login popup
		//@FindBy(xpath = "//input[@type='tel' or contains(@placeholder,'Mobile')]")
	//	private WebElement phoneNumberInput;
	
	By phoneInput = By.cssSelector("input.mobile-input-box.input-login");


	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement continueBtn;
	
	// Login popup close button
	@FindBy(css = "button.icon-close")
	private WebElement loginPopupCloseBtn;
	
	//@FindBy(css = "button.login-btn") // update selector
	//private WebElement loginBtn;
	
	@FindBy(css = "a.logo, a.header-logo")
	private WebElement cromaLogo;
	
	@FindBy(css = "span.menu-icon-hamb")
	private WebElement hamburgerMenu;
	
    @FindBy(id = "searchV2")
    private WebElement searchBox;
    
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void mousehoverOnAccountIcon()
    {
    	WaitUtils.waitForVisibility(driver, accountIcon);
    	Actions actions = new Actions(driver);
        actions.moveToElement(accountIcon).perform();
        
    }
    
    public void clickMyProfile() {
        WaitUtils.waitForClickable(driver, myProfileIcon);
        myProfileIcon.click();
    }

    public boolean isLoginPopupVisible() {
        WaitUtils.waitForVisibility(driver, loginPopup);
        return loginPopup.isDisplayed();
    }

    public boolean isPhoneNumberFieldVisible() {
        WaitUtils.waitForVisibility(driver, phoneInput);
        return driver.findElement(phoneInput).isDisplayed();
    }
    
    public void enterPhonenumber(String number)
    {
    	
    	WebElement phoneField = WaitUtils.waitForVisibility(driver, phoneInput);

        phoneField.clear();
        phoneField.sendKeys(number);
    	
    }
    public void clickContinueBtn()
    {
    	WebElement btn = WaitUtils.waitForClickable(driver, continueBtn);
    	btn.click(); 	
    }
    
    public void closeLoginPopup() {
        try {
            WaitUtils.waitForClickable(driver, loginPopupCloseBtn);
            loginPopupCloseBtn.click();
            System.out.println("Login popup closed.");
            
            WaitUtils.waitForInvisibility(driver, loginPopup);
        } catch (Exception e) {
            System.out.println("Login popup close button not found or already closed.");
        }}
   
    public void clickLogo() {
        WaitUtils.waitForClickable(driver, cromaLogo);
        cromaLogo.click();
    }
    
    public boolean isHamburgerMenuVisible() {
        WaitUtils.waitForVisibility(driver, hamburgerMenu);
        return hamburgerMenu.isDisplayed();
    }
  
//............Home Page validation......//
    
    public boolean issearchboxVisibe()
    {
    	WaitUtils.waitForVisibility(driver, searchBox);
    	return  searchBox.isDisplayed();
    }
    //...............Location Selection.........//
   

    public void searchProduct(String productName) {
        WaitUtils.waitForVisibility(driver, searchBox);
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
}

