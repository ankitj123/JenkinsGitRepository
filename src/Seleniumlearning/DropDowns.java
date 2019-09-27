package Seleniumlearning;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@class='create-new-account f15 alignC bold']/a[1]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[1]"));
		
		List<WebElement> option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		
		String element;
		for (int i=0;i<option.size();i++)
		{
			element=option.get(i).getAttribute("value");
			if (element.equals("22")){
				option.get(i).click();
				
			}
		}
		
	WebElement dropdown1 = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[2]"));
		List<WebElement> option1 = dropdown1.findElements(By.tagName("option"));
		System.out.println(option1.size());
		
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[2]")));
		select1.selectByValue("02");
		
		
		
		
   WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[3]"));
		
		List<WebElement> option2 = dropdown2.findElements(By.tagName("option"));
		System.out.println(option2.size());
		
		String element2;
		for (int k=0;k<option2.size();k++)
		{
			element2=option2.get(k).getAttribute("value");
			if (element2.equals("2017")){
				option2.get(k).click();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

	private static Object selectByVisibleText(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}