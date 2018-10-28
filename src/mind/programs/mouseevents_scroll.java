package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents_scroll 
{

	
		static WebDriver d;
		public static void main(String[] args) throws InterruptedException 
		{
			d = new FirefoxDriver();
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			
			d.get("https://www.naukri.com/hr-recruiters-consultants");
			
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor)d;
			js.executeScript("scroll(0,789)");
			Thread.sleep(1000);
			js.executeScript("scroll(660,0)");
		}
		// TODO Auto-generated method stub

	}


