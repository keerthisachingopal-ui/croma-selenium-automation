package cromaBasepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import cromaPagespkg.CartPage;
import cromaPagespkg.HomePage;
import cromaPagespkg.ProductPage;
import cromaPagespkg.SearchResultsPage;
import cromaUtilspkg.ConfigReader;
import cromaUtilspkg.ExtentReportManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	    protected static WebDriver driver;
	    protected static ExtentReports extent;
	    protected ExtentTest test;

	    protected HomePage homePage;
	    protected SearchResultsPage resultsPage;
	    protected ProductPage productPage;
	    protected CartPage cartPage;
	    
	    
	    @BeforeTest
	    public void setUp() 
	    {

	       
	        extent = ExtentReportManager.setupReport();

	        
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( Integer.parseInt(ConfigReader.getProperty("implicitWait"))));
            driver.get(ConfigReader.getProperty("baseUrl"));
	        
	    }
	    @BeforeMethod
	    public void bfrmthd() 
	    {
	    	
	    	homePage = new HomePage(driver);
	    	resultsPage = new SearchResultsPage(driver);
	    	productPage = new ProductPage(driver);
	    	cartPage = new CartPage(driver);
	    }


	    @AfterMethod
	    public void logResult(ITestResult result) 
	    {

	        if (test != null) {
	            switch (result.getStatus()) {
	                case ITestResult.SUCCESS:
	                    test.pass("Test passed");
	                    break;
	                case ITestResult.FAILURE:
	                    test.fail(result.getThrowable());
	                    break;
	                case ITestResult.SKIP:
	                    test.skip("Test skipped");
	                    break;
	            }
	        }
	    }

	    @AfterTest
	    public void tearDown()
	    {

	        if (driver != null) {
	            driver.quit();
	        }

	        ExtentReportManager.tearDownReport();
	    }
	}