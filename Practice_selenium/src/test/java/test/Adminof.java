package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminof {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://e-quarz.com/admin");
		driver.findElement(By.id("signinSrEmail")).sendKeys("arun@marolix.com");
		driver.findElement(By.id("signupSrPassword")).sendKeys("Reset@123");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='default_captcha_value']"));
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String window1=driver.getWindowHandle();
		//System.out.println("window1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='js-hs-unfold-invoker btn btn-icon btn-ghost-secondary rounded-circle'])[1]")).click();
		Set<String> handles=driver.getWindowHandles();
				for(String handle:handles)
				{
					//System.out.println(handle);
					if(!window1.equals(handle)) 
					{
						driver.switchTo().window(handle);
						driver.manage().window().maximize();
					}
				}
	}

}
