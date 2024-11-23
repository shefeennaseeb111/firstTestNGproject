package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Login_Page;

public class Loginpagetest extends Base {
  @Test
  public void verifyUserIsAbleToLoginValidCredenstials() throws AWTException {
	  Login_Page login=new Login_Page(driver);
	  login.enter_usernamefield("carol");
	  login.password_field("1q2w3e4r");
	  login.clicklogin();
	  boolean isHomepageisloaded=login.isDashBoardLoaded();
	  assertTrue(isHomepageisloaded,"Home page is not loaded when entering valid credentials");
	  
  }
}
