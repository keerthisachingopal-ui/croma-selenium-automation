package cromaTestspkg;

import org.testng.annotations.Test;

import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;

public class ProductPageTest extends BaseTest
{
@Test
public void producttoCart()
{
	 test = extent.createTest("Verify Product Added to Cart");
	 
productPage.clickAddToCart();
test.pass("Product addedd to cart");
productPage.goToCart();

//...........Screenshot..........//

String path = Screenshots.takeScreenshot(driver, "ProductPageTest_Success");
test.addScreenCaptureFromPath(path);
test.pass("navigated to cart");

}
}
