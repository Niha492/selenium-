package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//@Listeners(Listenerinvoke.logininofpost.class)
public class loginofpost {
	WebDriver driver;
	@Test(dataProvider = "loginData")
	public void login(String EmailAddress,String Password)throws Throwable 
	{
	//	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://poojastore.marolix.com/#");
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys(EmailAddress);
		driver.findElement(By.name("pword")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark btn-md w-100']")).click();	
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/", url);
		Thread.sleep(2000);
		driver.close();
	}
	@DataProvider(name="loginData")
	public Object[][] testdata() throws Throwable
	{
 Object[][] f=new Object[2][2];
	f[0][0]="pooja132@gmail.com";
	f[0][1]="1234";
	Thread.sleep(2000);
	f[1][0]="pooja132@gmail.com";
	f[1][1]="12345";
	return f;		
	}
	}
	
