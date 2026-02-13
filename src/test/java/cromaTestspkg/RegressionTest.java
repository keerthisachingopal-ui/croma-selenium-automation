package cromaTestspkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;
import cromaUtilspkg.WindowUtils;

public class RegressionTest extends BaseTest
{
@Test
public void regressionFlowTest()
{
	test = extent.createTest("Regression Test From Home to Cart");
	// Home page
    Assert.assertTrue(homePage.issearchboxVisibe(),"Search box not visible");
    test.pass("Home page loaded");

    // Search product
    homePage.searchProduct("laptop");
    test.pass("Product searched");

    // Open product
    resultsPage.clickFirstProduct();
    WindowUtils.switchToNewWindow(driver);
    test.pass("Product page opened");

    // Add to cart
    Assert.assertTrue(productPage.isAddToCartVisible(), "Add to Cart not visible");
    productPage.clickAddToCart();
    test.pass("Product added to cart");

    // Go to cart
    productPage.goToCart();
    test.pass("Navigated to cart");

    // Cart validations
    Assert.assertTrue(cartPage.isCartTitleVisible(),"Cart title not visible");

    Assert.assertTrue(cartPage.isCheckoutButtonVisible(),"Checkout button not visible");

 //............Screenshot.............//
    
    String path = Screenshots.takeScreenshot(driver, "RegressionTest_Success");
    test.addScreenCaptureFromPath(path);
    test.pass("Regression flow verified successfully");
}

}

