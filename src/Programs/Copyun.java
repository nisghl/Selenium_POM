package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copyun {

	public static void main(String[] args)
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("nishant");
	}

}
