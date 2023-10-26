package test;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Equarz {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://e-quarz.com/");
		driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// div[@class='navbar-tool-icon-box bg-secondary'])[2]
		// *[@data-toggle='dropdown'][@class='navbar-tool ml-md-3']
		WebElement sigin = driver.findElement(By.xpath("(//div[@class='navbar-tool-icon-box bg-secondary'])[2]"));
		act.moveToElement(sigin).build().perform();
		driver.findElement(By.xpath("//i[@class='fa fa-sign-in mr-2']")).click();
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@class='form-control border __h-40']"));
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		WebElement category = driver.findElement(By.xpath("(//i[@class='czi-arrow-right __inline-15'])[20]"));
//		act.moveToElement(category).build().perform();
//		WebElement dropdown=driver.findElement(By.xpath("(//i[@class='czi-arrow-right __inline-15'])[21]"));
//		//Select sel=new Select(dropdown);
//	act.moveToElement(dropdown).build().perform();
//	//String kitchenlist = (String) driver.findElement(By.xpath("(//ul[@class='dropdown-menu __r-100'])[17]")).getText();
//	//System.out.println(kitchenlist);
//	 driver.findElement(By.xpath("//a[text()='Water Bottles']")).click();
//	 driver.findElement(By.xpath("//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64942a950a520.png']")).click();
//	 driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
//	 
//	 driver.findElement(By.xpath("//i[@class='navbar-tool-iconczi-cart']")).click();

	}
}
