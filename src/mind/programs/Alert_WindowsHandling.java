package mind.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_WindowsHandling 
{
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		d = new FirefoxDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.name("proceed")).click();
		Alert al = d.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(1000);
		d.close();
		
}
}