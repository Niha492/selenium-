package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	public static void main(String[] args) throws Throwable {
		
//		//System.setProperty("webdriver.gecko.driver","C:\\Users\\sree\\Desktop\\geckodriver-v0.33.0-win32\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://itera-qa.azurewebsites.net/home/automation");
//		JavascriptExecutor jd=(JavascriptExecutor)driver;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		//driver.findElement(By.xpath("//img[@id='close_button_svg'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("satish");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
