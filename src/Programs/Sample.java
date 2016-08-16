package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("txtSource")).sendKeys("Banglore");
		driver.findElement(By.id("txtDestination")).sendKeys("Ahmedabad");
		//WebElement listbox=driver.findElement(By.id("txtSource"));
		//Select select=new Select(listbox);
		//select.selectByVisibleText("Banglore");
		driver.findElement(By.id("txtOnwardCalendar")).click();;
		Thread.sleep(3000);
		driver.findElement(By.id("//div[7]/table[1]/tbody/tr[8]/td[4]")).click();
		
		

	}

}
