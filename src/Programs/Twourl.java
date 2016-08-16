package Programs;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twourl {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//release opposite order
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	      driver.navigate().to("http://www.facebook.com");
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	      Robot robot1=new Robot();
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_T);
			//release opposite order
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyRelease(KeyEvent.VK_T);
			driver.get("https://www.google.co.in");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Robot robot2=new Robot();
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_TAB);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			robot2.keyRelease(KeyEvent.VK_TAB);
			driver.close();	
	}

}
