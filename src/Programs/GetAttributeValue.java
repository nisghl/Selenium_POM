package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeValue {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println("v");
		driver.findElement(By.name("pwd")).sendKeys("v");
		
	}

}
