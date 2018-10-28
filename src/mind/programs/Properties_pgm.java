package mind.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties_pgm
{
	static WebDriver d;
	public static void main(String[] args) throws IOException 
	{
		d = new FirefoxDriver();
		
		File f = new File("E:\\Apurva_Selenium\\Selenium\\Programs\\Mind_Selenium\\Data_Repository\\URL.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		d.get(p.getProperty("URL"));
		p.load(fis);
		System.out.println(p.getProperty("URL"));
		d.findElement(By.xpath(p.getProperty("XPATH_UNAME"))).sendKeys(p.getProperty("UNAME"));
		Boolean fname = d.findElement(By.xpath(p.getProperty("XPATH_UNAME"))).isSelected();
		System.out.println(fname);
		d.findElement(By.xpath(p.getProperty("XPATH_PWD"))).sendKeys(p.getProperty("PWD"));
	}
}
