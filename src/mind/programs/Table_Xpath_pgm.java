package mind.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Xpath_pgm 
{

	public static void main(String[] args) 
	{
		WebDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/html/html_tables.asp");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		List<WebElement> country = d.findElements(By.xpath(".//*[@id='customers']/tbody/tr[4]/td[3]"));
		System.out.println();
	}

}
