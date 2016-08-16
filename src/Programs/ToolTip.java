package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTip {

	public static void main(String[] args)
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement chkbox =driver.findElement(By.name("remember"));
		String ttText =chkbox.getAttribute("title");
		System.out.println(ttText);
		chkbox.click();
		boolean v1 =chkbox.isSelected();
		System.out.println(v1);
	}

}
