package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		String day = "15";

		String month = "August";

		String year = "2024";

		driver.findElement(By.id("first_date_picker")).click();

		while (true) {

			String monyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] mon_year = monyear.split(" ");

			String months = mon_year[0];

			String years = mon_year[1];

			if (months.equalsIgnoreCase(month) && years.equalsIgnoreCase(year))

				break;

			else {

				driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}

		List<WebElement> dates = driver.findElements(By.cssSelector("[data-handler='selectDay']"));

		for (WebElement date : dates) {

			if (date.getText().equals(day)) {

				date.click();
				break;
			}

		}

		Thread.sleep(4000);
		driver.close();

	}

}




