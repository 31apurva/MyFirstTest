package mind.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization 
{

	public static void main(String[] args) 
	{
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.facebook.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.name("firstname")).sendKeys("apurva");
		d.findElement(By.name("firstname")).clear();
		WebDriverWait wait = new WebDriverWait(d,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname"))).sendKeys("apurva");
		//d.findElement(By.name("firstname")).sendKeys("Apurva");
		/*try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		d.findElement(By.name("lastname")).sendKeys("pandit");
		d.findElement(By.id("u_0_o")).sendKeys("9987876567");
		d.findElement(By.name("reg_passwd__")).sendKeys("apurva123");
		d.findElement(By.name("birthday_day")).sendKeys("31");
		d.findElement(By.id("month")).sendKeys("Oct");
		d.findElement(By.name("birthday_year")).sendKeys("1989");
		d.findElement(By.name("sex")).click();
		//d.findElement(By.linkText("Sign Up")).click();
		wait.until(ExpectedConditions.elementToBeSelected(By.linkText("Sign Up")));		
		d.close();
	}

}
