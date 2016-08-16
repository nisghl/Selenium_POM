package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Minimize {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SPACE);
		//release opposite order
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		

	}

}
