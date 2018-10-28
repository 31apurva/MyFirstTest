package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintOutputIConsole {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		WebElement firstname = d.findElement(By.name("firstname"));
		firstname.sendKeys("Apurva");
		
		
		//System.out.println(firstname.getAttribute("FirstName"));
		
		String print = firstname.getAttribute("value");
		System.out.println(print);
		
		String expected = "Apurva";
		if(print.equalsIgnoreCase(expected))
		{
			d.findElement(By.name("firstname")).sendKeys("");
		}
		else
		{
			System.out.println("Value did not match");
			Thread.sleep(2000);
			d.close();
		}
	
	}

}
