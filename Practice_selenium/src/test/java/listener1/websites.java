package listener1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
// here we use @listener annotation
@Listeners(listener1.invoke.class)
public class websites {
	
	WebDriver driver ;
	
	@Test
	public void amazon() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	}
	@Test
	public void flipkart() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	}
}
