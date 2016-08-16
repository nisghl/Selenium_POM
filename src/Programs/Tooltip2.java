package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip2 {

	public static void main(String[] args)
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement chkbox =driver.findElement(By.name("remember"));
		chkbox.click();
		if(chkbox.isSelected())
		{
			System.out.println("chkbox is selected");
		}
		else
		{
			System.out.println("chkbox is not selected");
		}

	}

}
