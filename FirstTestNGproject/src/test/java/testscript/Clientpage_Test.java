package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Client_page;

public class Clientpage_Test extends Base {
  @Test
  public void verifytheUserisAbleToSearchTheClientDetails() throws AWTException 
  {
	  Client_page search=new Client_page(driver);
	  search.enter_usernamefield("carol");
	  search.password_field("1q2w3e4r");
	  search.clicklogin();
	  search.clickclientsButton();
	  search.enter_clientname("Sam");
	  search.enter_clientid("3");
	  search.searchbutton();
	  boolean isClientDetailsLoaded=search.isSearchDetailsisDisplayed();
	  assertTrue(isClientDetailsLoaded,"search item is not displayed");
  }
}

