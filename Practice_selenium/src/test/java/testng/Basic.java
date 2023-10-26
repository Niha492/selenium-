package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(testng.Basic.class)
public class Basic {
	WebDriver driver;

//@Test
//public void url() {
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	driver.get("http://e-quarz.com/");
//}
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://e-quarz.com/");
		driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]")).click();
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() throws Throwable {
		// System.out.println("login succesfully");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement sigin = driver.findElement(By.xpath("//div[@class='navbar-tool-icon-box bg-secondary']"));
		act.moveToElement(sigin).build().perform();
		driver.findElement(By.xpath("//i[@class='fa fa-sign-in mr-2']")).click();
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='form-control border __h-40']"));
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

	@Test(priority = 2)
	public void cart() throws Throwable {
//System.out.println("cart succesfully");
		WebElement category = driver.findElement(By.xpath("(//i[@class='czi-arrow-right __inline-15'])[20]"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(category).build().perform();
		WebElement dropdown = driver.findElement(By.xpath("(//i[@class='czi-arrow-right __inline-15'])[21]"));
		act.moveToElement(dropdown).build().perform();
		String kitchenlist = (String) driver.findElement(By.xpath("(//ul[@class='dropdown-menu __r-100'])[17]"))
				.getText();
		System.out.println(kitchenlist);
		driver.findElement(By.xpath("//a[text()='Water Bottles']")).click();
		driver.findElement(By.xpath(
				"//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64942a950a520.png']"))
				.click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

	}

	@Test(priority = 3)
	public void payment() throws Throwable {
		// System.out.println("payment succesfully");
		driver.findElement(By.xpath("//small[text()='My cart']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-forward px-1']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.id("same_as_shipping_address")).click();
		driver.findElement(By.xpath("//span[text()='Proceed payment']")).click();
	}
}
