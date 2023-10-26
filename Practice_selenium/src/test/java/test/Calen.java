package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class Calen {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		// driver.findElement(By.xpath("//img[@id='close_button_svg'][1]")).click();
		// first date
		driver.findElement(By.id("first_date_picker")).click();
//			String day="21";
//			String month="january";
//			String year="2024";
		// td[@data-handler='selectDay']
		// td[@data-handler='selectDay']
		while (true) {
			String calender = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] cal = calender.split(" ");
			String months = cal[0];
			String years = cal[1];
			if (months.equalsIgnoreCase("january") && years.equalsIgnoreCase("2024")) {
				break;

			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}

		List<WebElement> day = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (WebElement days : day) {
			System.out.println(days.getText());
			if (days.getText().equalsIgnoreCase("25")) {
				days.click();
				break;
			}
		}

		driver.findElement(By.id("third_date_picker")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(2);
		WebElement dropdownyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select dropyear = new Select(dropdownyear);
		dropyear.selectByVisibleText("2030");
		List<WebElement> date = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (WebElement dat : date) {
			if (dat.getText().equals("25")) {
				dat.click();
				break;
			}
		}
		driver.findElement(By.id("sixth_date_picker")).click();
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		
		while (true) {
			String calendr = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String clen[] = calendr.split(" ");
			
			String mon = clen[0];
			String year = clen[1];
			if (mon.equalsIgnoreCase("March") && year.equalsIgnoreCase("2024")) {
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		List<WebElement> da = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (WebElement daaa : da) {
			if (daaa.getText().equals("20")) {
				daaa.click();
				break;
			}
		}
	}

}
