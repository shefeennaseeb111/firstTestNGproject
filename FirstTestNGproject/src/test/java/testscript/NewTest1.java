package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
  @Test
  public void display() {
	  System.out.println("by");
  }
  @BeforeMethod                //methode used for launch
  public void beforeMethod() {
	  System.out.println("hai");
  }

  @AfterMethod						//methode used for quit
  public void afterMethod() {
	  System.out.println("helloo");
  }
  public void display1() {
	  System.out.println("by by");
  }

}
