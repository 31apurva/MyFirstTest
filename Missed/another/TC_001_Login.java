package pack.proj;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reporting.TestBase;



import com.browserint.Browserinit;
//import com.browserint.FirefoxBrowser;
import com.commonsteps.LoginRoblox;
import com.commonsteps.OpenRobloxURL;
import com.listeners.TestNG_List;

@Listeners(TestNG_List.class)
public class TC_001_Login extends TestBase {
WebDriver dr;
	@Test
	public void loggin() {
		LoginRoblox.login("usertest05", "hackproof");
		
		/*
		Browserinit.browseropen("Firefox");
		OpenRobloxURL url = new OpenRobloxURL("https://www.roblox.com/",dr);
		//OpenRobloxURL.URL("https://www.roblox.com/");
		//LoginRoblox.login("usertest05", "hackproof");
		*/
	}
}
