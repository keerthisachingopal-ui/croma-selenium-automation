package cromaUtilspkg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager 
{
	private static ExtentReports extent;
    private static ExtentSparkReporter reporter;

    // Create and return ExtentReports object
    public static ExtentReports setupReport() {

        if (extent == null) {

            reporter = new ExtentSparkReporter(
                    System.getProperty("user.dir")
                            + "/reports/CROMA_Report.html");

            reporter.config().setDocumentTitle("CROMA Automation Report");
            reporter.config().setReportName("Complete Test Suite");
            reporter.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(reporter);

            extent.setSystemInfo("Host Name", "localhost");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Tester", "Keerthi");
            extent.setSystemInfo("Browser", "Chrome");
        }

        return extent;
    }

    // Flush report
    public static void tearDownReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}