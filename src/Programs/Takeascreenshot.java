package Programs;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Takeascreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://premium.linkedin.com/jobsearch/onboarding?trk=premium_new_onboarding");
		EventFiringWebDriver e= new EventFiringWebDriver(driver);
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("d:/nisnt.png");
		FileUtils.copyFile(srcfile, destfile);
		driver.close();

	}

}
