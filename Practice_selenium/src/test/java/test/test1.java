package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
         
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//body[@class='fk-modal-visible']")).click();
		//WebElement element= driver.findElement(By.xpath("//body[@class='fk-modal-visible']"));
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element= driver.findElement(By.xpath("//input[@name='q']"));
		//driver.findElement(By.class("Pke_EE")).sendKeys("flipkart");
		//WebElement element= driver.findElement(By.id("input"));
				//element.click();
	          element.sendKeys("horlicks"); 
	          driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	
}
