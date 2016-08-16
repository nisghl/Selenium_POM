package Programs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTab {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("http://toolsqa.com/selenium-webdriver/choosing-effective-xpath/");
		driver.findElement(By.xpath(".//*[@id='post-1807']/div[1]/div[2]/div/div/span")).sendKeys(Keys.CONTROL+"A");
		driver.findElement(By.xpath(".//*[@id='post-1807']/div[1]/div[2]/div/div/span")).sendKeys(Keys.CONTROL+"C");
		System.out.println("Copy Done");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"1");
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys(Keys.CONTROL+"v");
		
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		Thread.sleep(2000);
		driver.close();
		
	}

}
