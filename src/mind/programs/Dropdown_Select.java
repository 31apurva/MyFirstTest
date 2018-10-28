package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select 
{
	static WebDriver d;
	static Select s;
	public static void main(String[] args) 
	{
		d = new FirefoxDriver();
		d.navigate().to("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		d.findElement(By.name("firstname")).sendKeys("apurva");
		d.findElement(By.name("firstname")).clear();
		d.findElement(By.name("firstname")).sendKeys("Apurva");
		
		
		d.findElement(By.name("lastname")).sendKeys("pandit");
		
		
		d.findElement(By.id("u_0_o")).sendKeys("9987876567");
		d.findElement(By.name("reg_passwd__")).sendKeys("apurva123");
		
		WebElement birthday = d.findElement(By.name("birthday_day"));
	
		s.selectByIndex(7);
		
		WebElement birthmonth = d.findElement(By.id("month"));
		s.selectByValue("Jan");
		
		WebElement birthyear = d.findElement(By.name("birthday_year"));
		s.selectByVisibleText("1989");
		
		d.findElement(By.name("sex")).click();
		d.findElement(By.linkText("Sign Up")).click();
		d.close();
	}

}
