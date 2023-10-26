package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scshot {
	WebDriver driver;
@BeforeTest
public void open()
{
driver=new ChromeDriver();
driver.manage().window().maximize();
}
@AfterTest
public void shutdown()
{
driver.close();	
}
@Test
public void screenshot(String filename) throws IOException 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./Screenshots/"+filename);
	FileUtils.copyFile(source, target);
	//	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
//File sourcefile	=takescreenshot.getScreenshotAs(OutputType.FILE);
//File destinationfile= new File("./Screenshots/"+filename);
//try {
//	FileUtils.copyFile(sourcefile, destinationfile);
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//	System.out.println("screenshot done");
}
}

