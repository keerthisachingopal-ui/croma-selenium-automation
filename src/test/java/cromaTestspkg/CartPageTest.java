package cromaTestspkg;


import org.testng.annotations.Test;

import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;


public class CartPageTest extends BaseTest

{
	@Test
	public void verifyCartpageTitle()
	{
		test = extent.createTest("Verify Cartpage Title");
	    productPage.goToCart();
	    
		cartPage.isCartTitleVisible();
		test.pass("Your Cart: Title is visible");
	}
	
	
@Test
public void productAddedandclickLogo()
{

	test = extent.createTest("Add product and return to Home via Cart logo");
	//productPage.clickAddToCart();
	//productPage.goToCart();
	//cartPage.isCheckoutButtonVisible();
	//test.pass("Checkout Button Visible");
	
	cartPage.clickLogoAndGoHome();
	
	//................Screenshot...........//
	
    String path = Screenshots.takeScreenshot(driver, "CartPageTest_Success");
    test.addScreenCaptureFromPath(path);
    test.pass("Clicked logo and returned to home page");
}
}
