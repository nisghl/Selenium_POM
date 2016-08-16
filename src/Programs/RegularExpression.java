package Programs;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RegularExpression {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/choosing-effective-xpath/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String text= driver.findElement(By.xpath(".//*[@id='post-1807']/div[1]/div[2]/div/div/p[9]/span[1]")).getText();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("https://www.google.co.in/");
		System.out.println(text);
		String line = text;
		String pattern = "(.Firebug)(.*too)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		 if (m.find( )) {
	    	  System.out.println("Found value: " + m.group(1)+ m.group(2) );
	    	  driver.findElement(By.id("lst-ib")).sendKeys(m.group(1)+ m.group(2));
	    	  
	      } else {
	         System.out.println("NO MATCH");
	      }
		//driver.findElement(By.id("lst-ib")).sendKeys(m.group(1)+ m.group(2));
		System.out.println(m.group(1)+ m.group(2));
		driver.close();  
	}
}

