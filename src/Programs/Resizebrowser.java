package Programs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resizebrowser {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Dimension d=new Dimension(100,100);
		driver.manage().window().setSize(d);

	}

}
