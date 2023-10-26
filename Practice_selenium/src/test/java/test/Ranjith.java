package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ranjith {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://cosmocode.io/automation-practice-webtable/");
			driver.manage().window().maximize();
			
			int rowsCount = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
			System.out.println(rowsCount);
		
			int columnsCount = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
			System.out.println(columnsCount);
			
			for(int i=2;i<=rowsCount;i++) {
				System.out.print(i+":");
			
			for(int j=2;j<=columnsCount;j++) {
				
				
	        String  value = driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();

			System.out.println(value);
				
			}
			}
		}
}
				


