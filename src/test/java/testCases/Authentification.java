package testCases;

import org.testng.annotations.Test;
import com.github.lkkushan101.jalenium.Jalenium;

public class Authentification {
	
	@Test

	public void testLogin() throws InterruptedException
	
	{
	    new Jalenium();
	    
	    Jalenium.Go( "https://opensource-demo.orangehrmlive.com/");
	    Jalenium.InteligentType("txtUsername", "Admin");
	    Jalenium.InteligentType("txtPassword", "admin123");
	    Jalenium.InteligentClick("btnLogin");
	    Jalenium.AssertElementText("xpath=//*[@id=\"welcome\"]", "Welcome Admin");
	    Jalenium.CloseBrowser();
	}

}
