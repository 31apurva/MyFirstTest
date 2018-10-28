package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pgm3_priority 
{
	static WebDriver d=new FirefoxDriver();;
	@Test(priority=1)
	public void open_URL() throws InterruptedException
	{
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
	}
	@Test(priority=2)
	public void before_test() throws InterruptedException
	{
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void login() throws InterruptedException 
	{
		d.findElement(By.xpath(".//*[@id='email']")).sendKeys("apurva.kulkarni1989@gmail.com");
		d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("shreegajanan");
		d.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=4)
	public void logout() throws InterruptedException
	{
		d.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		d.findElement(By.xpath(".//*[@id='js_dj']/div/div/ul/li[12]/a/span/span")).click();
		Thread.sleep(1000);
	}
	@Test(priority=5)
	public void after_test() throws InterruptedException
	{
		d.close();
		Thread.sleep(1000);
	}
}
