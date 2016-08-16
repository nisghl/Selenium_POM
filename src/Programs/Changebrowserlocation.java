package Programs;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Changebrowserlocation {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		driver.close();

	}

}
