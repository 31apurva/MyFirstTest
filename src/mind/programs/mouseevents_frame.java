package mind.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents_frame 
{
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		
			d = new FirefoxDriver();
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			
			d.get("https://jqueryui.com/draggable/");
			
			List<WebElement> totalframe = d.findElements(By.tagName("iframe"));
			System.out.println(totalframe.size());
			d.switchTo().frame(0);
			
			WebElement Drag = d.findElement(By.xpath(".//*[@id='draggable']"));
			//System.out.println(Drag);
			Thread.sleep(1000);
			
			Actions act = new Actions(d);
			act.moveToElement(Drag).dragAndDropBy(Drag, 50, 100).build().perform();
			
		}
		// TODO Auto-generated method stub

	}