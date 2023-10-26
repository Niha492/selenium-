package Screenshot;
	import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	// here we use @listener annotation
	//@Listeners(listener1.invoke.class)
	public class website extends scshot{
		
		WebDriver driver ;
		
		@Test(testName="Testamazon")
		public void amazon() throws Throwable {
			System.out.println("amazon");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(1000);
			assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
		}
		@Test(testName="Testflipkart")
		public void flipkart() throws Throwable {
			System.out.println("flipkart");
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			assertEquals(driver.getTitle(), "flipkart");
		}
	}


