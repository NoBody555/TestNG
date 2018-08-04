package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNGFile {
	public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	
	 String chrome="webdriver.chrome.driver";
	
    String driverPath = "C://Users//ccomp//Desktop//chromedriver.exe";
   
    
    public WebDriver driver ; 
	
	  @BeforeTest
      public void launchBrowser() {
          System.out.println("launching chrome browser"); 
          System.setProperty(chrome, driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}
