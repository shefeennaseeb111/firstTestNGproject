package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page  {
	public WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//initialize elements....for using annotation
		
	}
	@FindBy(id="loginform-username")WebElement username;
	@FindBy(id="loginform-password")WebElement password;
	@FindBy(xpath="//button[@name='login-button']")WebElement login;
	@FindBy(xpath="//a[text()='Dashboard']")WebElement dashboard;
	
	public void enter_usernamefield(String usernamefield)
	{
		username.sendKeys(usernamefield);
		
		
	}
	public void password_field(String passwordfield)
	{
	password.sendKeys(passwordfield);	
		
	}
	public void clicklogin() throws AWTException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		//Robot robot=new Robot();  //here the need of robot class because of test case failure without setting the delay
		//robot.delay(1000);
	}
	public boolean isDashBoardLoaded()
	{
		return dashboard.isDisplayed();
	}

}
