package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.abhibus.com/");		
        driver.findElement(By.id("source")).sendKeys("Vijayawada");
        Thread.sleep(3000);
        driver.findElement(By.id("ui-id-3")).click();
        //driver.findElement(By.xpath("//li[text()='Vijayawada']")).click();
        driver.findElement(By.id("destination")).sendKeys("Hyderabad");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
        driver.findElement(By.id("datepicker1")).click();
        List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='7']"));
        for(WebElement dat:date)
        {
        	//System.out.println(dat.getText());
        	if(dat.getText().equals("6"))
        	{
        		dat.click();
        		break;
        	}
        }
        driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='Bustypes2']")).click();
	driver.findElement(By.xpath("//*[@id='Bustypes4']")).click();
	
	
	}
}
