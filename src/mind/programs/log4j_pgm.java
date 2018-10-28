package mind.programs;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

public class log4j_pgm {

	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger(log4j_pgm.class.getClass());
		PropertyConfigurator.configure("E://Apurva_Selenium//Selenium//Programs//Mind_Selenium//Data_Repository//log4j.properties");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
		log.info("Browser Open");
		d.findElement(By.xpath(".//*[@id='email']")).sendKeys("apurva.kulkarni1989@gmail.com");
		log.info("Username entered");
		d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("apurva123");
		log.info("Password entered");
		d.findElement(By.xpath(".//*[@id='u_0_3']")).click();
		log.info("Login Failed");
	
	}

		
	
}
