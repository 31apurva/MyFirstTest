package mind.programs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopUpHandling 
{
	static WebDriver d;
	
	public static void main(String[] args) throws InterruptedException 
	{
		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		d.get("https://www.naukri.com/");
		
		String handle = d.getWindowHandle();
		System.out.println(handle);
		
		Set<String> handles = d.getWindowHandles();
		
		for(String hnd:handles)
		{
			if(!hnd.equals(handle))
			{
				d.switchTo().window(hnd);
				System.out.println(d.getTitle());
				d.close();
				Thread.sleep(1000);
			}
			
		}
		
		d.switchTo().window(handle);
		System.out.println(d.getTitle());
		d.close();
	}
}