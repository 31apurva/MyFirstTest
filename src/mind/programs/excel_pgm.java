package mind.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excel_pgm 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("E://Apurva_Selenium//Selenium//Programs//Mind_Selenium//Data_Repository//selenium.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook xssfwrk = new XSSFWorkbook(fis);
		XSSFSheet xssfsht = xssfwrk.getSheetAt(0);
		String record = xssfsht.getRow(0).getCell(0).getStringCellValue();
		System.out.println(record);
		//for(int i=0; i=xssfsht.getLastRowNum();i++)
		//{
		WebDriver d=new FirefoxDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get(xssfsht.getRow(1).getCell(3).getStringCellValue());
		d.findElement(By.xpath(xssfsht.getRow(2).getCell(1).getStringCellValue())).sendKeys(xssfsht.getRow(2).getCell(3).getStringCellValue());
		d.findElement(By.xpath(xssfsht.getRow(3).getCell(1).getStringCellValue())).sendKeys(xssfsht.getRow(3).getCell(3).getStringCellValue());
		d.findElement(By.xpath(xssfsht.getRow(4).getCell(1).getStringCellValue())).click();
		//}
}
}