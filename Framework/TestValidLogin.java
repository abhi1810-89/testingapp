package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pomPAcckage.LoginPage;

public class TestValidLogin extends BaseTest
{ //one manual test case one testNG class in that class one test method
	@Test
	public void testValidLogin()
	{
		//enter username
		LoginPage l=new LoginPage(driver);
		String username = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		l.setUsername(username);
		//enter password
		String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		l.setPassword(password);
		//click on login button
		l.clickLogin();
	}
}
