package cromaTestspkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;
import cromaUtilspkg.WindowUtils;

public class SearchResultsPageTest extends BaseTest

{
@Test//(dependsOnMethods = "testpkg.HomePageTest.HomePage")
public void searchResultandProduct()
{
	   test = extent.createTest("Verify Search Results and Product");
	   
	   homePage.searchProduct("laptop");
	   test.pass("search for laptop");
	   Assert.assertTrue(resultsPage.isFirstProductVisible(),"Search Results not loaded properly");
	   test.pass("Search Results Loaded");
	   resultsPage.clickFirstProduct();
	   test.pass("Clicked first product");
	   
	   
	   WindowUtils.switchToNewWindow(driver);
	   
//................Screenshot............//
	   
	    String path = Screenshots.takeScreenshot(driver, "SearchResultPageTest_Success");
	    test.addScreenCaptureFromPath(path);
        test.pass("Switched to product window");
}
}
