package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.MessageSizeEstimator.Handle;

public class Windowhandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		driver.findElement(By.id("newWindowBtn")).click();
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
