package testng_pkg;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class naukri 
{
	public static WebDriver d = new FirefoxDriver();
	public String URL = "https://www.naukri.com";
	@Test(priority=0)
	public void maximize() 
	{
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	}
	@Test(priority=1)
	public void details() throws InterruptedException
	{	
	  d.get(URL);
	  d.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
	  Thread.sleep(3000);
	  d.findElement(By.xpath(".//*[@id='eLoginNew']")).sendKeys("apurvaabbbcccdddeeefffggghhhiiijjjk@yahoo.com");
	  Thread.sleep(2000);
	  d.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("aaa345");
	  Thread.sleep(2000);
	  d.findElement(By.xpath(".//*[@id='lgnFrmNew']/div[9]/button")).click();
	  //d.findElement(By.xpath("//button[@value='Login']")).click();
	  Thread.sleep(2000);
	}
	@Test(priority=2)
	public void upload() throws InterruptedException, AWTException
	{
		
	  d.findElement(By.linkText("Attached Resume")).click();
	  Thread.sleep(5000);
	  d.findElement(By.linkText("Delete")).click();
	}

}
