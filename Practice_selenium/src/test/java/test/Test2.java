package test;

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import javax.swing.text.Element;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import dev.failsafe.Timeout;
	import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;
	import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Test2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.id("display-other-button")).click();
			WebElement element=driver.findElement(By.id("hidden"));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println(element.isDisplayed());
		}
	}

