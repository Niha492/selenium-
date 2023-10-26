package test;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.devtools.v113.storage.model.StorageBucketsDurability;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		al.accept();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		al.dismiss();
		JavascriptExecutor jd=(JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("promtButton")).click();
		al.sendKeys("niharika");
		al.accept();
		}

}
