package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		driver.manage().window().maximize();
		//JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeScript("window.scrollTo(0,document.body.scrollHeight");
		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
         
	}

}
