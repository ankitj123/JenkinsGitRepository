package Seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='ui_column is-4-mobile brand-quick-links-QuickLinkTileItem__quickLinkTileItem--zKAkR is-2-tablet brand-quick-links-commonStyles__order-flights--3Ww9c']/div[1]/a[@class='brand-quick-links-QuickLinkTileItem__link--1k5lE']/span[@class='ui_icon flights brand-quick-links-QuickLinkTileItem__icon--2iguo']")).click();
        driver.findElement(By.xpath("//div[@class='unified-picker citrus departure']/span[@class='ui_icon calendar pickerType']")).click();
        
        String date = "5-Sept 2019";
        String splitter[] = date.split("-");
        String month_year = splitter[1];
        String day = splitter[0];
        
        System.out.println(month_year);
        System.out.println(day);
        driver.findElement(By.xpath("//div[@class='rsdc-body']/div[3]/span[@class='rsdc-month']/span[@class='rsdc-cell rsdc-day rsdc-today']")).click();
        driver.findElement(By.xpath("//div[@class='rsdc-body']/div[3]/span[2]/span[5]")).click();
        
        
        
        
	}

}
