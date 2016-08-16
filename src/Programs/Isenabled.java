package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isenabled {

	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement button=driver.findElement(By.name("pwd"));
		if(button.isEnabled())
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}

	}

}
