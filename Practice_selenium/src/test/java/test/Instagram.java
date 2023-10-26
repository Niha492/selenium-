package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saikrish_21");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("6300313272");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sai@icicibank.com");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		driver.findElement(By.id("recaptcha-anchor-label")).click();
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"))

	}

}
