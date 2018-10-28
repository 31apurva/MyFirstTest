package testng_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class parameter_pgm 
{
	WebDriver d = new FirefoxDriver();
	@BeforeTest
	public void beforeclass()
	{
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
	}
  @Parameters({"UN","PWD"})
  @Test(priority=1)
  public void login(String UN, String PWD) 
  {
	  d.findElement(By.xpath(".//*[@id='email']")).sendKeys(UN);
	  d.findElement(By.xpath(".//*[@id='pass']")).sendKeys(PWD);
	  d.findElement(By.xpath(".//*[@id='u_0_8']")).click();
  }
}
