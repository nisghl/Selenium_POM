package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyPaste {

	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		
			

	}

}
