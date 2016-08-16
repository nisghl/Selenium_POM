package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fontoptions {

	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("hplogo"));
		System.out.println("font size is "+driver.findElement(By.id("hplogo")).getCssValue("font-size"));
		System.out.println("font colour is "+driver.findElement(By.id("gb_70")).getCssValue("colour"));
		System.out.println("background colour is "+driver.findElement(By.id("hplogo")).getCssValue("font-family"));
		System.out.println("font type is "+driver.findElement(By.id("hplogo")).getCssValue("font-type"));

	}

}
