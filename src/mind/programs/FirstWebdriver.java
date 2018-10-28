package mind.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstWebdriver {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.findElement(By.name("firstname")).sendKeys("apurva");
		d.findElement(By.name("firstname")).clear();
		d.findElement(By.name("firstname")).sendKeys("Apurva");
		d.findElement(By.name("lastname")).sendKeys("pandit");
		d.findElement(By.id("u_0_o")).sendKeys("9987876567");
		d.findElement(By.name("reg_passwd__")).sendKeys("apurva123");
		d.findElement(By.name("birthday_day")).sendKeys("31");
		d.findElement(By.id("month")).sendKeys("Oct");
		d.findElement(By.name("birthday_year")).sendKeys("1989");
		d.findElement(By.name("sex")).click();
		d.findElement(By.linkText("Sign Up")).click();
		d.close();
		
	}

}
