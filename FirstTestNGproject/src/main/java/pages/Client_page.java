package pages;

import java.awt.AWTException;
import java.awt.Robot;
//import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_page {
	public WebDriver driver;
	public Client_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//driver=new ChromeDriver();
		//driver.get("https://www.qabible.in/payrollapp/client/index");
	}
	@FindBy(id="loginform-username")WebElement username;
	@FindBy(id="loginform-password")WebElement password;
	@FindBy(xpath="//button[@name='login-button']")WebElement login;
	@FindBy(xpath="//a[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")WebElement clientsbutton;
	@FindBy(xpath="//input[@id='clientsearch-client_name']")WebElement clientname;
	@FindBy(xpath="//input[@id='clientsearch-id']")WebElement clientid;
	@FindBy(xpath="//button[text()='Search']")WebElement search;
	
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
		login.click();
		Robot robot=new Robot();  //here the need of robot class because of test case failure without setting the delay
		robot.delay(1000);
	}
	public void clickclientsButton()
	{
	clientsbutton.click();	
	}
	public void enter_clientname(String clientnamefield)
	{
		clientname.click();
		clientname.sendKeys(clientnamefield);
	}
	public void enter_clientid(String clientidfield)
	{
		clientid.click();
		clientid.sendKeys(clientidfield);
	}
	public void searchbutton() throws AWTException {
		
		search.click();
		Robot robot=new Robot();
			robot.delay(1000);
	}
	public boolean isSearchDetailsisDisplayed()
	{
		return search.isDisplayed();
	}
	
	

}
