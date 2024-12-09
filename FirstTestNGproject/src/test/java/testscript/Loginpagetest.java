package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Login_Page;

public class Loginpagetest extends Base {
  @Test
  @Parameters({"username","password"})
  public void verifyUserIsAbleToLoginValidCredenstials(String usrname,String pasword) throws AWTException {
	  Login_Page login=new Login_Page(driver);
	  login.enter_usernamefield(usrname);
	  login.password_field(pasword);
	  login.clicklogin();
	  boolean isHomepageisloaded=login.isDashBoardLoaded();
	  assertTrue(isHomepageisloaded,"Home page is not loaded when entering valid credentials");
	  
  }
  @DataProvider(name="credentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"carol","1q2w3e4r"},{"shefeena","shef111"}};
	  return data;
  }
  
  
  @Test(dataProvider = "credentials")
  public void userIsAbleToLoginWithDataProvider(String usrname,String pasword) throws Exception
  {
	  Login_Page login=new Login_Page(driver);
	  login.enter_usernamefield(usrname);
	  login.password_field(pasword);
	  login.clicklogin();
	  boolean isHomepageisloaded=login.isDashBoardLoaded();
	  assertTrue(isHomepageisloaded,"Home page is not loaded when entering valid credentials");  
	  
  }
}
