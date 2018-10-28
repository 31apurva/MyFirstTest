package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pgm2 
{	
	static WebDriver d=new FirefoxDriver();
	@Test
	public void t1() throws InterruptedException //open_URL
	{
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
	}
	@Test
	public void t2() throws InterruptedException //before_test
	{
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test
	public void t3() throws InterruptedException //login 
	{
		d.findElement(By.xpath(".//*[@id='email']")).sendKeys("apurva.kulkarni1989@gmail.com");
		d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("shreegajanan");
		Thread.sleep(3000);
		d.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		Thread.sleep(1000);
	}
	@Test
	public void t4() throws InterruptedException //logout
	{
		d.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("_54nc")).click();
		Thread.sleep(2000);
	}
	@Test
	public void t5() throws InterruptedException //after_test
	{
		d.close();
		Thread.sleep(1000);
	}
}
