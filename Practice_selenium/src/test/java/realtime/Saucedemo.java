package realtime;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Saucedemo {

		public static void main(String[] args) throws Throwable {
			
			//WebDriver driver=new ChromeDriver();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		     driver.findElement(By.xpath("//input[@id='login-button']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		     Thread.sleep(2000);
		    // driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
		     driver.findElement(By.xpath("//button[@id='react-burger-cross-btn']")).click();
		     Thread.sleep(2000);
			//driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		     
		     driver.findElement(By.xpath("//option[@value='za']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@id='checkout']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Raja phani bhushan");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Nidimoru");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("516360");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='continue']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@id='finish']")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		     driver.close();

		}

	}


