package pomtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobbbjmodel.paageobjmdl;

public class TC_001_FB_Registration {
	
	WebDriver dr = new FirefoxDriver();
	
	paageobjmdl obj1=new paageobjmdl(dr);
	
	

@BeforeTest
public void OpenFb(){
	
	//obj1.browserOpen();
	obj1.clrcookies();
	obj1.URLOpen();
	obj1.maximize();
	obj1.title();
}
	@Test(priority=1)
	public void titlevrfy(){
		obj1.titleverify();
		
		Assert.assertEquals("Facebook", "Facebook");
		
	}

	@Test(priority=2)
	public void Urrl(){
		obj1.currentURl();
	}	
	

@Test(priority=3)
public void Reg(){
	obj1.fiirstname();
	obj1.surname();
	obj1.emaiiladress();
	obj1.emailaddressre();
	obj1.signupPwd();
	obj1.dayDrp();
	obj1.Monthdrrp();
	obj1.yrdrp();
	obj1.malerdbtn();
	obj1.sbmtbtn();
	obj1.explicitwaait();
	obj1.screensht();
	obj1.explicitwaait();
	obj1.backpage();
}





}
