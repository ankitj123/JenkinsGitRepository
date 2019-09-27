package Seleniumlearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@class='create-new-account f15 alignC bold']/a[1]")).click();
		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td/input[@class='nomargin']"));
		System.out.println(checkbox.size());
		
		driver.findElement(By.className("nomargin")).click();
		
        for(WebElement e : checkbox){
			
			System.out.println(e.isSelected());
			System.out.println(e.getAttribute("type"));
			
			if(e.getAttribute("type").equals("checkbox")){
				e.click();
				Thread.sleep(1000000);
				Select select = new Select(driver.findElement(By.name("chk_altemaile22aad5b")));
				select.deselectAll();
			}
			
		}
        
      
		}
		
		

	}


