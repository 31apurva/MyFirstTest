package pageobbbjmodel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class paageobjmdl {
	WebDriver dr;
	public paageobjmdl(WebDriver driver){
		this.dr=driver;
	}
	
	
	//fcbookLogo
	By Facebookimg=By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i");
	
	//Login
	By Email=By.xpath(".//*[@id='email']");
	By Phone=By.xpath(".//*[@id='email']");
	By Passwrd=By.xpath(".//*[@id='pass']");
	By Loginbtn=By.xpath(".//*[@id='u_0_3']");
	By Forgtaccnt=By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a");
	
	//Signup
	By FirstName=By.xpath(".//*[@id='u_0_j']");
	By LastName=By.xpath(".//*[@id='u_0_l']");
	By Emailaddresss=By.xpath(".//*[@id='u_0_o']");
	By Mobile=By.xpath(".//*[@id='u_0_o']");
	By ReEnter=By.xpath(".//*[@id='u_0_r']");
	By NewPassword=By.xpath(".//*[@id='u_0_v']");
	By DayDrp=By.xpath(".//*[@id='day']");
	By DateDrp=By.xpath(".//*[@id='month']");
	By YearDrp=By.xpath(".//*[@id='year']");
	By bdayhelp=By.xpath(".//*[@id='birthday-help']");
	By femaleRdBtn=By.xpath(".//*[@id='u_0_9']");
	By maleRdBtn=By.xpath(".//*[@id='u_0_a']");
	By TermsLnk=By.xpath(".//*[@id='terms-link']");
	By DPolicyLnk=By.xpath(".//*[@id='privacy-link']");
	By CookieLnk=By.xpath(".//*[@id='cookie-use-link']");
	By signupbtn=By.xpath(".//*[@id='u_0_11']");
	By createApage=By.xpath(".//*[@id='reg_pages_msg']/a");
	
	public void browserOpen(){
		WebDriver dr=new FirefoxDriver();
	}
	
	
	
	public void URLOpen(){
		dr.get("https://www.facebook.com/");
		
	}
	
	public void maximize(){
	dr.manage().window().maximize();
	}
	
	public void impliwait(){
		dr.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	public void  explicitwaait(){
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void titleverify(){
			String Exp="Facebook";
			String Actual=dr.findElement(Facebookimg).getText();
			System.out.println(Actual);
			if (Exp.equalsIgnoreCase(Actual)){
				System.out.println("Title Maatched");
			}
			else{
				System.out.println("Title did not match");
			}
	}
		
		public void title(){
			String Title=dr.getTitle();
			System.out.println("Titleof the page is" +Title);
		}
		
		public void currentURl(){
	String	CurrentUrl=	dr.getCurrentUrl();
	System.out.println(CurrentUrl);
		}
		
		public void clrcookies(){
			dr.manage().deleteAllCookies();
		}
	public void EmailLogin(){
		dr.findElement(Email).sendKeys("ajmeraayushi09@gmail.com");
	}
	
	public void PasswrdLogin(){
		dr.findElement(Passwrd).sendKeys("fjjghfg");
		
	}
	
	public void LoginBtn(){
		dr.findElement(Loginbtn).click();
	}
	
	public void frgtpwd(){
		dr.findElement(Forgtaccnt).click();
		
	}
	
	public void fiirstname(){
		dr.findElement(FirstName).sendKeys("ayushi");
	}
	public void surname(){
		dr.findElement(LastName).sendKeys("Ajmeraa");
	}
	
	public void emaiiladress(){
		dr.findElement(Emailaddresss).sendKeys("aushi34567@gmail.com");
	}
	
	public void emailaddressre(){
		dr.findElement(ReEnter).sendKeys("aushi34567@gmail.com");
	}
	public void signupPwd(){
		dr.findElement(NewPassword).sendKeys("bhfh@56673");
	}
	public void dayDrp(){
		
		Select Daydrrp=new Select(dr.findElement(DayDrp));
		Daydrrp.selectByIndex(8);
	}
	
	public void Monthdrrp(){
		Select Mnthdrpdwn=new Select(dr.findElement(DateDrp));
		Mnthdrpdwn.selectByVisibleText("Jun");
		
	}
	
	public void yrdrp(){
		Select Yeaardrpdwn=new Select(dr.findElement(YearDrp));
		Yeaardrpdwn.selectByValue("1994");
	}
	public void Bdaayhlp(){
		dr.findElement(bdayhelp).click();
	}
	
	public void Termlink(){
		dr.findElement(TermsLnk).click();
	}
	
	public void PrivacyLink(){
		dr.findElement(DPolicyLnk).click();
	}
	
	public void cookiesLink(){
		dr.findElement(CookieLnk).click();
	}
	
	public void malerdbtn(){
		dr.findElement(maleRdBtn).click();
	}
	
public void femalrdbtn(){
	dr.findElement(femaleRdBtn).click();
}
	
	public void sbmtbtn(){
		dr.findElement(signupbtn).click();
	}
	
	public void createaPage(){
		dr.findElement(createApage).click();
	}
	
	public void backpage(){
		dr.navigate().back();
	}
	
	public void screensht(){
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			org.apache.commons.io.FileUtils.copyFile(src, new File("C://Ayushi Revise//FirstTestNGProject//Screenshot//fbsignup.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closebrser(){
		dr.close();
	}

}
