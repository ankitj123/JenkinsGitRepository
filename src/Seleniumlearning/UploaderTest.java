package Seleniumlearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploaderTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http://gofile.io/?t=uploadFiles");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='btnChooseFiles']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\ankit\\Desktop\\AutoITScript.exe");

	}

}
