package cromaTestspkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;



public class HomePageTest extends BaseTest
{

@Test
public void verifyHomepageloads() 
{
	 test = extent.createTest("Verify Home Page Loads");
	 
	 Assert.assertTrue(homePage.issearchboxVisibe(),"Search Box is not  Visible");
	 
       String title = homePage.getHomePageTitle();
       System.out.println("Actual title: " + title);

     
       Assert.assertTrue(title.toLowerCase().contains("croma") || title.toLowerCase().contains("electronics"), "Unexpected Home Page Title");

       test.pass("Home page loaded successfully");
       
   }
@Test
public void verifyLogoNavigatesToHome() {

    test = extent.createTest("Verify Logo Navigation to Home Page");

    // Assume user navigates somewhere (optional later)
    homePage.clickLogo();

    Assert.assertTrue(
        homePage.issearchboxVisibe(),
        "Home page not displayed after clicking logo"
    );

    test.pass("Logo successfully navigated to Home Page");
}
@Test
public void verifyHamburgerMenuVisible() {

    test = extent.createTest("Verify Hamburger Menu on Home Page");

    Assert.assertTrue(
        homePage.isHamburgerMenuVisible(),
        "Hamburger menu is not visible on Home page"
    );

    
 //............Screenshot.............//
    
    String path = Screenshots.takeScreenshot(driver, "HomePageTest_Success");
    test.addScreenCaptureFromPath(path);
    test.pass("Hamburger menu is visible on Home page");
}
}

  

   
       
     
     
