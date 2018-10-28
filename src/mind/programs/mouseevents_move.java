package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents_move 
{
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		d = new FirefoxDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		
		d.get("https://www.naukri.com/hr-recruiters-consultants");
		
		WebElement LinkTobeClicked = d.findElement(By.xpath("html/body/div[1]/div/ul/li[1]/a/div"));
		
		Actions act = new Actions(d);
		act.moveToElement(LinkTobeClicked).build().perform();
		
		Thread.sleep(1000);
		
		//d.findElement(By.linkText("Register Now")).click();
		
	}

}
