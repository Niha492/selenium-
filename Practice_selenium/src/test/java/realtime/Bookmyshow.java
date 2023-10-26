package realtime;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.findElement(By.xpath("//span[@class='bwc__sc-1nbn7v6-10 lgYuCR ellipsis']")).click();
		Thread.sleep(2000);
		WebElement selectcity = driver.findElement(By.xpath("//input[@placeholder='Search for your city']"));
		//selectcity.click();
	 selectcity.sendKeys("vinukonda",Keys.ENTER);
	 //Thread.sleep(2000);
	 //driver.findElement(By.xpath("//strong[text()='Vinukonda']")).click();
//		Robot robo = new Robot();
//		driver.findElement(By.xpath("//span[@class='sc-bmzYkS ledqft ellipsis")).click();
//		robo.delay(3000);
//		selectcity.sendKeys("vinukonda");
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='sc-dtInlm bnklgU']")).click();
//		// driver.findElement(By.xpath("//div[text()='Continue with Google']")).click();
//		driver.findElement(By.id("mobileNo")).sendKeys("6300313272");
//		driver.findElement(By.xpath("//button[@class='sc-kWtpeL fMffSV']")).click();
//		driver.findElement(By.xpath("//img[@alt='BRO']")).click();
//		driver.findElement(By.xpath("//div[@class='sc-1vmod7e-2 fgDVzz']")).click();
		

	}

}
