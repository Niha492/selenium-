package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("niharika");
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfugyKsB9bOEN4KkbIrPqNB8id4f1aStHnTXGA_WGiNTbQJ3A/viewform");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign in to Google']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("sannidhibabaniharika92.marolix@gmail.com");
//		//span[text()='Next']
//		//driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
