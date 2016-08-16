package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printurl {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String v=driver.getPageSource();
		System.out.println(v);
		driver.close();
	}

}
