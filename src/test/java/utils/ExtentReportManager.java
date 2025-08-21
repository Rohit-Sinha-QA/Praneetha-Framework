package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/src/test/java/reports/extent-report.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setReportName("Praneetha Automation Test Report");
            spark.config().setDocumentTitle("Praneetha Test Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Company", "TCS");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Tester", "Praneetha");
        }
        return extent;
    }

}
