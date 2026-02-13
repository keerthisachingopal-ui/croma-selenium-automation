package cromaTestspkg;




import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.Test;

import cromaBasepkg.BaseTest;
import cromaUtilspkg.Screenshots;

public class LoginTest extends BaseTest

{
@Test
public void verifyLogin() 
{
	test = extent.createTest("Verify Login via My Profile");

    homePage.mousehoverOnAccountIcon();
    test.pass("Mousehover on Account Icon");
    
    homePage.clickMyProfile();
    test.pass("Clicked My profile");
    
    Assert.assertTrue(homePage.isLoginPopupVisible(),"Login POPUP not visible");
    try {
    homePage.enterPhonenumber("11111111");
    homePage.clickContinueBtn();
    test.pass("Clicked continue Button");
    }catch(TimeoutException e)
    {
    	System.out.println("Login popup delayed");
    	homePage.enterPhonenumber("11111111");
    	homePage.clickContinueBtn();
    }
    homePage.closeLoginPopup();
    test.pass("Close Login & Back to homepage");
   
          //............Screenshot............//
    
String path = Screenshots.takeScreenshot(driver, "LoginTest_Success");
test.addScreenCaptureFromPath(path);

test.pass("Login UI displayed successfully via My Profile");

}
}

