package gitpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GitPgm {
	public WebDriver driver;
	
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {

  System.setProperty("webdriver.chrome.driver","D:\\Testings tools\\Testing software\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("http://www.computechis.com/DemoSite/");
  }

  @AfterTest
  public void afterTest() {
  }

}
