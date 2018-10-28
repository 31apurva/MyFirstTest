package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementUsingWebElement 
{

	public static void main(String[] args) 
	{
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		WebElement firstname = d.findElement(By.name("firstname"));
		firstname.sendKeys("Apurva");
		
		WebElement lastname = d.findElement(By.name("lastname"));
		lastname.sendKeys("pandit");
		lastname.clear();
		lastname.sendKeys("Pandit");
		
		WebElement mobilenumber = d.findElement(By.id("u_0_o"));
		mobilenumber.sendKeys("67898546");
		
		WebElement password = d.findElement(By.name("reg_passwd__"));
		password.sendKeys("apurva123");
		
		WebElement birthday = d.findElement(By.name("birthday_day"));
		birthday.sendKeys("31");
		
		WebElement birthmonth = d.findElement(By.id("month"));
		birthmonth.sendKeys("Oct");
		
		WebElement birthyear = d.findElement(By.name("birthday_year"));
		birthyear.sendKeys("1989");
		
		WebElement sex = d.findElement(By.name("sex"));
		sex.click();
		
		WebElement button = d.findElement(By.linkText("Sign Up"));
		button.click();
		
		d.close();
	}

}
