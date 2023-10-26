package Screenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class screen1 implements ITestListener {

    private WebDriver driver;

    public void onTestFailure(ITestResult result) {
        // Get the WebDriver instance from the TestNG test context
        driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
        if (driver != null) {
            captureScreenshot(result.getName());
        }
    }

    private void captureScreenshot(String testName) {
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(".//src/capture.png");
            Files.copy(screenshotFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            Reporter.log("Screenshot saved: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


