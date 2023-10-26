package test;

import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Itera {

		public static void main(String[] args) throws Throwable{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.id("name")).sendKeys("Niharika");
			driver.findElement(By.id("phone")).sendKeys("6300313272");
			driver.findElement(By.id("email")).sendKeys("sannidhibabaniharika92.marolix@gmail.com");
			driver.findElement(By.id("password")).sendKeys("niharika");
			driver.findElement(By.id("address")).sendKeys("houseno:26-34, main bazar, vinukonda");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.findElement(By.id("female")).click();
			driver.findElement(By.id("monday")).click();
			driver.findElement(By.id("thursday")).click();
			WebElement dropdown= driver.findElement(By.xpath("//select[@class='custom-select']"));
			Select sel=new Select(dropdown);
			sel.selectByIndex(2);
			driver.findElement(By.xpath("//label[@for='1year']")).click();
			driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
			driver.findElement(By.xpath("//label[text()='TestNG']")).click();
			Robot robo=new Robot();
			driver.findElement(By.id("inputGroupFile02")).click();
			robo.delay(3000);
		
			StringSelection upload=new StringSelection("C:\\Users\\sree\\Desktop\\Testing\\in product");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
		}

	}


