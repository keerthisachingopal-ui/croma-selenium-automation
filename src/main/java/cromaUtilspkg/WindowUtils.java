package cromaUtilspkg;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtils 
{
public static void switchToNewWindow(WebDriver driver)
{
String parentWindow = driver.getWindowHandle();
Set<String> allWindows = driver.getWindowHandles();

for (String window : allWindows) 
{
    if (!window.equals(parentWindow))
    {
        driver.switchTo().window(window);
        break;
    }
}
}

}
